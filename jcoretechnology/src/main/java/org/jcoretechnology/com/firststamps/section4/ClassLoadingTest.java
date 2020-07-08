package org.jcoretechnology.com.firststamps.section4;

/**
　 * Sword基础技术平台项目 - 核心框架
　 * <p>org.jcoretechnology.com.firststamps.section4</p>
　 * <p>Title: ClassLoadingTest.java</p>
　 * <p>Description: @TODO </p>
　 * <p>Copyright: Copyright (c) 2020 中国软件与技术服务股份有限公司</p>
　 * <p>Company: 中国软件与技术服务股份有限公司</p>
　 * @author 赵勇
　 * @date 2020年7月8日 下午10:47:43
　 * @version 1.0
*/
public class ClassLoadingTest {
    public static String getStaticValues() {
        return "section=" + section + ", sectionName=" + sectionName + ", sPrice=" + sPrice;
    }
    private static int section = 4 ; 
    private static String sectionName;
    
    private int sAge ;
    
    {
        sAge = 10;
    }

    static {
        sectionName = "section4";
    }
    private String sName = "a" ;
    
    private static double sPrice = 12.5;
    
    public ClassLoadingTest(String sName) {
        super();
        this.sName = sName;
    }

    @Override
    public String toString() {
        return "ClassLoadingTest [" + getStaticValues() + ",sAge=" + sAge + ", sName=" + sName + "]";
    }

}
