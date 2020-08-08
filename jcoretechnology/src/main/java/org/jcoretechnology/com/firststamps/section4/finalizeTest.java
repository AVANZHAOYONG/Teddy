package org.jcoretechnology.com.firststamps.section4;

/**
　 * Sword基础技术平台项目 - 核心框架
　 * <p>org.jcoretechnology.com.firststamps.section4</p>
　 * <p>Title: finalizeTest.java</p>
　 * <p>Description: @TODO </p>
　 * <p>Copyright: Copyright (c) 2020 中国软件与技术服务股份有限公司</p>
　 * <p>Company: 中国软件与技术服务股份有限公司</p>
　 * @author 赵勇
　 * @date 2020年7月8日 下午11:05:35
　 * @version 1.0
*/
public class finalizeTest {
    
    public static void main(String[] args) {
        new finalizeTest();
        Runtime.getRuntime().addShutdownHook(new Thread( ()-> {
            System.out.println("shutdown 钩子");
        }));
    }
    
    
    /**
     * 垃圾回收之前调用法
     * 
     */
    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

}
