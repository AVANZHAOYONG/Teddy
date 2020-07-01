package org.phase.one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Hello world!
 *
 */
public class App2 
{
    public static void main( String[] args )
    {
		/*
		 * String string = new String("abc"); String string2 = new String("abc");
		 * System.out.println(string.hashCode());
		 * System.out.println(string2.hashCode());
		 * 
		 * System.out.println("重地".hashCode()+"，"+"通话".hashCode());//巧合 这两个中文的hashcode
		 * 相同
		 */    	
//    	List<String> list = new ArrayList<String>();
//    	Collections.addAll(list, "a","b","c","d");
//    	System.out.println(list);
//    	Collections.shuffle(list);
//    	System.out.println(list);
    	
//    	String string = new String("abc");
    	String string = null;
    	
    	
    	String requireNonNull = Objects.requireNonNull(string);
    	
    }
}
