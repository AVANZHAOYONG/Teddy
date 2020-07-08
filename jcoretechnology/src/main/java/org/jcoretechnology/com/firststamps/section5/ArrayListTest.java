package org.jcoretechnology.com.firststamps.section5;

import java.util.ArrayList;
import java.util.List;

/**
　 * Sword基础技术平台项目 - 核心框架
　 * <p>org.jcoretechnology.com.firststamps.section5</p>
　 * <p>Title: ArrayListTest.java</p>
　 * <p>Description: @TODO </p>
　 * <p>Copyright: Copyright (c) 2020 中国软件与技术服务股份有限公司</p>
　 * <p>Company: 中国软件与技术服务股份有限公司</p>
　 * @author 赵勇
　 * @date 2020年7月8日 下午11:42:09
　 * @version 1.0
*/
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(100);
        list.add("a");
        list.add("b");
        list.add("c");
        list.ensureCapacity(10);
        list.trimToSize();
        System.out.println(list.size());
    }

}
