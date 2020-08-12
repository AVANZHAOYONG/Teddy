package org.jcoretechnology.com.secondstamps.section1;

import java.math.BigInteger;
import java.nio.file.Files;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
　 * Sword基础技术平台项目 - 核心框架
　 * <p>org.jcoretechnology.com.secondstamps.section1</p>
　 * <p>Title: App.java</p>
　 * <p>Description: @TODO </p>
　 * <p>Copyright: Copyright (c) 2020 中国软件与技术服务股份有限公司</p>
　 * <p>Company: 中国软件与技术服务股份有限公司</p>
　 * @author 赵勇
　 * @date 2020年8月10日 下午9:54:55
　 * @version 1.0
*/
public class StreamApp {
    public static void main(String[] args) {
        //流的创建
        Stream<String> stream1 = Stream.of("a", "b", "c");
        Stream<String> stream2 = Stream.generate(() -> "echo");
        Stream<Double> stream3 = Stream.generate(Math::random);
        Stream<BigInteger> stream4 = Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE));
        Stream<Integer> stream5 = Stream.of(1, 2, 3);
        Stream<Object> empty = Stream.empty();
        /**
         * 常用方法
         */
//        Files.lines(path, cs)
//        stream3.map(mapper)
//        stream1.filter(predicate)
//        stream2.limit(maxSize)
//        stream2.skip(n)
//       Stream.concat(a, b)
//        stream2.distinct();
        stream2.sorted(Comparator.comparing(String::length));
//        stream2.peek(action)
        /**
         * 终结操作
         */
//        stream1.count();
//        stream2.max(comparator)
//        stream2.min(comparator)
//        Optional<String> max = stream1.max(String::compareToIgnoreCase);
//        stream1.filter(s->s.startsWith("")).findFirst();
//        stream1.parallel().filter(s->s.startsWith("")).findAny();
//        anymatch
//        allmatch
//        nonematch
        
        
        /**
         * optional类型
         */
        
        //创建
//        Optional.of(value)
//        Optional.ofNullable(value)
//        Optional.empty().flatMap(mapper)
        
        Optional<Object> optional = Optional.empty();
        Object object = optional.get();
        Object orElse = optional.orElse("fdsa");
//        optional.orElseGet(other)
//        optional.orElseThrow(exceptionSupplier)
//        optional.ifPresent(consumer);
//        optional.map(mapper)
        /**
         * 收集结果
         */
        Object[] array = stream1.toArray();
        stream2.collect(Collectors.toList());
        stream2.collect(Collectors.toSet());
        stream2.collect(Collectors.toCollection(TreeSet::new));
        stream2.collect(Collectors.joining());
        /**
         * 收集映射
         */
        Stream<Locale> locales = Stream.of(Locale.getAvailableLocales());
        
        TreeMap<String, Set<String>> collect2 = locales.collect(Collectors.toMap(Locale::getDisplayCountry,
                l -> Collections.singleton(l.getDisplayLanguage()), (a, b) -> {
                    Set<String> union = new HashSet<>(a);
                    union.addAll(b);
                    return union;
        }, TreeMap::new));
        Map<String, String> collect = stream2.collect(Collectors.toMap(key -> key, Function.identity(), (old, n) -> n));
        
        /**
         * 分组
         */
        Stream<Locale> locales2 = Stream.of(Locale.getAvailableLocales());
        
        Map<String, List<Locale>> collect3 = locales2.collect(Collectors.groupingBy(Locale::getCountry));
        Map<Boolean, List<Locale>> collect4 = locales2.collect(Collectors.partitioningBy(l -> l.getLanguage().equals("en")));
        
        Map<String, Set<Locale>> collect5 = locales2
                .collect(Collectors.groupingBy(Locale::getCountry,
                        Collectors.toSet()));
        
        Map<String, Long> collect6 = locales2
                .collect(Collectors.groupingBy(Locale::getCountry,
                        Collectors.counting()));
        Map<String, Integer> collect7 = locales2
                .collect(Collectors.groupingBy(Locale::getCountry,
                        Collectors.summingInt(l -> 1)));
//        maxBy、minBy、mapping、summarizingInt
        /**
         * 简约操作
         */
        Stream<Integer> of = Stream.of(1, 2, 3);
        Optional<Integer> reduce = of.reduce((x, y) -> x + y);
        Integer orElse2 = reduce.orElse(-1);
//        of.reduce(identity, accumulator);
        Random random = new Random();
        IntStream ints = random.ints();
        
    }

}
