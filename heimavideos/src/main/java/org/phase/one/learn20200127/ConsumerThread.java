package org.phase.one.learn20200127;

public class ConsumerThread implements Runnable {
	private Cargo cargo;
	

	ConsumerThread(Cargo cargo) {
		super();
		this.cargo = cargo;
	}


	@Override
	public void run() {
		while (true) {
			synchronized (cargo) {
				if(!cargo.isFlag()) {//不存在  消费者等待
					try {
						cargo.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println("消费包子");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				cargo.setFlag(false);
				cargo.notify();
				
			}
			
		}
		
	}

}
