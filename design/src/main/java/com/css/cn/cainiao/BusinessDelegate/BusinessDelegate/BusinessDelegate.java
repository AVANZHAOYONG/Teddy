package com.css.cn.cainiao.BusinessDelegate.BusinessDelegate;

import com.css.cn.BusinessDelegate.BusinessService.BusinessService;
import com.css.cn.BusinessDelegate.lookupService.LookUpService;

public class BusinessDelegate {
	
	private BusinessService bs ;
	private String bsType;
	private LookUpService lus = new LookUpService();
	public BusinessDelegate(String bsType) {
		super();
		this.bsType = bsType;
	}
	
	public String  doTask() {
		bs = lus.getBusinessService(bsType);
		return bs.doAction();
	}

}
