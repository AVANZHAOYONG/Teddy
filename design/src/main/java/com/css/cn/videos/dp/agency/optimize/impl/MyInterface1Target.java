package com.css.cn.videos.dp.agency.optimize.impl;

import com.css.cn.videos.dp.agency.optimize.Interface1;

/**
　 * Sword基础技术平台项目 - 核心框架
　 * <p>com.css.cn.videos.dp.agency.optimize.impl</p>
　 * <p>Title: MyInterface1Target.java</p>
　 * <p>Description: @TODO </p>
　 * <p>Copyright: Copyright (c) 2020 中国软件与技术服务股份有限公司</p>
　 * <p>Company: 中国软件与技术服务股份有限公司</p>
　 * @author 赵勇
　 * @date 2020年7月8日 上午10:45:24
　 * @version 1.0
*/
public class MyInterface1Target implements Interface1 {

    private Interface1 inter1 ; 
    
    
    
    public MyInterface1Target(Interface1 inter1) {
        super();
        this.inter1 = inter1;
    }



    @Override
    public String doIt() {
        System.out.println("代理执行doIt开始");
        String doIt = inter1.doIt();
        System.out.println("代理执行doIt完成");
        return "代理" + doIt;
    }

}
