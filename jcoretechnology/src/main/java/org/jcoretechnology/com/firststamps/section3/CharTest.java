package org.jcoretechnology.com.firststamps.section3;

/**
　 * Sword基础技术平台项目 - 核心框架
　 * <p>org.jcoretechnology.com.firststamps.section3</p>
　 * <p>Title: CharTest.java</p>
　 * <p>Description: char类型大小 它太底层了 不推荐使用 </p>
　 * <p>Copyright: Copyright (c) 2020 中国软件与技术服务股份有限公司</p>
　 * <p>Company: 中国软件与技术服务股份有限公司</p>
　 * @author 赵勇
　 * @date 2020年7月7日 下午11:28:27
　 * @version 1.0
*/
public class CharTest {
    public static void main(String[] args) {
        char c = (char)Integer.MAX_VALUE;
        System.out.println((int)c);
        //65535 一般为两个字节 但是 Unicode/GBK： 中文2字节
//        UTF-8： 中文通常3字节，在拓展B区之后的是4字节
    }

}
