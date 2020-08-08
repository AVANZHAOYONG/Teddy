package org.jcoretechnology.com.firststamps.section14;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/**
　 * Sword基础技术平台项目 - 核心框架
　 * <p>org.jcoretechnology.com.firststamps.section14</p>
　 * <p>Title: ExecutorTest.java</p>
　 * <p>Description: @TODO </p>
　 * <p>Copyright: Copyright (c) 2020 中国软件与技术服务股份有限公司</p>
　 * <p>Company: 中国软件与技术服务股份有限公司</p>
　 * @author 赵勇
　 * @date 2020年7月14日 下午8:32:28
　 * @version 1.0
*/
public class ExecutorTest {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        Future<?> future = newCachedThreadPool.submit(() -> System.out.println("bitch"));
        future.get();
        newCachedThreadPool.shutdown();
        
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(10);
//        pool.scheduleAtFixedRate(command, initialDelay, period, unit)  
//        pool.invokeAll(tasks)
//        pool.invokeAny(tasks)
    }

}
