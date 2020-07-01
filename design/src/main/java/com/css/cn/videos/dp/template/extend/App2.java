package com.css.cn.videos.dp.template.extend;

public class App2 {
	
	public static void main(String[] args) {
		new CGameCooder().doPlay(new CGame() {
			
			@Override
			public void play() {
				System.out.println("打游戏");
				
			}
			
			@Override
			public void before() {
				System.out.println("准备开打");
				
			}
			
			@Override
			public void after() {
				System.out.println("游戏结束");
				
			}
		});
	}

}
