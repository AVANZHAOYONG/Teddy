package com.css.cn.videos.dp.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class Car implements Cloneable,Serializable {
	
	/**
	 * 反序列化时 在内存中 serialVersionUID不变，类改变时会重新生成serialVersionUID。所以报错 ，直接固定写死即可 
	 */
	private static final long serialVersionUID = 1L;
	//车名
	private String name ; 
	//价格
	private double price;
	//生产日期
	private Date productDate ; 
	//出售日期
	private Date saleDate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getProductDate() {
		return productDate;
	}
	public void setProductDate(Date productDate) {
		this.productDate = productDate;
	}
	public Date getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}
	
	
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + ", productDate=" + productDate + ", saleDate=" + saleDate
				+ "]";
	}
	@Override
	public Object clone() {
		Object carCopy = null;
		byte[] byteArray = serializeObject(this);
		
		carCopy = (Car)deserializationObject(byteArray);
		
		return carCopy;
	}
	
	private Object deserializationObject(byte[] byteArray) {
		ByteArrayInputStream byteArrayInputStream = null;
		ObjectInputStream objectInputStream = null;
		Object obj = null;
		try {
			byteArrayInputStream = new ByteArrayInputStream(byteArray);
			objectInputStream = new ObjectInputStream(byteArrayInputStream);
			obj = objectInputStream.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(objectInputStream!=null) {
				try {
					objectInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(byteArrayInputStream!=null) {
				try {
					byteArrayInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return obj;
	}
	private byte[] serializeObject(Object obj){
		ByteArrayOutputStream byteArrayOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		byte[] byteArray = null;
		try {
			byteArrayOutputStream = new ByteArrayOutputStream();
			objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
			objectOutputStream.writeObject(obj);
			byteArray = byteArrayOutputStream.toByteArray();
		}catch (IOException e) {
			
		}finally {
			if(objectOutputStream != null) {
				try {
					objectOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(byteArrayOutputStream!=null) {
				try {
					byteArrayOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return byteArray;
	}

}
