import javax.swing.plaf.OptionPaneUI;
import java.util.*;
import java.util.stream.Collectors;

public class java8Stream {

    public static void testingMap(){

        List<Integer> list =
                Arrays.asList(1,2,3,4,5);

        List<Integer>num = list.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println(num);

        List<Integer> nums =list.stream()
                .map(n -> n + 10)
                .collect(Collectors.toList());
        System.out.println(nums);

        List<String> numb = list.stream()
                .map(n -> String.valueOf(n))
                .collect(Collectors.toList());
        System.out.println(numb);

        List<Integer> sqaure = list.stream()
                .map(n -> n^2)
                .collect(Collectors.toList());
        System.out.println(sqaure);

        List<Integer> nu = list.stream()
                .map(n -> n +1)
                .collect(Collectors.toList());
        System.out.println(nu);


        List<String> listt =
                Arrays.asList("java","spring","boot");

        List<String> str = listt.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(str);

        List<String> str1 = listt.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println(str1);

        List<String> maper =  listt.stream()
                .map(n -> n.concat("DEV-"))
                .collect(Collectors.toList());
        System.out.println(maper);

        List<Integer> len =  listt.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(len);

        List<String> ne = listt.stream()
                .map(n -> n.replace("java","backend"))
                .collect(Collectors.toList());
        System.out.println(ne);
    }

    public static void testingSort(){

        List<Integer> list = Arrays.asList(7, 2, 9, 1, 5, 3);

        System.out.println(list.stream()
                .sorted()
                .collect(Collectors.toList()));

        System.out.println(list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()));

        List<Integer> sorted = list.stream()
                .filter(n ->  n >3)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sorted);

        List<Integer> sort = list.stream()
                .filter(n -> n % 2 ==0)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sort);

        List<Integer> newlist = list.stream()
                .map(n -> n * 2)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(newlist);

        List<String> list1 = Arrays.asList("java", "spring", "boot", "api");

        List<String> list2 = list1.stream()
                .sorted().
                collect(Collectors.toList());
        System.out.println(list2);

        List<String> list3 = list1.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(list3);

        List<String> list4 =  list1.stream()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());
        System.out.println(list4);

        List<String> list5 = list1.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .collect(Collectors.toList());
        System.out.println(list5);

        List<String> list6 =list1.stream()
                .filter(n -> String.valueOf(n).contains("a"))
                .sorted()
                .collect(Collectors.toList());
        System.out.println(list6);
    }

    public static void testingDistinct(){

        List<Integer> list =
                Arrays.asList(1,2,2,3,4,4,5,5,6);

        List<Integer> intt = list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(intt);

        long count =list.stream()
                .distinct()
                .count();
        System.out.println(count);

        int sum = list.stream()
                .distinct()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);

        OptionalInt max = list.stream()
                .distinct()
                .mapToInt(Integer::intValue)
                .max();
        System.out.println(max);

        OptionalInt min= list.stream()
                .distinct()
                .mapToInt(Integer::intValue)
                .min();
        System.out.println(min);

        long count1 = list.stream()
                .filter(n -> n % 2 == 0)
                .distinct()
                .count();
        System.out.println(count1);

        List<Integer> list1 = list.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(list1);

        List<Integer> list2 = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(list2);

        List<Integer> list3 = list.stream()
                .distinct()
                .filter(n -> n >3)
                .collect(Collectors.toList());
        System.out.println(list3);

        List<Integer> list4 = list.stream()
                .distinct()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println(list4);

        List<String> listt =
                Arrays.asList("java","api","java","spring","api");

        List<String> listt1 = listt.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(listt1);

        List<String> listt2 = listt.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(listt2);

        long countt = listt.stream()
                .distinct()
                .count();
        System.out.println(countt);

        List<String> list5 = list.stream()
                .distinct()
                .map(n -> String.valueOf(n).toUpperCase())
                .sorted()
                .collect(Collectors.toList());
        System.out.println(list5);

        List<String> list6 = listt.stream()
                .distinct()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());
        System.out.println(list6);

    }

    public static void  testingFlatmap(){

        List<List<Integer>> lists = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(3,4),
                Arrays.asList(5,6)
        );

        List<Integer> newlist = lists.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(newlist);

        int sum = lists.stream()
                .flatMap(Collection::stream)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);

        long count = lists.stream()
                .flatMap(Collection::stream)
                .count();
        System.out.println(count);

        OptionalInt max= lists.stream()
                .flatMap(Collection::stream)
                .mapToInt(Integer::intValue)
                .max();
        System.out.println(max);

        List<Integer> list = lists.stream()
                .flatMap(Collection::stream)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(list);

        List<Integer> mult =  lists.stream()
                .flatMap(Collection::stream)
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println(mult);

        List<Integer> lisr = lists.stream()
                .flatMap(Collection::stream)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(lisr);

        List<String> listr =
                Arrays.asList("java","spring");

        List<Character>liist = listr.stream()
                .flatMap(n -> n.chars()
                        .mapToObj(c -> (char)c))
                .collect(Collectors.toList());
        System.out.println(liist);

        long ccount = listr.stream()
                .flatMap(n -> n.chars()
                        .mapToObj(c -> (char)c))
                .count();
        System.out.println(ccount);

        List<Character> chaa = listr.stream()
                .flatMap(n -> n.chars()
                        .mapToObj(c -> (char)c))
                .filter(m -> m.equals('a') || m.equals('e') || m.equals('i') || m.equals('o') || m.equals('u'))
                .collect(Collectors.toList());
        System.out.println(chaa);

        List<String> cha1 = listr.stream()
                .flatMap(n -> n.chars()
                        .mapToObj(m -> (char)m))
                .map(c -> String.valueOf(c).toUpperCase())
                .collect(Collectors.toList());
        System.out.println(cha1);

        List<Character> cha2 = listr.stream()
                .flatMap(n -> n.chars()
                        .mapToObj(m -> (char)m))
                .sorted()
                .collect(Collectors.toList());
        System.out.println(cha2);

        long cont = listr.stream()
                .flatMap(n -> n.chars()
                        .mapToObj(m -> (char)m))
                .filter(c -> c.equals('a'))
                .count();
        System.out.println(cont);

        List<Character> jaua = listr.stream()
                .flatMap(n -> n.chars()
                        .mapToObj(m -> (char)m))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(jaua);
    }

}
