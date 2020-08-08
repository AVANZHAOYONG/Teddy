package org.jcoretechnology.com.firststamps.section3;

/**
　 * Sword基础技术平台项目 - 核心框架
　 * <p>org.jcoretechnology.com.firststamps.section3</p>
　 * <p>Title: StringTest.java</p>
　 * <p>Description: @TODO </p>
　 * <p>Copyright: Copyright (c) 2020 中国软件与技术服务股份有限公司</p>
　 * <p>Company: 中国软件与技术服务股份有限公司</p>
　 * @author 赵勇
　 * @date 2020年7月7日 下午11:47:54
　 * @version 1.0
*/
public class StringTest {
    /**
     * 代码点（Code Point）：在 Unicode 代码空间中的一个值，取值 0x0 至 0x10FFFF，代表一个字符。

    代码单元（Code Unit）：在具体编码形式中的最小单位。
    比如 UTF-16 中一个 code unit 为 16 bits，
    UTF-8 中一个 code unit 为 8 bits。
    一个 code point 可能由一个或多个 code unit(s) 
    表示。在 U+10000 之前的 code point 
    可以由一个 UTF-16 code unit 表示，
    U+10000 及之后的 code point 
    要由两个 UTF-16 code units 表示
    
    ——引用自@柳东原

     */
    /**
     * 码点：就是某个任意字符在Unicode编码表中对应的代码值

       代码单元：是在计算机中用来表示码点的，大部分码点只需要一个代码单元表示，
                           但是有一些是需要两个代码单元表示的。
     */
    public static void main(String[] args) {
        String word = "\uD835\uDD46";
        System.out.println(word); //
        String word2 = "abc𝕆";
        System.out.println(word2.length());//5
        System.out.println(word2.codePointCount(0, word2.length()));//4
        /**
         *  五个代码单元  实际是四个字符 
         *  是因为 length返回的是utf-16给定的代码单元数量。而实际的 String中有一个特殊字符需要两个代码单元表示
         *  codePointCount返会真正的String长度。
         */
        System.out.println(word2.charAt(3)); //charAt也是返回 n位置的代码单元
        
        int offsetByCodePoints = word2.offsetByCodePoints(0, 3);
        int codePointAt = word2.codePointAt(offsetByCodePoints);
        System.out.println(Integer.toHexString(codePointAt));
        
        int[] codePoints = word2.codePoints().toArray();
        String word2Copy = new String(codePoints, 0, codePoints.length);
        System.out.println(word2Copy);
        
    }

}
