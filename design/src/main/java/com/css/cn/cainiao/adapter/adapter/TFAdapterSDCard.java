package com.css.cn.cainiao.adapter.adapter;

import com.css.cn.cainiao.adapter.sd.SDCard;
import com.css.cn.cainiao.adapter.tf.TFCard;

public class TFAdapterSDCard implements SDCard {
	
	private TFCard tf ;
	
	public TFAdapterSDCard(TFCard tf) {
		super();
		this.tf = tf;
	}

	@Override
	public String read() {
		return tf.read();
	}

	@Override
	public void write(String data) {
		this.tf.write(data);
	}

}
