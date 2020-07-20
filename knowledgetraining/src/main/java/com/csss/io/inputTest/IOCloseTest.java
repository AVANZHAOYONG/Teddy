package com.csss.io.inputTest;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
　 * Sword基础技术平台项目 - 核心框架
　 * <p>com.csss.io.inputTest</p>
　 * <p>Title: IOCloseTest.java</p>
　 * <p>Description: 是否装饰器流关闭 流也跟着关闭了呢？ </p>
　 * <p>Copyright: Copyright (c) 2020 中国软件与技术服务股份有限公司</p>
　 * <p>Company: 中国软件与技术服务股份有限公司</p>
　 * @author 赵勇
　 * @date 2020年7月20日 上午11:35:09
　 * @version 1.0
*/
public class IOCloseTest {

    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        InputStream inputStream = null;
        InputStream bufferedInput = null;
        try {
            inputStream = new FileInputStream("E:\\学习视频\\安装包\\安装包.rar");
            bufferedInput = new BufferedInputStream(inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(bufferedInput!=null) {
                System.out.println("bufferedInput close ");
                try {
                    bufferedInput.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            
            if(inputStream!=null) {
                System.out.println("inputStream close ");
                try {
                    inputStream.close(); //其实已经是关闭的状态了
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        
    }
}
