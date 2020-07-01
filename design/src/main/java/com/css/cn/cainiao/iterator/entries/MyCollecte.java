package com.css.cn.cainiao.iterator.entries;

public class MyCollecte implements MCollections {
	
	private Object[] data ;
	private int index = 0;
	
	public MyCollecte(int length) {
		super();
		data = new Object[length];
	}

	public void add(Object obj) {
		data[index++] = obj;
	}
	
	
	@Override
	public IteratorArray getIterator() {
		return new NameIterator();
	}

	
	private class NameIterator implements IteratorArray {

		int itIndex = 0;
		
		public NameIterator() {
			super();
		}

		@Override
		public boolean hasNext() {
			return itIndex < index;
		}

		@Override
		public Object next() {
			if(hasNext()) {
				return data[itIndex++];
			}
			return null;
		}

	}
}
