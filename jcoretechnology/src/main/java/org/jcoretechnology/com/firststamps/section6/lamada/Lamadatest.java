package org.jcoretechnology.com.firststamps.section6.lamada;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

/**
　 * Sword基础技术平台项目 - 核心框架
　 * <p>org.jcoretechnology.com.firststamps.section6</p>
　 * <p>Title: Lamadatest.java</p>
　 * <p>Description: @TODO </p>
　 * <p>Copyright: Copyright (c) 2020 中国软件与技术服务股份有限公司</p>
　 * <p>Company: 中国软件与技术服务股份有限公司</p>
　 * @author 赵勇
　 * @date 2020年7月10日 下午9:15:56
　 * @version 1.0
*/
public class Lamadatest {
    private String name ;
    
    
    
    public Lamadatest(String name) {
        super();
        this.name = name;
    }
    public Lamadatest() {
        super();
    }

    


    public String getName() {
        return name;
    }
    public static void main(String[] args) {
        Function<String, Integer> fun1 = t -> {
            return t.codePointCount(0, t.length());
        };
        
        Function<String, Integer> fun2 = t -> t.codePointCount(0, t.length());
        
        Lamadatest test= new Lamadatest();
        
        Function<String, Integer> fun3 = test::changeId;
        Function<String, Integer> fun4 = Lamadatest::buidId;
        BiFunction<Lamadatest, String, Integer> fun5 = Lamadatest::changeId;
        
        Function<String, Lamadatest> fun6 = Lamadatest::new;
        Function<Integer, int[]> fun7 = int[]::new;
        /**
         * 和内部类一样 lamada表达式同样不能使用 非final 外部变量。线程安全问题。
         * 在lamada中 this 含义不变
         */
        Lamadatest[] tests = {new Lamadatest("c"), new Lamadatest("e"), new Lamadatest("a")};
        Arrays.sort(tests, Lamadatest::compare);
        
        
        for (Lamadatest lamadatest : tests) {
            System.out.println(lamadatest);
        }
        
        
        
        
    }
    
    
    
    public static Integer buidId(String arg) {
        return arg.codePointCount(0, arg.length());
    }
    
    public Integer changeId(String id) {
        return Integer.valueOf(id);
    }
    
    public int compare(Object other) {
        Objects.isNull(other);
        return name.compareTo(((Lamadatest)other).getName());
    }
    @Override
    public String toString() {
        return "Lamadatest [name=" + name + "]";
    }


    
    
}
