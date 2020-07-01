package org.phase.one.learn20200123.Ddz;

import java.util.Collection;
import java.util.List;
import java.util.Set;


/**
 * 总牌数
 * 洗牌
 * 发牌
 * 看牌
 * @author wyx11
 *
 */
public interface play {
	
	List<String> getAllBoard();
	
	void changeBoard(List<String> boards);
	
	void deal(List<String> boards, Set<String> p1, Set<String> p2, Set<String> p3 , Set<String> button);
	
	void watchPlayer(List<Collection<String>> players, Set<String> button);
	
}
