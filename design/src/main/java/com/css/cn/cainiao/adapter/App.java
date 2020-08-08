package com.css.cn.cainiao.adapter;

import com.css.cn.cainiao.adapter.adapter.TFAdapterSDCard;
import com.css.cn.cainiao.adapter.computer.Computer;
import com.css.cn.cainiao.adapter.computer.MacBook;
import com.css.cn.cainiao.adapter.sd.SDCard;
import com.css.cn.cainiao.adapter.sd.SDCardImpl;
import com.css.cn.cainiao.adapter.tf.TFCard;
import com.css.cn.cainiao.adapter.tf.TFCardImpl;

public class App {
	public static void main(String[] args) {
		Computer macBook = new MacBook();
		SDCard sdCard = new SDCardImpl();
		
		macBook.writeToSD(sdCard, "乱七八糟");
		String readFromSD = macBook.readFromSD(sdCard);
		System.out.println(readFromSD);
		
		System.out.println("-------------------");
		TFCard tfCardImpl = new TFCardImpl();
		SDCard adapterSDCard = new TFAdapterSDCard(tfCardImpl);
		
		macBook.writeToSD(adapterSDCard, "一心一意");
		String readFromSD2 = macBook.readFromSD(adapterSDCard);
		System.out.println(readFromSD2);
	}

}
