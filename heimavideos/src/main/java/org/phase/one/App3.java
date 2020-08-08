package org.phase.one;

import org.phase.one.Interface.AbsTetst;
import org.phase.one.Interface.TetstImpl;

/**
 * Hello world!
 *
 */
public class App3
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
