import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringHandling {

    public static  void testing(){

        String word = "hello";

        String reverse = new StringBuilder(word)
                .reverse().toString();
        System.out.println(reverse);

        String back = new StringBuilder(word)
                .reverse().toString();
        System.out.println(word.equals(back));

        System.out.println(word.length());
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        System.out.println(word.contains("he"));
        System.out.println(word.startsWith("he"));
        System.out.println(word.endsWith("lo"));

        String result = word.replace("he" , "bro");
        System.out.println(result);

        String text = "apple,banana,orange";
        String[] bro = text.split(",");
        System.out.println(Arrays.toString(bro));

        String words = "education";
        long count = words.toLowerCase()
                .chars()
                .filter(n -> n =='a' || n =='e')
                .count();
        System.out.println(count);

        String wordd = "apple";
        Map<Character, Integer> map = new HashMap<>();
        for (char c : wordd.toCharArray()){
            map.put(c,map.getOrDefault(c,0) +1);
        }
        System.out.println(map);
    }

}
