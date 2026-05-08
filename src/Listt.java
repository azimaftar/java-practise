import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listt {

    public static void testing(){

        List<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(7);
        list.add(2);
        list.add(9);
        list.add(5);

        System.out.println(list);


        int max = list.stream()
                .max(Integer::compare)
                .get();

        System.out.println("max " + max);

        int min = list.stream()
                .min(Integer::compare)
                .get();

        System.out.println("min " + min);

        long count =  list.stream()
                .filter(n -> n %2 ==0)
                .count();

        System.out.println("count  " + count);

        int sum = list.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("sum  " + sum);

        long countt = list.stream()
                .filter(n -> n >5)
                .count();

        System.out.println("count > 5  " + countt);
    }

    public static void test2(){


        List<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(7);
        list.add(2);
        list.add(9);
        list.add(5);

        long countOdd = list.stream()
                .filter(n ->  n %2 !=0 && n > 5)
                .count();

        System.out.println("count odd +  > 5  :" + countOdd);

        int sumEven = list.stream()
                .filter(n -> n %2 ==0 && n> 8)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("sum even + < 8 :" + sumEven);

        int max = list.stream()
                .filter(n ->  n %3 ==0)
                .max(Integer::compare)
                .orElse(-1);

        System.out.println("max divisible 3 :" + max);

        long count = list.stream()
                .filter(n -> n > 4 && n< 10)
                .count();

        System.out.println("count between  :" + count);

        int minOdd = list.stream()
                .filter((n -> n %2!= 0))
                .min(Integer::compare)
                .orElse(-1);

        System.out.println("min odd  :" + minOdd);
    }


    public static void test3(){
        List<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(7);
        list.add(2);
        list.add(9);
        list.add(5);

        long count = list.stream()
                .filter(n -> n > list.stream()
                        .mapToInt(Integer::intValue)
                        .sum() / list.size())
                .count();

        System.out.println("count > average  :" + count);

        int sumOdd = list.stream()
                .filter(n -> n %2 != 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("sum odd :" + sumOdd);

        long countBoth = list.stream()
                .filter(n -> n % 2 ==0 && n %3== 0)
                .count();

        System.out.println("count both :" + countBoth);

        long countTwo = list.stream()
                .filter(n -> n %2 !=0)
                .count();

        System.out.println("count not divisible 2 :" + countTwo);

        List<Integer> newlist = Arrays.asList(12, 34, 56, 78);

        long countDigit = newlist.stream()
                .filter(n -> String.valueOf(n)
                        .chars()
                        .map(Character::getNumericValue)
                        .sum() % 2 ==0)
                .count();

        System.out.println("count digit sum even:" + countDigit);

    }

    public static void test4() {
        List<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(7);
        list.add(2);
        list.add(9);
        list.add(5);

        long count = list.stream()
                .filter(n -> n %2!=0)
                .count();

        long countt = list.stream()
                .filter(n -> n > list.stream()
                        .mapToInt(Integer::intValue)
                        .sum()/list.size())
                .count();

    }


}
