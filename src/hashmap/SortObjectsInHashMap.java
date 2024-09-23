package hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortObjectsInHashMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 50);
        map.put("Banana", 20);
        map.put("Orange", 30);
        map.put("Mango", 40);

        LinkedHashMap<String, Integer> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        sortedMap.forEach((k,v)->System.out.println(k+" :: "+v));
    }
}
