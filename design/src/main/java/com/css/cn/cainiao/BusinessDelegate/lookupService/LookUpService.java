package com.css.cn.cainiao.BusinessDelegate.lookupService;

import com.css.cn.cainiao.BusinessDelegate.BusinessService.BusinessService;
import com.css.cn.cainiao.BusinessDelegate.BusinessService.EjbService;
import com.css.cn.cainiao.BusinessDelegate.BusinessService.JmsService;

public class LookUpService {
	
	public BusinessService getBusinessService(String serviceType) {
		if("EJB".equals(serviceType)) {
			return new EjbService();
		}else {
			return new JmsService();
		}
	}

}
