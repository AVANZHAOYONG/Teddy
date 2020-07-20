package com.csss.io.inputTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
　 * Sword基础技术平台项目 - 核心框架
　 * <p>com.csss.io.inputTest</p>
　 * <p>Title: IOCloseTryTest.java</p>
　 * <p>Description: 如果 try带资源 关闭 异常 会怎样？ </p>
　 * <p>Copyright: Copyright (c) 2020 中国软件与技术服务股份有限公司</p>
　 * <p>Company: 中国软件与技术服务股份有限公司</p>
　 * @author 赵勇
　 * @date 2020年7月20日 上午11:42:24
　 * @version 1.0
*/
public class IOCloseTryTest {

    public static void main(String[] args) {
        Test1();
    }

    private static void Test1() {
        try(InputStream inputStream = new FileInputStream("E:\\学习视频\\安装包\\安装包.rar") {
            @Override
            public void close() throws IOException {
                super.close();
                throw new IOException("wocuole");
            }
        };) {

            System.out.println("关闭会怎样？");
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        
    }
     //还是会报错呀 能怎样？
    

}
