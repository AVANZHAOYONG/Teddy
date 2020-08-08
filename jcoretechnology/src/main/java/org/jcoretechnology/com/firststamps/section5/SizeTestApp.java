package org.jcoretechnology.com.firststamps.section5;

/**
　 * Sword基础技术平台项目 - 核心框架
　 * <p>org.jcoretechnology.com.firststamps.section5</p>
　 * <p>Title: SizeTestApp.java</p>
　 * <p>Description: @TODO </p>
　 * <p>Copyright: Copyright (c) 2020 中国软件与技术服务股份有限公司</p>
　 * <p>Company: 中国软件与技术服务股份有限公司</p>
　 * @author 赵勇
　 * @date 2020年7月8日 下午11:51:05
　 * @version 1.0
*/
public class SizeTestApp {
    public static void main(String[] args) {
        System.out.println(Size.LARGE==Enum.valueOf(Size.class, "LARGE"));
        System.out.println(Size.LARGE.toString());

        int ordinal = Size.values()[1].ordinal();
        System.out.println(ordinal);
        System.out.println(Size.SMALL.getV());
        
    }

}
