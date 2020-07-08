package org.jcoretechnology.com.firststamps.section3;

/**
　 * Sword基础技术平台项目 - 核心框架
　 * <p>org.jcoretechnology.com.firststamps.section3</p>
　 * <p>Title: BitOperation.java</p>
　 * <p>Description: 位运算 </p>
　 * <p>Copyright: Copyright (c) 2020 中国软件与技术服务股份有限公司</p>
　 * <p>Company: 中国软件与技术服务股份有限公司</p>
　 * @author 赵勇
　 * @date 2020年7月7日 下午11:16:27
　 * @version 1.0
*/
public class BitOperation {
    public static void main(String[] args) {
        /**
         * >>、<<符号位不动 相当于 除以 2 多少次方
         * 
         * >>> 忽略符号位（跟着动） 最高位补0；
         * 
         */
        System.out.println(-8 >> 3);
        
        System.out.println(-8 >>> 3);
    }

}
