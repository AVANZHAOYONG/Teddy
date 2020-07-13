package org.jcoretechnology.com.firststamps.section6.lamada.compare;

import java.util.Arrays;
import java.util.Comparator;

/**
　 * Sword基础技术平台项目 - 核心框架
　 * <p>org.jcoretechnology.com.firststamps.section6.lamada.compare</p>
　 * <p>Title: ComparatorTest.java</p>
　 * <p>Description: @TODO </p>
　 * <p>Copyright: Copyright (c) 2020 中国软件与技术服务股份有限公司</p>
　 * <p>Company: 中国软件与技术服务股份有限公司</p>
　 * @author 赵勇
　 * @date 2020年7月12日 下午4:36:51
　 * @version 1.0
*/
public class ComparatorTest {
    private String name ;
    
    public ComparatorTest(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /**
     * 这块内容不太好理解  需要回顾java核心技术 6章 再谈comparator
     */

    public static void main(String[] args) {
        ComparatorTest[] comparators = {new ComparatorTest("d"), new ComparatorTest("a"), new ComparatorTest("c"), new ComparatorTest("b")};
        Arrays.sort(comparators, Comparator.comparing(ComparatorTest::getName));
        
        for (ComparatorTest comparatorTest : comparators) {
            System.out.println(comparatorTest.getName());
        }
    }
    
    
}
