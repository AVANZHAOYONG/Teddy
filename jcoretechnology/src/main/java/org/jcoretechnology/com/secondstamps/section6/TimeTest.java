package org.jcoretechnology.com.secondstamps.section6;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/**
　 * Sword基础技术平台项目 - 核心框架
　 * <p>org.jcoretechnology.com.secondstamps.section6</p>
　 * <p>Title: TimeTest.java</p>
　 * <p>Description: @TODO </p>
　 * <p>Copyright: Copyright (c) 2020 中国软件与技术服务股份有限公司</p>
　 * <p>Company: 中国软件与技术服务股份有限公司</p>
　 * @author 赵勇
　 * @date 2020年8月16日 下午3:12:37
　 * @version 1.0
*/
public class TimeTest {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println("fdsa");
        Instant now2 = Instant.now();
        Duration between = Duration.between(now, now2);
        System.out.println(between.toMillis());
        
        Duration between1 = Duration.between(now, now2);
        boolean negative = between.multipliedBy(10).minus(between1).isNegative();
        
        
        LocalDate now3 = LocalDate.now();
        LocalDate of = LocalDate.of(1994, 12, 13);
        LocalDate of1 = LocalDate.of(1994, Month.DECEMBER, 13);
        long until = of1.until(of, ChronoUnit.DAYS);
        
        
        
    }

}
