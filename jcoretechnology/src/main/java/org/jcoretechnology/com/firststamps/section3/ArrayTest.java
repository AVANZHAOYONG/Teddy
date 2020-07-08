package org.jcoretechnology.com.firststamps.section3;

import java.util.Arrays;

/**
　 * Sword基础技术平台项目 - 核心框架
　 * <p>org.jcoretechnology.com.firststamps.section3</p>
　 * <p>Title: ArrayTest.java</p>
　 * <p>Description: @TODO </p>
　 * <p>Copyright: Copyright (c) 2020 中国软件与技术服务股份有限公司</p>
　 * <p>Company: 中国软件与技术服务股份有限公司</p>
　 * @author 赵勇
　 * @date 2020年7月8日 下午10:22:56
　 * @version 1.0
*/
public class ArrayTest {

     public static void main(String[] args) {
        int[] intA = {1,2,3,4};
        for (int i : intA) {
            System.out.println(i);
        }
        int[] intB = Arrays.copyOf(intA, intA.length);
        System.out.println(Arrays.toString(intB));
    }
}
