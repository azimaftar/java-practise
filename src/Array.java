import java.awt.image.CropImageFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

class Array {

    public static void findMax(){
        int[] arr = {3, 7, 2, 9, 5};

        int max = Arrays.stream(arr)
                .max()
                .getAsInt();

        System.out.println(max);
    }

    public static void findMaxx(){

        int[] name = {1,2,3,4,5,6};

        int high = Arrays.stream(name)
                .max()
                .getAsInt();

        System.out.println(high);
    }

    public static void findMaxxx() {

        int[] all = {2, 3, 4, 5, 6, 7, 8};

        int highest = Arrays.stream(all)
                .max()
                .getAsInt();

        System.out.println(highest);
    }

    public static void findMaxxxx(){
        int [] alll = {12,15,55,66,45,97};

        int highest = Arrays.stream(alll)
                .max()
                .getAsInt();

        System.out.println(highest);
    }

    public static void countEven(){

        int[] arr = {1, 2, 3, 4, 5, 6};

        long count = Arrays.stream(arr)
                .filter(num -> num % 2 == 0)
                .count();

        System.out.println(count);
    }

    public static void countEvenn(){
        int[] num = {1,3,4,5,6,7,8,9,11,223,43};

        long count = Arrays.stream(num)
                .filter(n -> n % 2 == 0)
                .count();

        System.out.println(count);
    }

    public static  void countEvennn(){
        int[] num = {1,2,3,4,5,6,7,8,9,12};


        long counter = Arrays.stream(num)
                .filter(n -> n % 2 == 0)
                .count();

        System.out.println(counter);
    }

    public static void countEvennnn(){

        int [] arr = {1,2,3,4,5,6,5};

        long couter = Arrays.stream(arr)
                .filter(n -> n %2==0)
                .count();

        System.out.println(couter);

    }


    public static  void reverse(){

        int num = 1234;

        String reversed = new StringBuilder(String.valueOf(num))
                .reverse()
                .toString();

        System.out.println(Integer.parseInt(reversed));
    }

    public static void reversee(){
        int arr = 12345;

        String reverse = new StringBuilder(String.valueOf(arr))
                .reverse()
                .toString();

        System.out.println(Integer.parseInt(reverse));
    }

    public static void reverseee(){

        int arr = 123456;


        String reverse = new StringBuilder(String.valueOf(arr))
                .reverse()
                .toString();

        System.out.println(Integer.parseInt(reverse));
    }

    public static void getSum(){

        int num = 123;

        int sum = String.valueOf(num)
                .chars()
                .map(Character::getNumericValue)
                .sum();

        System.out.println(sum);
    }

    public static void getSumm(){

        int num = 22345;

        int sum = String.valueOf(num)
                .chars()
                .map(Character::getNumericValue)
                .sum();

        System.out.println(sum);
    }

    public static void gtSummm(){

        int all = 12345678;

        int nw = String.valueOf(all)
                .chars()
                .map(Character::getNumericValue)
                .sum();

        System.out.println(nw);
    }

    //Test 1

    public static void test1(){

        int[] arr = {3, 7, 2, 9, 5};

        int max = Arrays.stream(arr)
                .max()
                .getAsInt();

        System.out.println("max " + max);

        int min = Arrays.stream(arr)
                .min()
                .getAsInt();

        System.out.println("min " + min);

        long count = Arrays.stream(arr)
                .filter(a -> a %2 ==0)
                .count();

        System.out.println("count " + count);

        int sum = Arrays.stream(arr)
                .sum();

        System.out.println("array sum " + sum);

        int sumDigit = String.valueOf(sum)
                        .chars()
                        .map(Character::getNumericValue)
                        .sum();


        System.out.println("digit sum "  + sumDigit);

        long numFive = Arrays.stream(arr)
                .filter(a -> a > 5)
                .count();

        System.out.println("count num > 5  "  + numFive);

    }

    //Test 2

