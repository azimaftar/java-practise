package Topic.AllListKind;

import java.util.*;
import java.util.stream.Collectors;

public class Sets {

    public static void testing(){

        Set<Integer> set = new HashSet<>();

        set.add(3);
        set.add(7);
        set.add(2);
        set.add(3);
        set.add(5);

        System.out.println(set);

        set.size();
        set.contains(3);

        List<Integer> list = Arrays.asList(1,2,2,3,4,4,5);

        Set<Integer> sets = new HashSet<>(list);
        System.out.println(sets);

    }

    public static void test2(){

        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        Set<Integer> set = new HashSet<>(list);

        int count = list.size() - set.size();
        System.out.println("duplicate removed" + count);

        System.out.println("unique boolean" + set.size());

        OptionalInt small = set.stream()
                .mapToInt(Integer::intValue)
                .min();
        System.out.println("smallest unique" + small);

        OptionalInt large = set.stream()
                .mapToInt(Integer::intValue)
                .max();
        System.out.println("largest unique" + large);
    }

    public static void test3() {

        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        Set<Integer> set = new HashSet<>(list);

        System.out.println("print unique" + set);

        long count = set.stream()
                .filter(n -> n %2 ==0)
                .count();
        System.out.println("unique even" + count);

        int sum = set.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("sum unique" + sum);

        long countt = set.stream()
                .filter(n -> n >3)
                .count();
        System.out.println("unique > 3" + countt);

    }

    public static void test4() {

        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);

        Set<Integer> sett = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(0);
        set.add(8);
        set.add(5);
        set.add(6);

        long count = set.stream()
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println("total unique" + count);

        set.remove(2);
        System.out.println("new set" + set.size());
        int sum = set.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("sum new set" + sum);

        set.contains(6);
        set.contains(100);
        OptionalInt max =  set.stream()
                .mapToInt(Integer::intValue)
                .max();
        System.out.println("max" + max);

        System.out.println("common value " + set.retainAll(sett));
        System.out.println("common value count" + set.size());

        System.out.println("remove common value " + set.removeAll(sett));
        OptionalInt min = set.stream()
                .mapToInt(Integer::intValue)
                .min();
        System.out.println("min " + min);

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1,0,8,4,7));
        System.out.println("new set " + set1.addAll(set2));
        long countt = set1.stream()
                .filter(n -> n > 2)
                .count();
        System.out.println("count > 2 " + countt);

        Set<Integer> set3 = new HashSet<>();
        set3.isEmpty();
        set3.add(1);
        set3.add(2);
        set3.add(3);
        int summ = set3.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("sum " + summ);

        Set<Integer> set4 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        System.out.println("size " + set4.size());
        set4.clear();
        System.out.println("set " + set4);
        set4.isEmpty();


        Set<Integer> set5 = new HashSet<>(Arrays.asList(5,5,10,10,15,20));
        System.out.println("set " + set5);
        long counttt = set5.stream()
                .filter(n -> n > 10)
                .count();
        System.out.println("count " + counttt);
        OptionalInt minnn = set5.stream()
                .filter(n -> n > 10)
                .mapToInt(Integer::intValue)
                .min();
        System.out.println("min " + minnn);

    }

    public static void testing2() {

        Set<Integer> set = new HashSet<>(Arrays.asList(2,4,6,8));

        boolean anyMatch = set.stream()
                .anyMatch(n -> n > 5);
        System.out.println("min " + anyMatch);

    }

    public static void testt() {

        Set<Integer> set = new HashSet<>(Arrays.asList(2,4,6,8));

        boolean oddMore = set.stream()
                .anyMatch(n -> n %2 != 0 || n > 10);
        System.out.println("bool odd & > 10 " + oddMore);

        boolean evenMore =  set.stream()
                .allMatch(n -> n%2== 0 && n > 3);
        System.out.println("bool odd & > 10 " + evenMore);

        boolean oddMoree = set.stream()
                .noneMatch(n -> n % 2 !=0  || n > 100);
        System.out.println("bool odd & > 10 " + oddMoree);

    }

    public static void testing3() {

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        
        List<Integer> lists = list.stream()
                .filter(n -> n%2==0)
                .toList();
        System.out.println("even number" + lists);

        Set<Integer> set = new HashSet<>(list);
        System.out.println("new set" + set);

        Set<Integer> sett = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        List<Integer> listt = sett.stream()
                .filter(n -> n >5)
                .toList();
        System.out.println("list > 5" + listt);

        List<Integer> list1 = Arrays.asList(1,2,2,3,4,4,5);
        Set<Integer> set1 = list1.stream()
                .filter(n -> n > 2)
                .collect(Collectors.toSet());
        System.out.println("list > 2" + set1);

    }

}
