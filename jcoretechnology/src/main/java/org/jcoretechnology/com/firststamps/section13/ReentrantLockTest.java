package org.jcoretechnology.com.firststamps.section13;

import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
　 * Sword基础技术平台项目 - 核心框架
　 * <p>org.jcoretechnology.com.firststamps.section13</p>
　 * <p>Title: ReentrantLockTest.java</p>
　 * <p>Description: @TODO </p>
　 * <p>Copyright: Copyright (c) 2020 中国软件与技术服务股份有限公司</p>
　 * <p>Company: 中国软件与技术服务股份有限公司</p>
　 * @author 赵勇
　 * @date 2020年7月13日 下午8:31:58
　 * @version 1.0
*/
public class ReentrantLockTest {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean pause = true;
    
    private volatile boolean stop = false;
    
    private LongAdder adder = new LongAdder();
    private LongAccumulator adder1 = new LongAccumulator(Long::sum, 0);
    
    
    
    
    public LongAccumulator getAdder1() {
        return adder1;
    }

    public void setAdder1(LongAccumulator adder1) {
        this.adder1 = adder1;
    }

    public LongAdder getAdder() {
        return adder;
    }

    public void setAdder(LongAdder adder) {
        this.adder = adder;
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    public void myTask() {
//        lock.tryLock(time, unit)
        lock.lock();
        try {
            while(pause) {
                condition.await();
            }
            System.out.println("hello");
        } catch (Exception e) {
        }finally {
            lock.unlock();
        }
    }
    
    public void toggle() {
        lock.lock();
        try {
            pause = !pause;
            condition.signalAll();
        } catch (Exception e) {
        }finally {
            lock.unlock();
        }
    }
    
    
    public synchronized String getName() {
        
        return "name";
    }
    
    public int getAge() {
        return 12;
    }
    
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<Delayed> queue = new DelayQueue<Delayed>(); //只有延迟超过 delayed的元素会被移除
        
        
        ConcurrentHashMap<String, Object> hashMap = new ConcurrentHashMap<String, Object>();
        hashMap.mappingCount();
//        test1();
//        test2();
//        test3();
        test4();
        
    }
    
    private static void test1() throws InterruptedException {
      ReentrantLockTest test = new ReentrantLockTest();
      
      new Thread(test::myTask).start();
      
      Thread.sleep(1000);
      test.toggle();
    }
    private static void test2() throws InterruptedException {
        ReentrantLockTest test = new ReentrantLockTest();
        
        new Thread(test::getName).start();
        int name = test.getAge();
    }
    private static void test3() throws InterruptedException {
        ReentrantLockTest test = new ReentrantLockTest();
        
        new Thread(() -> {
            test.setStop(true);
        }).start();
        Thread.sleep(1000);
        System.out.println(test.isStop());
    }
    private static void test4() throws InterruptedException {
        ReentrantLockTest test = new ReentrantLockTest();
        
        /**
        new AtomicLong() 的优化
         * 
         */
        test.getAdder().increment();
        test.getAdder().sum();
        
        test.getAdder1().accumulate(1);
        test.getAdder1().get();
    }

}
