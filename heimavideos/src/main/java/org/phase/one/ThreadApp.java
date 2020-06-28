package org.phase.one;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
　 * Sword基础技术平台项目 - 核心框架
　 * <p>org.phase.one</p>
　 * <p>Title: ThreadApp.java</p>
　 * <p>Description: @TODO </p>
　 * <p>Copyright: Copyright (c) 2020 中国软件与技术服务股份有限公司</p>
　 * <p>Company: 中国软件与技术服务股份有限公司</p>
　 * @author 赵勇
　 * @date 2020年6月17日 下午9:35:43
　 * @version 1.0
*/
public class ThreadApp {
    
    public static void main(String[] args) throws InterruptedException {
        int size = 10 ; 
        
        int corePoolSize = 1 ; 
        int maximumPoolSize = 100 ; 
        long keepAliveTime = 60;
        int queueSize = 2 ; 
        BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>(queueSize);
        
        AtomicInteger id = new AtomicInteger(1); 
        String prefix = "test-";
        
        ThreadPoolExecutor threadPoolExecutor = getPoll(corePoolSize, maximumPoolSize, keepAliveTime, queue, id, prefix);
        List<Future<String>> list = new ArrayList<Future<String>>();
        for (int i = 0; i < size ; i++) {
            list.add(threadPoolExecutor.submit(new Callable<String>() {

                @Override
                public String call() throws Exception {
                    
                    return Thread.currentThread().getName() + ": call ok";
                }
            }));
        }
        list.forEach(future -> {
            try {
                System.out.println(future.get()); //阻塞
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            } 
            
        });
//        Thread.sleep(Integer.MAX_VALUE);
        
    }

    private static ThreadPoolExecutor getPoll(int corePoolSize, int maximumPoolSize, long keepAliveTime,
            BlockingQueue<Runnable> queue, AtomicInteger id, String prefix) {
        return new ThreadPoolExecutor(corePoolSize,
                maximumPoolSize,
                keepAliveTime,
                TimeUnit.MICROSECONDS,
                queue,
                new ThreadFactory() {
                    
                    @Override
                    public Thread newThread(Runnable r) {
                        Thread thread = new Thread(r);
                        thread.setDaemon(true);
                        thread.setName(prefix + id.getAndIncrement());
                        return thread;
                    }
                },
                new RejectedExecutionHandler() {
                    
                    @Override
                    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
                        if(executor.isShutdown()) {
                            return ;
                        }
                        BlockingQueue<Runnable> blockingQueue = executor.getQueue();
                        Runnable runnable = blockingQueue.poll();
                        boolean offered = blockingQueue.offer(r);
                        if(runnable != null) {
                            executor.execute(runnable);
                        }
                        if(!offered) {
                            executor.execute(r);
                        }
                        
                    }
                });
    }

}
