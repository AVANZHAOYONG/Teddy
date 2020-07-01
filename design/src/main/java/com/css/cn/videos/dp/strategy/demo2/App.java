package com.css.cn.videos.dp.strategy.demo2;

import org.css.com.dp.strategy.demo2.entities.WildDuck;
import org.css.com.dp.strategy.demo2.behavior.fly.impl.MachineFly;
import org.css.com.dp.strategy.demo2.behavior.fly.impl.NoFlyBehavior;
import org.css.com.dp.strategy.demo2.behavior.fly.impl.WingFly;
import org.css.com.dp.strategy.demo2.behavior.quack.impl.GagaQuack;
import org.css.com.dp.strategy.demo2.behavior.quack.impl.TalkQuack;
import org.css.com.dp.strategy.demo2.entities.AbsDuck;
import org.css.com.dp.strategy.demo2.entities.Duck;
import org.css.com.dp.strategy.demo2.entities.RubberDuck;

/**
 * 变化来了  此时 有很多种飞的方法 和叫的方法。
 * 只需要让 不同的鸭子 设置不同的行为模式即可
 * @author wyx11
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		AbsDuck wildDuck = new WildDuck(new WingFly(), new GagaQuack());
		
		wildDuck.display();
		wildDuck.swim();
		wildDuck.quack();
		wildDuck.fly();
		
		AbsDuck duck = new RubberDuck(new NoFlyBehavior(), new TalkQuack());
		
		duck.display();
		duck.swim();
		duck.quack();
		duck.fly();
	}

}
