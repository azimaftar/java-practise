package Topic.Java8Advance;

import java.util.*;
import java.util.stream.Collectors;

public class java8StreamAdvance {

    public static void sectionOne(){

        List<Integer> list1 =
                Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<String> list2 =
                Arrays.asList("java","api","spring","boot","java");
        //1
        Map<String,List <Integer>> map1 = list1.stream()
               .collect(Collectors.groupingBy(
                       n -> n % 2 == 0 ? "EVEN" : "ODD"
               ));
        System.out.println(map1);

        //2
        Map<Integer, List<Integer>> map2 = list1.stream()
                .collect(Collectors.groupingBy(
                        n -> n % 3
                ));
        System.out.println(map2);

        //3
        Map<Integer, List<String>> map3 = list2.stream()
                .collect(Collectors.groupingBy(
                        String::length,
                        Collectors.mapping(
                                String::toUpperCase,
                                Collectors.toList())
                ));
        System.out.println(map3);

        //4
        Map<Integer, Long> map4 = list2.stream()
                .collect(Collectors.groupingBy(
                        String::length,
                        Collectors.counting()

                ));
        System.out.println(map4);

        //5
        Map<String, Integer> map5 = list1.stream()
                .collect(Collectors.groupingBy(
                        n -> n % 2 == 0 ? "EVEN" : "ODD",
                        Collectors.summingInt(Integer::intValue)
                ));
        System.out.println(map5);

        //6
        Map<Character, List<String>> map6 = list2.stream()
                .collect(Collectors.groupingBy(
                        n -> n.charAt(0),
                        Collectors.mapping(
                                String::toUpperCase,
                                Collectors.toList()
                        )
                ));
        System.out.println(map6);

        //7
        Map<Integer, List<String>> map7 = list2.stream()
                .collect(Collectors.groupingBy(
                        String::length,
                        Collectors.mapping(
                                String::toUpperCase,
                                Collectors.toList()
                        )
                ));
        System.out.println(map7);

        //map8
        Map<String, Long> map8 = list2.stream()
                .collect(Collectors.groupingBy(
                        n -> n,Collectors.counting()
                ));
        System.out.println(map8);

        //9
        Map<String,Long> map9 =  list1.stream()
                .collect(Collectors.groupingBy(
                        n -> n % 2 == 0 ? "EVEN" : "ODD",
                        Collectors.counting()
                ));

        //10
        Map<String, IntSummaryStatistics> map10 = list1.stream()
                .collect(Collectors.groupingBy(
                        n ->  n % 2 == 0 ? "EVEN" : "ODD",
                        Collectors.summarizingInt(Integer::intValue)
                ));
        System.out.println(map10);

        //11
        Map<Character, Long> map11 = list2.stream()
                .flatMap(c -> c.chars()
                        .mapToObj(m -> (char)m))
                .collect(Collectors.groupingBy(
                        n -> n,Collectors.counting()
                ));
        System.out.println(map8);
    }

    public static void sectionTwo(){

        List<String> list1 =
                Arrays.asList("java","api","spring","boot","backend");

        List<Integer> list2 =
                Arrays.asList(5,2,8,1,7,4,9,6);



    }



}