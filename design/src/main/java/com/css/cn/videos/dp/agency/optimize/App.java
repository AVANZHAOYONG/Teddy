package com.css.cn.videos.dp.agency.optimize;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.css.cn.videos.dp.agency.optimize.impl.MyInterface1Target;
import com.css.cn.videos.dp.agency.optimize.impl.MyInterface1Proxy;

/**
　 * Sword基础技术平台项目 - 核心框架
　 * <p>com.css.cn.videos.dp.agency.optimize</p>
　 * <p>Title: App.java</p>
　 * <p>Description: 优化过的动态代理 代理类只做一部分的功能其他功能（接口）还按照原来的target类方法执行 </p>
　 * <p>Copyright: Copyright (c) 2020 中国软件与技术服务股份有限公司</p>
　 * <p>Company: 中国软件与技术服务股份有限公司</p>
　 * @author 赵勇
　 * @date 2020年7月8日 上午10:39:33
　 * @version 1.0
*/
public class App {
    public static void main(String[] args) {
        Object target = new MyInterface1Proxy();
        MyInterface1Target myInterface1Target = new MyInterface1Target((Interface1)target);
        Object newProxyInstance = Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                target.getClass().getInterfaces(),
                (proxy, method, args1) -> test(myInterface1Target,
                        method,
                        args1,
                        target)
                );
        Interface1 inter1 = (Interface1)newProxyInstance;
        inter1.doIt();
        
        Interface2 inter2 = (Interface2)newProxyInstance;
        inter2.eatIt();
        
        
    }

    private static Object test(MyInterface1Target proxy, Method method, Object[] args, Object target) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        
        Method m = searchMethod(proxy.getClass(), method.getName(), method.getParameterTypes());
        
        if (null != m) {
            return m.invoke(proxy, args);
        } else {
            boolean oldAccessible = method.isAccessible();
            try {
                method.setAccessible(true);
                return method.invoke(target, args);
            } finally {
                method.setAccessible(oldAccessible);
            }
        }
    }
    
    private static Method searchMethod(Class<?> clazz, String methodName, Class<?>... parameterTypes) {
        try {
            return clazz.getDeclaredMethod(methodName, parameterTypes);
        } catch (NoSuchMethodException | SecurityException e) {
            if(clazz.getSuperclass()!=null) {
                return searchMethod(clazz.getSuperclass(), methodName, parameterTypes);
            }
            return null;
        }
    }
    
}
