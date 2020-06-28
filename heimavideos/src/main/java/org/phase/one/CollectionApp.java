package org.phase.one;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
　 * Sword基础技术平台项目 - 核心框架
　 * <p>org.phase.one</p>
　 * <p>Title: CollectionApp.java</p>
　 * <p>Description: @TODO </p>
　 * <p>Copyright: Copyright (c) 2020 中国软件与技术服务股份有限公司</p>
　 * <p>Company: 中国软件与技术服务股份有限公司</p>
　 * @author 赵勇
　 * @date 2020年6月17日 下午10:20:50
　 * @version 1.0
*/
public class CollectionApp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(4);
        
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        
        list.stream().map(new Function<String, Integer>() {

            @Override
            public Integer apply(String t) {
                return Integer.valueOf(t);
            }
        }).forEach(inttt ->{
            System.out.println(inttt);
        });
        
    }

}
