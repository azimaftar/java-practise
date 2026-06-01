package Topic.Java8Intermed;

import java.util.*;
import java.util.stream.Collectors;

public class java8StreamInterMed {

    //array + stream
    public static void  sectionOne (){

        int[] arr = {3,7,2,9,5,6,8,8,2};

        //1
        long count = Arrays.stream(arr)
                .count();
        System.out.println(count);

        //2
        int sum = Arrays.stream(arr)
                .filter(n -> n % 2 !=0)
                .sum();
        System.out.println(sum);

        //3
        OptionalInt max = Arrays.stream(arr)
                .max();
        System.out.println(max);

        //4
        OptionalInt min = Arrays.stream(arr)
                .min();
        System.out.println(min);

        //5
        long count1 = Arrays.stream(arr)
                .filter(n -> n > 5)
                .count();
        System.out.println(count1);

        //6
        List<Integer> newList = Arrays.asList(3,7,2,9,5,6,8,8,2);
        List<Integer> list = newList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(list);

        //7
        List<Integer> list1 = list.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(list1);

        //8
        List<Integer> list2 = list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(list2);

        //9
        List<Integer> list3 = list.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println(list3);

        //10
        long count2 =  list.stream()
                .filter(n -> n % 2 == 0 && n % 3 == 0)
                .count();
        System.out.println(count2);
    }

    //distinct sort
    public static void  section2(){

        List<Integer> list =
                Arrays.asList(1,2,2,3,4,4,5,6,7,8);

        //1
        long count = list.stream()
                .distinct()
                .count();
        System.out.println(count);

        //2
        int sum = list.stream()
                .distinct()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);

        //3
        OptionalInt max = list.stream()
                .distinct()
                .mapToInt(Integer::intValue)
                .max();
        System.out.println(max);

        //4
        OptionalInt min = list.stream()
                .distinct()
                .mapToInt(Integer::intValue)
                .min();
        System.out.println(min);

        //5
        List<Integer> list1 = list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(list1);

        //6
        List<Integer> list2 = list.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
        System.out.println(list2);

        //7
        List<Integer> list3 = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(list3);

        //9
        List<Integer> list4 = list.stream()
                .map(n -> n * 10)
                .collect(Collectors.toList());
        System.out.println(list4);

        //8
        long count1 = list.stream()
                .filter(n -> n >3 && n <10)
                .count();
        System.out.println(count1);

