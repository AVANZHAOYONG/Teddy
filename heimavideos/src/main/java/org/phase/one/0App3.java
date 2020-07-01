package org.phase.one;

import com.css.sword.core.learn.phaseOne.Interface.AbsTetst;
import com.css.sword.core.learn.phaseOne.Interface.Inter;
import com.css.sword.core.learn.phaseOne.Interface.TetstImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	Inter inter = new Inter() {
//		};
//		System.out.println(inter.mytest());
    	AbsTetst impl = new TetstImpl();
    	System.out.println(impl.name);
    	impl.test1();
    	
    }
    
}
