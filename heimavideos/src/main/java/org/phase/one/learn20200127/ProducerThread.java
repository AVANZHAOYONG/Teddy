package org.phase.one.learn20200127;

public class ProducerThread implements Runnable{
	private Cargo cargo;
	
	

	ProducerThread(Cargo cargo) {
		super();
		this.cargo = cargo;
	}



	@Override
	public void run() {
		while(true) {
			synchronized (cargo) {
				if(cargo.isFlag()) {//有的话  生产者等待 
					try {
						cargo.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println("生产包子");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				cargo.setFlag(true);
				
				cargo.notify();
				
				
			}
		}
		
	}

}
