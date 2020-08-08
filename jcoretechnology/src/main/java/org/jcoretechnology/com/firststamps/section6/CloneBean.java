package org.jcoretechnology.com.firststamps.section6;

import java.util.Date;

/**
　 * Sword基础技术平台项目 - 核心框架
　 * <p>org.jcoretechnology.com.firststamps.section6</p>
　 * <p>Title: CloneBean.java</p>
　 * <p>Description: @TODO </p>
　 * <p>Copyright: Copyright (c) 2020 中国软件与技术服务股份有限公司</p>
　 * <p>Company: 中国软件与技术服务股份有限公司</p>
　 * @author 赵勇
　 * @date 2020年7月10日 下午8:57:27
　 * @version 1.0
*/
public class CloneBean implements Cloneable {
    
    private Date date = new Date();

    @Override
    public String toString() {
        return "CloneBean [date=" + date + "]";
    }

    
    
    public Date getDate() {
        return date;
    }



    public void setDate(Date date) {
        this.date = date;
    }



    @Override
    public CloneBean clone() throws CloneNotSupportedException {
        CloneBean clone = (CloneBean)super.clone();
        clone.setDate(new Date(this.getDate().getTime()));
        return clone;
    }

}
