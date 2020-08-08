package com.csss.io.inputTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
　 * Sword基础技术平台项目 - 核心框架
　 * <p>com.csss.io.inputTest</p>
　 * <p>Title: InputTest.java</p>
　 * <p>Description: 读取两个G的文件，观察内存是否变换，以此来判断在创建input的时候 是否就将文件加载到内存？ </p>
　 * <p>Copyright: Copyright (c) 2020 中国软件与技术服务股份有限公司</p>
　 * <p>Company: 中国软件与技术服务股份有限公司</p>
　 * @author 赵勇
　 * @date 2020年7月20日 上午9:43:44
　 * @version 1.0
*/
public class InputTest {

    public static void main(String[] args) throws FileNotFoundException, IOException  {
        test1();
    }
    
    private static void  test1() {
        try(InputStream inputStream = new FileInputStream("E:\\学习视频\\安装包\\安装包.rar");OutputStream outputStream = new FileOutputStream("E:\\学习视频\\安装包\\安装包1.rar")) {
            int read = 0;
            while (read != -1) {
                byte[] buffer = new byte[1024];
                read = inputStream.read(buffer);
                outputStream.write(buffer);
            }
//            inputStream.reset();
//            inputStream.mark(readlimit);
            // 读写流不会 直接 加载到内存 而是读的文件加载到内存
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    
    }
    
}
