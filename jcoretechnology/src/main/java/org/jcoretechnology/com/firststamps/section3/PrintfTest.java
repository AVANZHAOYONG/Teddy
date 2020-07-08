package org.jcoretechnology.com.firststamps.section3;

import java.util.Date;

/**
　 * Sword基础技术平台项目 - 核心框架
　 * <p>org.jcoretechnology.com.firststamps.section3</p>
　 * <p>Title: PrintfTest.java</p>
　 * <p>Description: 格式化输出 </p>
　 * <p>Copyright: Copyright (c) 2020 中国软件与技术服务股份有限公司</p>
　 * <p>Company: 中国软件与技术服务股份有限公司</p>
　 * @author 赵勇
　 * @date 2020年7月8日 下午9:51:08
　 * @version 1.0
*/
public class PrintfTest {
    
    public static void main(String[] args) {
        System.out.printf("%5.2f%n%%", 3.25,new Date());
        
        System.out.printf("%1$+,8.2f %2$tr", -3330.256, new Date());
        
        
        
    }

}
