package org.jcoretechnology.com.firststamps.section14;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.function.DoublePredicate;

/**
 * Sword基础技术平台项目 - 核心框架
 * <p>
 * org.jcoretechnology.com.firststamps.section14
 * </p>
 * <p>
 * Title: ForkJoinTest.java
 * </p>
 * <p>
 * Description: @TODO
 * </p>
 * <p>
 * Copyright: Copyright (c) 2020 中国软件与技术服务股份有限公司
 * </p>
 * <p>
 * Company: 中国软件与技术服务股份有限公司
 * </p>
 * @author 赵勇 @date 2020年7月14日 下午9:10:29 @version 1.0
 */
public class ForkJoinTest extends RecursiveTask<Integer> {
    public static final int THRESHOLD = 1000;
    private double[] values;
    private int from;
    private int to;
    private DoublePredicate filter;

    public ForkJoinTest(double[] values, int from, int to, DoublePredicate filter) {
        this.values = values;
        this.from = from;
        this.to = to;
        this.filter = filter;
    }

    /*
     * (non-Javadoc) <p>Title: compute</p> <p>Description: @TODO</p>
     * 
     * @return
     * 
     * @see java.util.concurrent.RecursiveTask#compute()
     */
    @Override
    protected Integer compute() {
        if (to - from < THRESHOLD){
            int count = 0;
            for (int i = from; i < to; i++){
                if (filter.test(values[i])) 
                    count++;
                }
            return count;
        }else{
            int mid = (from + to) / 2;
            ForkJoinTest first = new ForkJoinTest(values, from, mid, filter);
            ForkJoinTest second = new ForkJoinTest(values, mid, to, filter);
            invokeAll(first, second);
            return first.join() + second.join();
        }
    }
    public static void main(String[] args) {
        final int SIZE = 10000000;
        double[] numbers = new double[SIZE];
        for (int i = 0; i < SIZE; i++) {
            numbers[i] = Math.random();
        }
        
        ForkJoinTest forkJoinTest = new ForkJoinTest(numbers, 0, numbers.length, x -> x > 0.5);
        
        ForkJoinPool pool = new ForkJoinPool();
        
        pool.invoke(forkJoinTest);
    }

}