        //10
        List<String> strings = list.stream()
                .map(Object::toString)
                .collect(Collectors.toList());
        System.out.println(strings);
    }

    //match function
    public static void section3(){

        List<Integer> list =
                Arrays.asList(2,4,6,8,10);

        //1
        System.out.println(list.stream().anyMatch(n -> n >8));

        //2
        System.out.println(list.stream().allMatch(n -> n % 2 ==0));

        //3
        System.out.println(list.stream().noneMatch(n -> n < 0));

        //4
        System.out.println(list.stream().anyMatch(n -> n % 5 == 0));

        //5
        System.out.println(list.stream().allMatch(n -> n >0));
    }

    //flat map string
    public static void section4(){

        List<String> list =
                Arrays.asList("java","spring","boot","api");

        //1
        List<Character> list1 = list.stream()
                .flatMap(n -> n.chars()
                        .mapToObj(m -> (char)m)
                        .sorted())
                .collect(Collectors.toList());
        System.out.println(list1);

        //2
        List<Character> list2 = list.stream()
                .flatMap(n -> n.chars()
                        .mapToObj(m ->  (char)m))
                        .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(list2);

        //3
        List<String> list3 = list.stream()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());
        System.out.println(list3);

        //4
        List<String> list4 = list.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .collect(Collectors.toList());
        System.out.println(list4);

        //5
        List<Character> list5 =  list.stream()
                .filter(n -> n.contains("a"))
                .flatMap(n -> n.chars()
                        .mapToObj(m -> (char)m)
                        .sorted())
                .collect(Collectors.toList());
        System.out.println(list5);

        //6
        List<String> list6 = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(list6);

        //7
        List<String> list7 = list.stream()
                .map(n -> n.concat("DEV-"))
                .collect(Collectors.toList());
        System.out.println(list7);

        //8
        List<Integer> list8 = list.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(list8);

        //9
        List<String> list9 = list.stream()
                .map(n -> n.replace("java", "backend"))
                .collect(Collectors.toList());
        System.out.println(list9);

        //10
        long count = list.stream()
                .filter(n -> n.length() > 4)
                .count();
        System.out.println(count);
    }

    //flat map number
    public static void  sectionFive(){

        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(3,4),
                Arrays.asList(5,6)
        );

        //1
        List<Integer> list1 = list.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(list1);

        //2
        int sum = list.stream()
                .flatMap(Collection::stream)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);

        //3
        long count = list.stream()
                .flatMap(Collection::stream)
                .mapToInt(Integer::intValue)
                .count();
        System.out.println(count);

        //4
        OptionalInt max = list.stream()
                .flatMap(Collection::stream)
                .mapToInt(Integer::intValue)
                .max();
        System.out.println(max);

        //5
        List<Integer> list2 = list.stream()
                .flatMap(Collection::stream)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(list2);

        //6
        List<Integer> list3 = list.stream()
                .flatMap(Collection::stream)
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println(list3);

        //7
        List<Integer>  list4 = list.stream()
                .flatMap(Collection::stream)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(list4);

        //8
        List<Integer> list5 = list.stream()
                .flatMap(Collection::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(list5);

        //9
        long count1 = list.stream()
                .flatMap(Collection::stream)
                .filter(n -> n  >3 )
                .count();
        System.out.println(count1);

        //10
        OptionalInt min =  list.stream()
                .flatMap(Collection::stream)
                .mapToInt(Integer::intValue)
                .min();
        System.out.println(min);
    }

    //flatmap string + sort + distinct
    public  static void section6(){

        List<String> list =
                Arrays.asList("java","spring");

        //1
        List<Character> list1 = list.stream()
                .flatMap(n -> n.chars()
                        .mapToObj(m -> (char)m))
                .collect(Collectors.toList());
        System.out.println(list1);

        //2
        long count = list.stream()
                .flatMap(n ->n.chars()
                        .mapToObj(m -> (char)m))
                .count();
        System.out.println(count);

        //3
        List<Character> list2 = list.stream()
                .flatMap(n -> n.chars()
                        .mapToObj(m -> (char)m))
                .filter(c -> c.equals('a') || c.equals('e') || c.equals('i') || c.equals('o') || c.equals('u'))
                .collect(Collectors.toList());
        System.out.println(list2);

        //4
        List<Character> list3 = list.stream()
                .flatMap(n -> n.chars()
                        .mapToObj(m -> (char)m))
                .map(Character::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(list3);

        //5
        List<Character> list4 = list.stream()
                .flatMap(n -> n.chars()
                        .mapToObj(m -> (char)m))
                .sorted()
                .collect(Collectors.toList());
        System.out.println(list4);

        //6
        long count1 = list.stream()
                .flatMap(n -> n.chars()
                        .mapToObj(m ->  (char)m))
                .filter(c -> c.equals('a'))
                .count();
        System.out.println(count1);

        //7
        List<Character> list5 = list.stream()
                .flatMap(n -> n.chars()
                        .mapToObj(m -> (char)m))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(list5);

        //8
        List<Character> list6 = list.stream()
                .flatMap(n -> n.chars()
                        .mapToObj(m -> (char)m))
                .filter(c -> c != 'a' && c != 'e' && c != 'i' && c !='o' && c !='u')
                .collect(Collectors.toList());
        System.out.println(list6);

        //9
        long count2 = list.stream()
                .flatMap(n -> n.chars()
                        .mapToObj(m -> (char)m))
                .filter(c -> c.equals('a') || c.equals('e') || c.equals('i') || c.equals('o') || c.equals('u'))
                .count();
        System.out.println(count2);

        //10
        List<Character> list7 = list.stream()
                .flatMap(n -> n.chars()
                        .mapToObj(m -> (char)m))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(list7);
    }


    //groupingby String
    public static void section7 (){

        String word = "programming";

        //1
        Map<Character, Long> map = word.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(n -> n,Collectors.counting()
                ));
        System.out.println(map);

        //2
        map.entrySet().stream()
                .filter(n -> n.getValue() > 1)
                .forEach(c -> System.out.println(c.getKey()));

        //3
        map.entrySet().stream()
                .filter(n -> n.getValue() == 1)
                .forEach(c -> System.out.println(c.getKey()));

        //4
        Map<Character, Long> map1 = word.chars()
                .mapToObj(m -> (char)m)
                .filter(c -> "aeiou".indexOf(c) != -1)
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        //5
        char freq = map.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();
        System.out.println(freq);

        List<String> list =
                Arrays.asList("java","api","java","spring","api","boot");

        //6
        Map<String, Long> map2 = list.stream()
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(map2);

        //7
        map2.entrySet().stream()
                .filter(n ->  n.getValue() > 1)
                .forEach(c -> System.out.println(c.getKey()));

        //8
        map2.entrySet().stream()
                .filter(n -> n.getValue() ==1 )
                .forEach(c -> System.out.println(c.getKey()));

        //9
        String words = map2.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();
        System.out.println(words);

        //10
        long count = list.stream()
                .filter(n -> n.contains("a"))
                .count();
        System.out.println(count);
    }

    //String Handling
    public static void section8(){

        String word = "banana";

        //1
        String word1=  new StringBuilder(word)
                .reverse()
                .toString();
        System.out.println(word1);

        //2
        System.out.println(word.equals(word1));

        //3
        Long count = word.toLowerCase()
                .chars()
                .filter(n -> n == 'a' || n == 'e' || n == 'i' || n =='o' || n =='u')
                .count();
        System.out.println(count);

        //4
        Long count1 = word.toLowerCase()
                .chars()
                .filter(c -> c != 'a' && c != 'e' && c != 'i' && c !='o' && c !='u')
                .count();
        System.out.println(count1);

        //5
        String word2 = word.chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char)c))
                        .collect(Collectors.joining());
        System.out.println(word2);

        //6
        String word3 = word.chars()
                .sorted()
                .mapToObj(c -> String.valueOf((char)c))
                .collect(Collectors.joining());

        System.out.println(word3);

        //7
        Map<Character, Integer>  map = new HashMap<>();
        for (char w : word.toCharArray() ){
            map.put(w,map.getOrDefault(w, 0) + 1);
        }
        Character c = map.entrySet().stream()
                .filter(n -> n.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
        System.out.println(c);

        //8
        Character b =  map.entrySet().stream()
                .filter(n -> n.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
        System.out.println(b);

        //9
        map.entrySet().stream()
                .filter(n -> n.getValue() >1)
                .forEach(d -> System.out.println(d.getKey()));

        //10
        map.entrySet().stream()
                .filter(n -> n.getValue() == 1)
                .forEach(e -> System.out.println(e.getKey()));


        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("a",1);
        map1.put("b",2);

        map1.remove("aa");
        map1.put("c",1);
        map1.put("d",2);

    }

    //findAny + findAll
    public static void  sectionNine(){

        List<Integer> list = Arrays.asList(3, 7, 2, 9, 5, 6, 8);

        //1
        Optional<Integer> opt1 = list.stream()
                .findFirst();
        System.out.println(opt1.orElse(-1));

        //2
        Optional<Integer> opt2 = list.stream()
                .findAny();
        System.out.println(opt2.orElse(-1));

        //3
        Optional<Integer> opt3 = list.stream()
                .filter(n -> n  > 5)
                .findFirst();
        System.out.println(opt3.orElse(-1));

        //4
        Optional<Integer> opt4 = list.stream()
                .filter(n -> n > 5)
                .findAny();
        System.out.println(opt4.orElse(-1));

        //5
        Optional<Integer> opt5 = list.stream()
                .filter(n -> n % 2 == 0)
                .findFirst();
        System.out.println(opt5.orElse(-1));

        //6
        Optional<Integer> opt6 = list.stream()
                .filter(n -> n % 2 == 0)
                .findAny();
        System.out.println(opt6.orElse(-1));

        //7
        Optional<Integer> opt7 = list.stream()
                .sorted()
                .findFirst();
        System.out.println(opt7.orElse(-1));

        //8
        Optional<Integer> opt8 = list.stream()
                .filter(n -> n % 3 ==0)
                .findAny();
        System.out.println(opt8.orElse(-1));

        //9
        Optional<Integer> opt9 = list.stream()
                .filter(n ->  n > 10)
                .findFirst();
        System.out.println(opt9.orElse(-1));

        //10
        Optional<Integer> opt10 = list.stream()
                .filter(n -> n > 4 )
                .findAny();
        System.out.println(opt10.orElse(-1));

    }

    public static void  section10(){

        List<Integer> list =
                Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //1
        List<Integer> n1 = list.stream()
                .limit(5)
                .collect(Collectors.toList());
        System.out.println(n1);

        //2
        List<Integer> n2 =list.stream()
                .skip(3)
                .collect(Collectors.toList());
        System.out.println(n2);

        //3
        List<Integer> n3 = list.stream()
                .skip(5)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(n3);

        //4
        List<Integer> n4 = list.stream()
                .filter(n -> n % 2 == 0 )
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(n4);

        //5
        List<Integer> n5 = list.stream()
                .filter(n ->  n % 2 != 0)
                .skip(4)
                .collect(Collectors.toList());
        System.out.println(n5);

        //6
        List<Integer> n6 = list.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(n6);

        //7
        List<Integer> n7 = list.stream()
                .map(n -> n * 2 )
                .limit(5)
                .collect(Collectors.toList());
        System.out.println(n7);

        //8
        long count = list.stream()
                .skip(2)
                .count();
        System.out.println(count);

        //9
        Optional<Integer> opt1 = list.stream()
                .skip(3)
                .findFirst();
        System.out.println(opt1.orElse(-1));

        //10
        List<Integer> n10 = list.stream()
                .sorted(Comparator.reverseOrder())
                .limit(4)
                .collect(Collectors.toList());
        System.out.println(n10);
    }

    public static void sectionEleven(){

        List<Integer> list =
                Arrays.asList(1,2,3,4,5);

        //1
        Optional<Integer> red1 = list.stream()
                .reduce((a,b) ->  a + b);
        System.out.println(red1.orElse(0));

        //2
        Optional<Integer> red2 =  list.stream()
                .reduce((a,b) -> a * b);
        System.out.println(red2.orElse(0));

        //3
        Optional<Integer> red3 = list.stream()
                .reduce((a,b) -> a > b ? a : b);
        System.out.println(red3.orElse(0));

        //4
        Optional<Integer> red4 = list.stream()
                .reduce((a,b) -> a < b ? a : b);
        System.out.println(red4.orElse(0));

        //5
        Optional<Integer> red5 = list.stream()
                .filter(n -> n % 2 == 0)
                .reduce((a,b) -> a + b);
        System.out.println(red5.orElse(0));

        //6
        Optional<Integer> red6 = list.stream()
                .filter(n -> n % 2 != 0)
                .reduce((a,b) -> a * b);
        System.out.println(red6.orElse(0));

        //7
        Optional<Integer> red7= list.stream()
                .map(n -> n + 10)
                .reduce((a,b) -> a + b);
        System.out.println(red7.orElse(0));

        //8
        Integer red8 = list.stream()
                .map(n -> 1)
                .reduce(0, Integer::sum);

        System.out.println(red8);

        //9
        int  sum1= list.stream()
                .reduce(100,(a,b) -> a + b);
        System.out.println(sum1);

        //10
        Optional<String> one = list.stream()
                .map(String::valueOf)
                .reduce((a,b) -> a +"" + b);
        System.out.println(one);
    }

    public static void sectionTwelve(){

        List<Integer> list =
                Arrays.asList(1,2,2,3,4,5,6);

        //1
        Set<Integer> set = list.stream()
                .collect(Collectors.toSet());
        System.out.println(set);

        //2
        long count = list.stream()
                .collect(Collectors.counting());
        System.out.println(count);

        //3
        double avg = list.stream()
                .collect(Collectors.averagingInt(Integer::intValue));
        System.out.println(avg);

        //4
        IntSummaryStatistics sum = list.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(sum);

        //5
        Map<Boolean, List<Integer>> map = list.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 ==0));
        System.out.println(map);

        //6
        Set<Integer> set1 = list.stream()
                .collect(Collectors.toSet());
        System.out.println(set);

        //7
        long count1 = list.stream()
                .filter(n -> n % 2 ==0 )
                .collect(Collectors.counting());
        System.out.println(count1);

        //8
        IntSummaryStatistics sum1 = list.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(sum1.getSum());

        //9
        System.out.println(sum1.getMax());

        //10
        System.out.println(sum1.getMin());

        List<String> list1 =
                Arrays.asList("java","spring","boot");

        //11
        String all = list1.stream()
                .collect(Collectors.joining("-"));
        System.out.println(all);

        //12
        String al = list1.stream()
                .collect(Collectors.joining(","));
        System.out.println(al);


        //13
        Set<String> newSet =  list1.stream()
                .collect(Collectors.toSet());
        System.out.println(newSet);

        //14
        long count2 = list1.stream()
                .collect(Collectors.counting());
        System.out.println(count2);

        //15
        Map<Boolean, List<String>> map2 = list1.stream()
                .collect(Collectors.partitioningBy(n -> n.length() > 4));
        System.out.println(map2);

    }

    public static void sectionThirteen(){

        List<String> list2 = Arrays.asList("java", "spring", "boot");
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        String word = "banana";

        //1
        Map<Integer, Integer> map1 = list.stream()
                .collect(Collectors.toMap(
                        n -> n,
                        n -> n * n
                ));
        System.out.println(map1);

        //2
        Map<Integer, Integer> map2 = list.stream()
                .collect(Collectors.toMap(
                        n -> n,
                        n -> n * n * n
                ));
        System.out.println(map2);

        ;

        //3
        Map<String, Integer> map3 = list2.stream()
                .collect(Collectors.toMap(
                        n -> n,
                        n -> n.length()
                ));
        System.out.println(map3);

        //4
        Map<String, String> map4 = list2.stream()
                .collect(Collectors.toMap(
                        n -> n,
                        n -> n.toUpperCase()
                ));
        System.out.println(map4);

        //5
        Map<String, String > map5 =list2.stream()
                .collect(Collectors.toMap(
                        n -> n,
                        n -> n.toLowerCase()
                ));
        System.out.println(map5);

        //6
        Map<Integer, String> map6 = list.stream()
                .collect(Collectors.toMap(
                        n -> n,
                        n -> n % 2 == 0 ? "EVEN" :"ODD"
                ));
        System.out.println(map6);

        //7
        Map<Character, Integer> map7 =  word.chars()
                .mapToObj(n -> (char)n)
                .collect(Collectors.toMap(
                        c -> c,
                        c -> 1, Integer::sum
                ));
        System.out.println(map7);

        //8
        Map<String, Integer> map8 = list2.stream()
                .collect(Collectors.toMap(
                        n -> n,
                        n ->  1,  Integer::sum
                ));
        System.out.println(map8);

        //9
        Map<Integer, Integer> map9 = list.stream()
                .collect(Collectors.toMap(
                        n -> n,
                        n -> list.indexOf(n)
                ));
        System.out.println(map9);

        //10
        Map<Character, String> map10 = list2.stream()
                .collect(Collectors.toMap(
                        n -> n.charAt(0),
                        n -> n, (oldValue, newValue) -> oldValue
                ));
        System.out.println(map10);
    }

    public static void sectionForteen(){

        List<Integer> list =
                Arrays.asList(3,7,2,9,5,6,8);

        //1
        Optional<Integer> opt1 = list.stream()
                .filter(n -> n  > 5)
                .findFirst();
        System.out.println(opt1.orElse(-1));

        //2
        Optional<Integer> opt2 = list.stream()
                .filter(n -> n % 2 ==0)
                .findFirst();
        System.out.println(opt2.orElse(-1));

        //3
        Optional<Integer> opt3 = list.stream()
                .filter(n -> n % 2 != 0)
                .findAny();
        System.out.println(opt3.orElse(-1));

        //4
        OptionalInt opt4 = list.stream()
                .mapToInt(Integer::intValue)
                .max();
        System.out.println(opt4.orElse(-1));

        //5
        OptionalInt opt5 = list.stream()
                .mapToInt(Integer::intValue)
                .min();
        System.out.println(opt5.orElse(-1));

        //6
        Optional<Integer> opt6 = list.stream()
                .filter(n -> n >10 )
                .findFirst();
        System.out.println(opt6.orElse(-1));

        //7
        Optional<Integer> opt7 = list.stream()
                .filter(n -> n % 3 ==0)
                .findAny();
        System.out.println(opt7);

        //8
        Optional<Integer> opt8 =list.stream()
                .sorted()
                .findFirst();
        System.out.println(opt8.orElse(-1));

        //9
        Optional<Integer> opt9 = list.stream()
                .sorted(Comparator.reverseOrder())
                .findFirst();
        System.out.println(opt9);


        //10
        list.stream()
                .filter(n ->  n % 2 ==0)
                .findFirst()
                .ifPresent(System.out::println);
    }

    public static void finaltest(){

        List<Integer> list1 = Arrays.asList(3, 7, 2, 9, 5, 6, 8);
        List<String> list2 = Arrays.asList("java", "spring", "boot", "api");
        String word = "programming";

        //1
        List<Integer>  lis = list1.stream()
                .filter(n -> n > 5)
                .toList();
        System.out.println(lis);

        //2
        List<Integer> lis1 = list1.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(lis1);

        //3
        List<Integer> lis2 = list1.stream()
                .map(n -> n * 10)
                .toList();
        System.out.println(lis2);

        //4
        Optional<Integer> sum = list1.stream()
                .reduce((a, b) -> a + b);
        System.out.println(sum);

        //5
        boolean have  = list1.stream()
                .anyMatch(n -> n %2  ==0 && n % 3 == 0);
        System.out.println(have);

        //6
        Optional<Integer> number = list1.stream()
                .filter(n ->  n > 5)
                .findFirst();

        System.out.println(number.orElse(-1));

        //7
        List<Integer> lis3 = list1.stream()
                .skip(2)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(lis3);

        //8
        List<Character> lis4 = list2.stream()
                .flatMap(n -> n.chars()
                        .mapToObj(c -> (char)c))
                .collect(Collectors.toList());
        System.out.println(lis4);

        //9
        Map<String, Integer> map = list2.stream()
                .collect(Collectors.toMap(
                        n -> n,
                        n -> n.length()
                ));
        System.out.println(map);

        //10
        Map<Character, Long> map2 = word.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(n -> n,Collectors.counting()));
        System.out.println(map2);
    }
}
