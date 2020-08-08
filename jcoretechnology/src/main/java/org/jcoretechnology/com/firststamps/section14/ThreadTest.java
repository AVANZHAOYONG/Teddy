package org.jcoretechnology.com.firststamps.section14;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
　 * Sword基础技术平台项目 - 核心框架
　 * <p>org.jcoretechnology.com.firststamps.section14</p>
　 * <p>Title: ThreadTest.java</p>
　 * <p>Description: @TODO </p>
　 * <p>Copyright: Copyright (c) 2020 中国软件与技术服务股份有限公司</p>
　 * <p>Company: 中国软件与技术服务股份有限公司</p>
　 * @author 赵勇
　 * @date 2020年7月14日 下午8:28:52
　 * @version 1.0
*/
public class ThreadTest {
    public static void main(String[] args) {
        FutureTask<Integer> futureTask = new FutureTask<Integer>(new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                // TODO Auto-generated method stub
                return null;
            }
        });
        futureTask.cancel(false);
        futureTask.isCancelled();
        futureTask.isDone();
    }

}
