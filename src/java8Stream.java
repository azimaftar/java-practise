import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class java8Stream {

    public static void testing(){

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

}
