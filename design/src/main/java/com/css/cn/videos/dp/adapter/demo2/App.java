package com.css.cn.videos.dp.adapter.demo2;

import com.css.cn.videos.dp.adapter.demo2.adapter.MyAdapter;
import com.css.cn.videos.dp.adapter.demo2.entities.LowerProgram;
import com.css.cn.videos.dp.adapter.demo2.entities.Program;
import com.css.cn.videos.dp.adapter.demo2.entities.UpperProgram;
import com.css.cn.videos.dp.adapter.demo2.immutableCode.Filter;
import com.css.cn.videos.dp.adapter.demo2.immutableCode.HandleFilter;
import com.css.cn.videos.dp.adapter.demo2.immutableCode.MyEntities;
import com.css.cn.videos.dp.adapter.demo2.utils.ProgramUtils;

public class App {
	
	public static void main(String[] args) {
		Test1();
		Test2();
	}

	/**
	 * 希望将老代码 通过适配器 可以执行
	 */
	private static void Test2() {
		MyEntities myEntities = new MyEntities();
		Filter filter = new HandleFilter();
		MyAdapter myAdapter = new MyAdapter(filter);
		String dealString = ProgramUtils.dealString(myAdapter, myEntities);
		
		System.out.println(dealString);
		
		
	}

	/**
	 * 正常用法
	 */
	private static void Test1() {
		String str = "How are you ?";
		Program program1 = new UpperProgram();
		String result1 = ProgramUtils.dealString(program1, str);
		System.out.println(result1);
		Program program2 = new LowerProgram();
		String result2 = ProgramUtils.dealString(program2, str);
		System.out.println(result2);
	}

}
