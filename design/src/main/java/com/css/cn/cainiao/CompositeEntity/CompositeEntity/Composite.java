package com.css.cn.cainiao.CompositeEntity.CompositeEntity;

import com.css.cn.cainiao.CompositeEntity.CoarseGrained.CoarseGrained;

public class Composite {
	private CoarseGrained coa = new CoarseGrained();

	public void setData(String obj1, String obj2) {
		coa.setData(obj1, obj2);
	}
	
	public String[] getData() {
		return coa.getData();
	}

}
