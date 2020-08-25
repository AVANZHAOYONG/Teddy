package org.jcoretechnology.com.secondstamps.section2;

import java.io.File;
import java.io.ObjectOutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;

/**
　 * Sword基础技术平台项目 - 核心框架
　 * <p>org.jcoretechnology.com.secondstamps.section2</p>
　 * <p>Title: IOTest.java</p>
　 * <p>Description: @TODO </p>
　 * <p>Copyright: Copyright (c) 2020 中国软件与技术服务股份有限公司</p>
　 * <p>Company: 中国软件与技术服务股份有限公司</p>
　 * @author 赵勇
　 * @date 2020年8月15日 下午3:38:26
　 * @version 1.0
*/
public class IOTest {
    
    private static final Charset charset = Charset.forName("utf8");
    private static final Charset utf8 = StandardCharsets.UTF_8;

    public static void main(String[] args) {
        /**
         * io流 默认是通过相对路径的 也就是 下面这个路径就是io流执行的 路径的前缀
         */
        System.out.println(System.getProperty("user.dir"));
        System.out.println(File.separator);
        /**
         * 系统的换行符 \r\n
         */
        System.out.println(System.getProperty("line.separator"));
        
//        new ObjectOutputStream(null).defaultWriteObject();
//        Paths.get(first, more)
    }
}
