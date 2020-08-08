package com.css.cn.videos.dp.agency.optimize.impl;

import com.css.cn.videos.dp.agency.optimize.Interface1;
import com.css.cn.videos.dp.agency.optimize.Interface2;

/**
　 * Sword基础技术平台项目 - 核心框架
　 * <p>com.css.cn.videos.dp.agency.optimize.impl</p>
　 * <p>Title: MyTarget.java</p>
　 * <p>Description: @TODO </p>
　 * <p>Copyright: Copyright (c) 2020 中国软件与技术服务股份有限公司</p>
　 * <p>Company: 中国软件与技术服务股份有限公司</p>
　 * @author 赵勇
　 * @date 2020年7月8日 上午10:38:10
　 * @version 1.0
*/
public class MyInterface1Proxy implements Interface1,Interface2 {

    /* (non-Javadoc)
    * <p>Title: eatIt</p>
    * <p>Description: @TODO</p>
    * @see com.css.cn.videos.dp.agency.optimize.Interface2#eatIt()
    */
    @Override
    public void eatIt() {
        System.out.println("This is eatIt");
        return ;
    }

    /* (non-Javadoc)
    * <p>Title: doIt</p>
    * <p>Description: @TODO</p>
    * @return
    * @see com.css.cn.videos.dp.agency.optimize.Interface1#doIt()
    */
    @Override
    public String doIt() {
        System.out.println("This is doIt");
        return "doIt";
    }

}
