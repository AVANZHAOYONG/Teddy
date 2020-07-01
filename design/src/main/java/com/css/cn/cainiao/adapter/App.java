package com.css.cn.cainiao.adapter;

import com.css.cn.adapter.adapter.TFAdapterSDCard;
import com.css.cn.adapter.computer.Computer;
import com.css.cn.adapter.computer.MacBook;
import com.css.cn.adapter.sd.SDCard;
import com.css.cn.adapter.sd.SDCardImpl;
import com.css.cn.adapter.tf.TFCard;
import com.css.cn.adapter.tf.TFCardImpl;

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
