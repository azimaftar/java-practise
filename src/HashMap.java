import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMap {

    public static void testing() {

        Map<String, Integer> map = new java.util.HashMap<>();

        map.put("Azim", 1);
        map.put("Ali", 10);
        map.put("Ahmad", 2);
        map.put("Abu", 8);

        System.out.println(map);

        System.out.println(map.get("Azim"));
        System.out.println(map.containsKey("Azim"));
        System.out.println(map.containsValue(10));
        map.remove("Ali");
        System.out.println(map.size());
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        map.entrySet()
                .forEach(n -> System.out.println(n.getKey() + " :" + n.getValue()));

        map.entrySet().stream()
                .forEach(n -> System.out.println(n.getKey()));

        map.entrySet().stream()
                .filter(n -> n.getValue() >6)
                .forEach(n -> System.out.println(n.getValue()));

        map.entrySet().stream()
                .filter(n -> n.getValue() > 6)
                .count();

        List<String> list = map.entrySet().stream()
                .filter(n ->  n.getValue() > 6)
                .map(n -> n.getKey())
                .toList();

        int [] number = {1,1,2,2,2,3,4,5};
        Map<Integer, Integer> mapp = new java.util.HashMap<>();

        for(int m : number){
            mapp.put(m,mapp.getOrDefault(m,0) +1);
        }

        System.out.println(mapp);

    }
}
