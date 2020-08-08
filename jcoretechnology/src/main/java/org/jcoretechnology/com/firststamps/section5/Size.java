package org.jcoretechnology.com.firststamps.section5;

/**
　 * Sword基础技术平台项目 - 核心框架
　 * <p>org.jcoretechnology.com.firststamps.section5</p>
　 * <p>Title: Size.java</p>
　 * <p>Description: @TODO </p>
　 * <p>Copyright: Copyright (c) 2020 中国软件与技术服务股份有限公司</p>
　 * <p>Company: 中国软件与技术服务股份有限公司</p>
　 * @author 赵勇
　 * @date 2020年7月8日 下午11:48:10
　 * @version 1.0
*/
public enum Size {
    SMALL("s"),LARGE("l");
    
    private String v ;
    private Size(String v) {
        this.v = v;
    }

    public String getV() {
        return v;
    }
}
