package com.css.cn.cainiao.CompositeEntity.CoarseGrained;

import com.css.cn.cainiao.CompositeEntity.dependent.DependentObj1;
import com.css.cn.cainiao.CompositeEntity.dependent.DependentObj2;

/**
 * 粗粒度实体类
 * @author wyx11
 *
 */
public class CoarseGrained {
	private DependentObj1 obj1 = new DependentObj1() ;
	private DependentObj2 obj2 = new DependentObj2() ;
	
	public void setData(String data1, String data2) {
		this.obj1.setData(data1);
		this.obj2.setData(data2);
	}
	
	public String[] getData() {
		return new String[] {obj1.getData(),obj2.getData()};
	}
	

}
