package org.jcoretechnology.com.firststamps.section9;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.WeakHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/**
　 * Sword基础技术平台项目 - 核心框架
　 * <p>org.jcoretechnology.com.firststamps.section9</p>
　 * <p>Title: CollectionTest.java</p>
　 * <p>Description: @TODO </p>
　 * <p>Copyright: Copyright (c) 2020 中国软件与技术服务股份有限公司</p>
　 * <p>Company: 中国软件与技术服务股份有限公司</p>
　 * @author 赵勇
　 * @date 2020年7月12日 下午6:10:11
　 * @version 1.0
*/
public class CollectionTest {
    public static void main(String[] args) {
        
        vieosAndWrapper();
        
        
    }
    
    
    private static void practicalMethod() {
        Collection<String> list1 = new ArrayList<String>() {{add("a");add("b");add("c");}};
        Collection<String> list2 = new ArrayList<String>() {{add("d");add("e");add("f");}};
        
        /**
         * 伪代码
         */
        list1.add("");
        list1.addAll(list2);
        list1.contains("a");
        list1.containsAll(list2);
        list1.remove("");
        list1.removeAll(list2);
        list1.retainAll(list2);
        list1.toArray();
        list1.toArray(new String[100]);
        list1.clear();
    }
    private static void CommonlyUse() {
        //弱散列 映射
        Map<String,Object> map = new WeakHashMap<String, Object>();
        
        Queue<String> queue = new PriorityQueue<String>();
        //有序
        Set set = new LinkedHashSet<String>();
        Map<String,Object> map2 = new LinkedHashMap<String, Object>();
        
        EnumSet<MyEnum> allOf = EnumSet.allOf(MyEnum.class);
        EnumMap<MyEnum, Object> map3 = new EnumMap<>(MyEnum.class);
        
        //表示散列映射 key值通过System.identityHashCode（物理地址） 计算，而不是hashcode。通过==比较即可
        Map<String,Object> map4 = new IdentityHashMap<String, Object>();
        
        //位集 要高效地存储位序列
        BitSet bitSet = new BitSet(10);
        
        
    }
    private static void vieosAndWrapper() {
        /**
         * 视图只是不能改变长度。
         */
        String[] strs = {"a","b","c"};
        List<String> list = Arrays.asList(strs);
//        List<String> nCopies = Collections.nCopies(10, new String("d"));
        Map<Object, Object> emptyMap = Collections.emptyMap();
        
        List<String> list2 = new ArrayList<String>();
        list2.add("a");
        list2.add("b");
        list2.add("c");
        
        List<String> unmodifiableList = Collections.unmodifiableList(list2);
        unmodifiableList.add("d");
        
        Map<String,Object> map = new HashMap<String, Object>();
        Map<String, Object> map2 = Collections.synchronizedMap(map);//同步map
        
        List<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = Collections.checkedList(list3, Integer.class);
        List list5 = list4;
        list5.add("d");
        
        
        list.set(1, "d");
    }
    
    private static void algorithm() {
        List<String> list = new ArrayList<String>();
        String max = Collections.max(list);
        Collections.shuffle(list);
        Collections.sort(list);
        int binarySearch = Collections.binarySearch(list, "b");
        Collections.swap(list, 0, 2);
        Collections.reverse(list);
        Collections.rotate(list, 10); //旋转
        int frequency = Collections.frequency(list, "b");//返回相同b 对象的相同个数
        Collections.disjoint(list, new ArrayList<String>());//没有相同元素返回true
        
    }

}
