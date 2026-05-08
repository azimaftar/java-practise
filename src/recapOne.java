import java.util.*;
import java.util.HashMap;
import java.util.stream.Collectors;

public class recapOne {

    public static void sectionOne(){


        int[] arr = {3,7,2,9,5,6,8};

        //q1
        long count = Arrays.stream(arr)
                .filter(n -> n%2 !=0)
                .count();
        System.out.println(count);

        //q2
        int sum = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .sum();
        System.out.println(sum);

        //q3
        OptionalInt max = Arrays.stream(arr)
                .max();
        System.out.println(max);

        //q4
        OptionalInt min = Arrays.stream(arr)
                .min();
        System.out.println(min);

        //q5
        long countt = Arrays.stream(arr)
                .filter(n -> n> 5)
                .count();
        System.out.println(countt);

        //q6
        int summ = Arrays.stream(arr)
                .filter(n -> n < 7)
                .sum();
        System.out.println(summ);

        //Q7
        long counttt = Arrays.stream(arr)
                .filter(n -> n %3==0)
                .count();
        System.out.println(counttt);

        //q8
        OptionalInt maxx = Arrays.stream(arr)
                .filter(n -> n %2 == 0 )
                .max();
        System.out.println(maxx);

        //q9
        OptionalInt minn = Arrays.stream(arr)
                .filter(n -> n %2 != 0)
                .min();
        System.out.println(minn);

        //10
        long counnt = Arrays.stream(arr)
                .filter(n -> n >4 && n< 8)
                .count();
        System.out.println(counnt);
    }

    public  static void sectionTwo(){

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        //q1
        long count = list.stream()
                .filter(n -> n %2 ==0)
                .count();
        System.out.println(count);

        //q2
        int sum = list.stream()
                .filter(n -> n %2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);

        //q3
        OptionalInt max = list.stream()
                .filter(n -> n %3 ==0)
                .mapToInt(Integer::intValue)
                .max();
        System.out.println(max);

        //q4
        long countt = list.stream()
                .filter(n -> n > list.stream()
                        .mapToInt(Integer::intValue)
                        .sum()/list.size()
                ).count();
        System.out.println(countt);

        //q5
        List<Integer> newList = list.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println(newList);

        //q6
        List<Integer> innList = list.stream()
                .filter(n -> n > 5)
                .toList();
        System.out.println(innList);

        //q7
        long ccount = list.stream()
                .filter(n -> n % 2 ==0 && n % 3 == 0)
                .count();
        System.out.println(ccount);

        //q8
        OptionalInt min = list.stream()
                .filter(n -> n % 2 ==0 )
                .mapToInt(Integer::intValue)
                .min();
        System.out.println(min);

        //q9
        long ccoont  = list.stream()
                .filter(n -> n > 3 && n < 8)
                .count();
        System.out.println(ccoont);

        //q10
        int summ = list.stream()
                .filter(n -> n > 4 && n < 9)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(summ);

    }

    public static  void  sectionThree(){

        List<Integer> list = Arrays.asList(1,2,2,3,4,4,5,6,6);

        //q1
        Set<Integer> set = new HashSet<>(list);

        //q2
        System.out.println(set.size());

        //q3
        long count = set.stream()
                .filter(n -> n % 2== 0)
                .count();
        System.out.println(count);

        //q4
        int sum = set.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);

        //q5
        OptionalInt max = set.stream()
                .mapToInt(Integer::intValue)
                .max();
        System.out.println(max);

        //q6
        OptionalInt min = set.stream()
                .mapToInt(Integer::intValue)
                .min();
        System.out.println(min);

        //q7
        set.contains(5);

        //q8
        set.remove(2);

        //q9
        long countt = set.stream()
                .filter(n -> n >3 )
                .count();
        System.out.println(countt);

        //q10
        Set<Integer> newSet = new HashSet<>(Arrays.asList(1,2,2,3,4,4,5,6,6));
        set.retainAll(newSet);
    }

    public static void sectionFour(){

        List<Integer> list = Arrays.asList(2,4,6,8,10);

        //q1
        boolean match  = list.stream()
                .anyMatch(n -> n > 8);
        System.out.println(match);

        //q2
        boolean match2 = list.stream()
                .allMatch(n -> n % 2 ==0 );
        System.out.println(match2);

        //q3
        boolean match3 = list.stream()
                .noneMatch(n -> n < 0);
        System.out.println(match3);

        //q4
        boolean match4 = list.stream()
                .anyMatch(n -> n % 5 ==0 );
        System.out.println(match4);

        //q5
        boolean match5 = list.stream()
                .allMatch(n -> n > 0);
        System.out.println(match5);
    }

    public static void sectionFive(){

        Map<String, Integer> map = new HashMap<>();

        map.put("Ali", 10);
        map.put("John", 5);
        map.put("Ahmad", 8);
        map.put("Abu", 2);

        //q1
        map.entrySet()
                .forEach(n -> System.out.println(n.getKey()));

        //q2
        map.entrySet()
                .forEach(n -> System.out.println(n.getValue()));

        //q3
        System.out.println(map.size());

        //q4
        System.out.println(map.containsKey("Ali"));

        //q5
        System.out.println(map.containsValue(100));

        //q6
        map.remove("John");
        System.out.println(map);

        //q7
        map.entrySet()
                .stream().filter(n -> n.getValue() >5 )
                .forEach(n -> System.out.println(n));

        //q8
        long countt = map.entrySet()
                .stream().filter(n -> n.getValue() < 10)
                .count();

        //q9
        List<String > list = map.entrySet()
                .stream().filter(n -> n.getValue() > 5)
                .map(n -> n.getKey())
                .toList();

        //q10
        System.out.println(map.entrySet());
    }

    public static void sectionSix(){

        int[] numbers = {1,1,2,2,2,3,4,5,5};
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : numbers){
            map.put(i,map.getOrDefault(i, 0) +1);
        }

        System.out.println(map);
    }

    public static void sectionSeven(){

        String word = "programming";

        //q1
        String reverse = new StringBuilder(word)
                .reverse()
                .toString();
        System.out.println(reverse);

        //q2
        String palin = new StringBuilder(word)
                .reverse()
                .toString();
        System.out.println(palin.equals(word));

        //q3
        long count = word.toLowerCase()
                .chars()
                .filter(n -> n == 'a' ||
                                n == 'e' ||
                                n =='i' ||
                                n == 'o' ||
                                n == 'u' )
                .count();
        System.out.println(count);

        //q4
        System.out.println(word.toLowerCase());

        //q5
        System.out.println(word.toUpperCase());

        //q6
        System.out.println(word.contains("gram"));

        //q7
        System.out.println(word.startsWith("pro"));

        //q8
        System.out.println(word.endsWith("ing"));

        //q9
        System.out.println(word.replace("pro","java"));

        //q10
        System.out.println(word.length());
    }

    public static void sectionEight(){

        String word = "banana";
        Map<Character, Integer> map = new HashMap<>();

        for (char c : word.toCharArray()){

            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
    }



    //After this
    //
    //Then we move to:
    //
    //🔥 String + Streams Advanced
    //duplicate characters
    //unique characters
    //anagram
    //sorting characters
    //longest word
    //word frequency
    //
    //That’s the REAL interview level string section.
}
