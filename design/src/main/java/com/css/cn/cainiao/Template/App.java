package com.css.cn.cainiao.Template;

public class App {
	
	public static void main(String[] args) {
//		test1();
		test2();
	}

	private static void test2() {
		new Game() {
			
			@Override
			public void start() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void end() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void doGame() {
				// TODO Auto-generated method stub
				
			}
		};
		
	}

	private static void test1() {
		Game footBall = new FootBall();
		footBall.play();
		
		Game lol = new LolGame();
		lol.play();
	}
	
	

}
