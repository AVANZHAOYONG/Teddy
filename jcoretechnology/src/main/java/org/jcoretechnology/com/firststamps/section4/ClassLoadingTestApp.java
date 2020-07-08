package org.jcoretechnology.com.firststamps.section4;

/**
　 * Sword基础技术平台项目 - 核心框架
　 * <p>org.jcoretechnology.com.firststamps.section4</p>
　 * <p>Title: ClassLoadingTestApp.java</p>
　 * <p>Description: @TODO </p>
　 * <p>Copyright: Copyright (c) 2020 中国软件与技术服务股份有限公司</p>
　 * <p>Company: 中国软件与技术服务股份有限公司</p>
　 * @author 赵勇
　 * @date 2020年7月8日 下午10:55:47
　 * @version 1.0
*/
public class ClassLoadingTestApp {
    public static void main(String[] args) {
        System.out.println(ClassLoadingTest.getStaticValues());
        System.out.println(new ClassLoadingTest("zhao"));
    }

}