    public static void test2() {

        int[] arr = {3, 7, 2, 9, 5, 6, 8};

        long count = Arrays.stream(arr)
                .filter(a -> a %2 != 0)
                .count();

        System.out.println("count odd  "  + count);


        int sum = Arrays.stream(arr)
                .filter(a -> a >5)
                .sum();

        System.out.println("sum > 5  "  + sum);

        long countt = Arrays.stream(arr)
                .filter(a -> a <5)
                .count();

        System.out.println("count < 5  "  + countt);


        int max = Arrays.stream(arr)
                .filter(a -> a %2 ==0)
                .max()
                .getAsInt();

        System.out.println("even max "  + max);

        int min = Arrays.stream(arr)
                .filter( a -> a <5)
                .min()
                .getAsInt();

        System.out.println("< 5 min  "  + min);

        long countAll =  Arrays.stream(arr)
                .count();

        System.out.println("count all "  + countAll);

        int sumEven = Arrays.stream(arr)
                .filter(a -> a %2 ==0)
                .sum();

        System.out.println("sum even "  + sumEven);

        int num = 9876;

        int summ = String.valueOf(num)
                .chars()
                .map(Character::getNumericValue)
                .sum();

        System.out.println("sum digit "  + summ);

        int[] arrr = {12, 34, 56, 78};

        long counttt = Arrays.stream(arrr)
                .filter(a -> String.valueOf(a)
                        .chars()
                        .map(Character::getNumericValue)
                        .sum() > 5)
                .count();

        System.out.println("count digit sum > 5 "  + counttt);


        long divisible = Arrays.stream(arr)
                .filter(a -> a % 3==0)
                .count();

        System.out.println("divisible by 3 "  + divisible);

    }

    //Test 3

    public static void test3() {

        int[] arr = {3, 7, 2, 9, 5, 6, 8};

        long count = Arrays.stream(arr)
                .filter(n -> n > 5 && n %2 !=0)
                .count();

        System.out.println("odd and > 5 :"  + count);

        int sum = Arrays.stream(arr)
                .filter(n -> n%2==0 && n <8)
                .sum();

        System.out.println("even and < 8 :"  + sum);

        OptionalInt max = Arrays.stream(arr)
                .filter(n-> n %3==0)
                .max();

        System.out.println("max divisible 3 :"  + max);


        long countbet = Arrays.stream(arr)
                .filter(n -> n >4 && n<10)
                .count();

        System.out.println("count between :"  + countbet);

        int sumTwo = Arrays.stream(arr)
                .filter(n -> n%2 != 0)
                .sum();

        System.out.println("sum divisible 2 :"  + sumTwo);

        long countAvg = Arrays.stream(arr)
                .filter(n -> n > Arrays.stream(arr).sum()/arr.length)
                .count();

        System.out.println("count > average :"  + countAvg);

        OptionalInt min = Arrays.stream(arr)
                .filter(n -> n %2 != 0)
                .min();

        System.out.println("min odd :"  + min);

        long digitSumEven = Arrays.stream(arr)
                .filter(n -> String.valueOf(n)
                        .chars()
                        .map(Character::getNumericValue)
                        .sum() %2 == 0)
                .count();

        System.out.println("digit sum even :"  + digitSumEven);

    }


    public static void test4() {

        int[] arr = {3, 7, 2, 9, 5, 6, 8};

        long count = Arrays.stream(arr)
                .filter(n -> n %2!=0 && n >5)
                .count();

        int sum = Arrays.stream(arr)
                .filter(n -> n %2==0 && n<8)
                .sum();

        OptionalInt max = Arrays.stream(arr)
                .filter(n -> n %3==0)
                .max();

        long countt = Arrays.stream(arr)
                .filter(n -> n > Arrays.stream(arr).sum()/ arr.length)
                .count();

        int[] arrr = {12, 34, 56, 78};

        long counttt =  Arrays.stream(arrr)
                .filter(n -> String.valueOf(n)
                        .chars()
                        .map(Character::getNumericValue)
                        .sum() %2 ==0)
                .count();
    }


}






