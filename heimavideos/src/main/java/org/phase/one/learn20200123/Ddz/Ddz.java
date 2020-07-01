package org.phase.one.learn20200123.Ddz;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Ddz {
	public static void main(String[] args) {
		play play = new play() {
			
			@Override
			public void watchPlayer(List<Collection<String>> players, Set<String> button) {
				System.out.println("底牌为:"+button);
				
				System.out.println("玩家牌如下"+players);
				
			}
			
			@Override
			public List<String> getAllBoard() {
				List<String> list = new LinkedList<String>();
				for (int i = 0; i < 13; i++) {
					for (String typ : new String[]{"黑","红","花","片"}) {
						list.add(typ+i);
					}
				}
				list.add("大王");
				list.add("小王");
				return list;
			}
			
			@Override
			public void deal(List<String> boards, Set<String> p1, Set<String> p2, Set<String> p3, Set<String> button) {
				for (int i = 0; i < boards.size(); i++) {
					int whos = i%3;
					if(i>50) {
						button.add(boards.get(i));
					}else if(whos == 0) {
						p1.add(boards.get(i));
					}else if(whos == 1) {
						p2.add(boards.get(i));
					}else {
						p3.add(boards.get(i));
					}
				}
			}
			
			@Override
			public void changeBoard(List<String> boards) {
				Collections.shuffle(boards);
			}
		};
		Ddz.excute(play);
		
	}
	
	public static void excute(play py) {
		List<String> allBoard = py.getAllBoard();
		py.changeBoard(allBoard);
		Set<String> p1 = new LinkedHashSet<String>(17);
		Set<String> p2 = new LinkedHashSet<String>(17);
		Set<String> p3 = new LinkedHashSet<String>(17);
		Set<String> button = new LinkedHashSet<String>(3);
		py.deal(allBoard, p1, p2, p3, button);
		List<Collection<String>> players = new ArrayList<Collection<String>>();
		players.add(p1);
		players.add(p2);
		players.add(p3);
		py.watchPlayer(players, button);
	}

}
