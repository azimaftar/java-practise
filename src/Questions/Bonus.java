package Questions;

import java.util.*;

public class Bonus {

    public static void bonusOne(){

        int[] arr = {12,34,56,78};

        //q1
        long count = Arrays.stream(arr)
                .filter(n -> String.valueOf(n)
                        .chars()
                        .map(Character::getNumericValue)
                        .sum() > 10)
                .count();
        System.out.println(count);

        long countt = Arrays.stream(arr)
                .filter(n -> String.valueOf(n)
                        .chars()
                        .map(Character::getNumericValue)
                        .sum() % 2 ==0)
                .count();
        System.out.println(countt);

        OptionalInt max = Arrays.stream(arr)
                .filter(n -> String.valueOf(n)
                        .chars()
                        .map(Character::getNumericValue)
                        .sum() < 10)
                .max();
        System.out.println(max);

        int sum = Arrays.stream(arr)
                .filter(n -> String.valueOf(n)
                        .chars()
                        .map(Character::getNumericValue)
                        .sum() <10)
                .sum();
        System.out.println(sum);

        long counttt = Arrays.stream(arr)
                .filter(n -> String.valueOf(n).contains("5"))
                .count();
        System.out.println(counttt);

    }

    public static void  bonusTwo(){

        List<String> list =
                Arrays.asList("java","spring","boot","api");

        //q1
        long count = list.stream()
                .filter(n -> n.length() > 4)
                .count();
        System.out.println(count);

        //q2
        String longest = list.stream()
                .max(Comparator.comparing(String::length))
                .get();

        System.out.println(longest);

        //q3
        long countt = list.stream()
                .filter(n -> n.contains("n"))
                .count();
        System.out.println(countt);

        //q4
        list.forEach(n -> System.out.println(n.toUpperCase()));

        //q5
        List<String> newList = list.stream()
                .filter(n -> n.length() < 5)
                .toList();
        System.out.println(newList);

        //q6
        long countn = list.stream()
                .filter(n -> n.startsWith("s"))
                .count();
        System.out.println(countn);

        //q7
        long counts = list.stream()
                .filter(n -> n.endsWith("t"))
                .count();
        System.out.println(counts);

        //q8
        list.forEach(n -> System.out.println(n.replace("java", "backend")));

        //q9
        int total = list.stream()
                .mapToInt(String::length)
                .sum();

        System.out.println(total);

        //q10
        long vowels = list.stream()
                .flatMapToInt(word -> word.toLowerCase().chars())
                .filter(c ->
                        c == 'a' ||
                                c == 'e' ||
                                c == 'i' ||
                                c == 'o' ||
                                c == 'u')
                .count();
        System.out.println(vowels);
    }

    public static void bonusThree(){

        Set<Integer> set =
                new HashSet<>(Arrays.asList(1,2,2,3,4,4,5));

        //q1
        System.out.println(set);

        //q2
        long count = set.stream()
                .filter(n -> n % 2 ==0)
                .count();
        System.out.println(count);

        //q3
        int sum = set.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);

        //q4
        OptionalInt max = set.stream()
                .mapToInt(Integer::intValue)
                .max();
        System.out.println(max);

        //q5
        OptionalInt min = set.stream()
                .mapToInt(Integer::intValue)
                .min();
        System.out.println(min);

        //q6
        long countt = set.stream()
                .filter(n -> n > 3)
                .count();
        System.out.println(countt);

        //q7
        System.out.println(set.contains(5));

        //q8
        System.out.println(set.remove(2));

        //q9
        Set<Integer> sets =
                new HashSet<>(Arrays.asList(1,2,2,3,4,4,5));
        System.out.println(set.retainAll(sets));

        //q10
        set.addAll(sets);
    }

    public static void bonusFour(){

        Map<String, Integer> map = new HashMap<>();

        map.put("Ali",10);
        map.put("John",5);
        map.put("Ahmad",8);
        map.put("Abu",2);

        //q1
        map.forEach((key, value) -> System.out.println(key));

        //q2
        map.forEach((key, value) -> System.out.println(key));

        //q3
        long count = map.entrySet().stream()
                .filter(n -> n.getValue() > 5)
                .count();
        System.out.println(count);

        //q4
        long countt =  map.entrySet().stream()
                .filter(n ->  n.getValue() < 10)
                .count();


        //q5
        map.entrySet().stream()
                .filter(n -> n.getValue() > 5)
                .forEach(n -> System.out.println(n.getKey()));

        //q6
        System.out.println(map.containsKey("Ali"));

        //q7
        System.out.println(map.containsValue(100));

        //q8
        map.remove("John");

        //q9
        List<String> list = map.entrySet().stream()
                .filter(n -> n.getValue() > 5)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println(list);

        //q10
        System.out.println(map.entrySet());
    }

    public static void bonusFive(){

        String word = "programming";

        //q1
        Map<Character, Integer> map =  new HashMap<>();
        for ( char c : word.toCharArray()){

            map.put(c,map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);

        //q2
        long count = word.toLowerCase()
                .chars()
                .filter(n -> n == 'a' ||
                        n == 'e' ||
                        n == 'i' ||
                        n == 'o' ||
                        n == 'u')
                .count();
        System.out.println(map);

        //q3
        System.out.println(word.length());

        //q4
        String words = new StringBuilder(word)
                .reverse()
                .toString();
        System.out.println(words);

        //q5
        String word1 = new StringBuilder(word)
                .reverse()
                .toString();
        System.out.println(word1.equals(word));

        //q6
        System.out.println(word.toUpperCase());

        //q7
        System.out.println(word.toLowerCase());

        //q8
        System.out.println(word.replace("pro" , "java"));

        //q9
        System.out.println(word.contains("gram"));

        //q10
        System.out.println(word.startsWith("pro"));
        System.out.println( word.endsWith("ing"));
    }

    public static void bonusSix(){

        List<Integer> list =
                Arrays.asList(1,1,2,2,2,3,4,5,5);

        //q1
        Map<Integer, Integer> map = new HashMap<>();
        long count = list.stream()
                .filter(n -> n ==1 || n == 2 || n==3 || n ==4 || n ==5)
                .count();
        System.out.println(count);

        //q2
        Map<Integer, Integer> map2 = new HashMap<>();

        for (int n : list){

            map.put(n, map.getOrDefault(n,0) + 1);
        }

        System.out.println(map2);

        //q3
        Set<Integer> set1 = new HashSet<>(list);
        int duplicates = list.size() - set1.size();
        System.out.println(duplicates);

        //q4
        int sum = list.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);

        //q5
        long countt = list.stream()
                .filter(n -> n % 2 ==0)
                .count();
        System.out.println(countt);

        //q6
        long coun1 = list.stream()
                .filter(n -> n % 2 != 0)
                .count();
        System.out.println(coun1);

        //q7
        OptionalInt max = list.stream()
                .mapToInt(Integer::intValue)
                .max();
        System.out.println(max);

        //q8
        OptionalInt min = list.stream()
                .mapToInt(Integer::intValue)
                .min();
        System.out.println(min);

        //q9
        long count2 = list.stream()
                .filter(n -> n > 2)
                .count();
        System.out.println(count2);

        //q10
        System.out.println(set1);

    }

}
