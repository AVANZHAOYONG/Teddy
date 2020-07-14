package org.jcoretechnology.com.firststamps.section14;

/**
　 * Sword基础技术平台项目 - 核心框架
　 * <p>org.jcoretechnology.com.firststamps.section13</p>
　 * <p>Title: ThreadGroupTest.java</p>
　 * <p>Description: @TODO </p>
　 * <p>Copyright: Copyright (c) 2020 中国软件与技术服务股份有限公司</p>
　 * <p>Company: 中国软件与技术服务股份有限公司</p>
　 * @author 赵勇
　 * @date 2020年7月12日 下午11:19:54
　 * @version 1.0
*/
public class ThreadGroupTest {
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("112");
        
        Thread thread = new Thread(threadGroup, () ->{
            System.out.println("hello");
            System.out.println(1/0);
        });
//        thread.setUncaughtExceptionHandler(ThreadGroupTest::ttt);
//        Thread.setDefaultUncaughtExceptionHandler(ThreadGroupTest::eee);
        thread.start();
    }

    private static void ttt(Thread t, Throwable e) {
        System.out.println("thread : " + t.getName() + ",throws:" + e.getMessage());
    }
    private static void eee(Thread t, Throwable e) {
        System.out.println("thread eee : " + t.getName() + ",throws:" + e.getMessage());
    }
    
}
