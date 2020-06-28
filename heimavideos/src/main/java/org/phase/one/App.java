package org.phase.one;

import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        String[] avg1 = new String[100];
//        String[] avg2 = new String[]{"a", "b", "c", "d", "e"};
//        
//        System.arraycopy(avg2, 0, avg1, 10, 3);
//        
//        for (int i = 0; i < avg1.length; i++) {
//            System.out.println(avg1[i]);
//        }
        
//        List<String> list = new ArrayList<String>();
//        
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add("d");
//        
//        Collections.shuffle(list);
//        
//        System.out.println(list);

            Set<Object> set = new HashSet<>();
            set.add(new App("abc"));
            set.add(new App("123"));
            System.out.println(set);
         
    }
    
    private String value ;

    public App(String value) {
        super();
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return 1 ;
    }

    @Override
    public String toString() {
        return "phare-one";
    }

    @Override
    public boolean equals(Object obj) {
        return true ;
    }
    
    
    
    
    
}
