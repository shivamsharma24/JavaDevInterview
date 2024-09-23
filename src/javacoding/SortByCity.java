package javacoding;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortByCity {
    public static void main(String[] args) {
        Map<String, EmployeeDTO> map = new HashMap<>();
        map.put("1", new EmployeeDTO(1, "ABC", "Mumbai"));
        map.put("2", new EmployeeDTO(2, "DEF", "Delhi"));
        map.put("3", new EmployeeDTO(3, "GHI", "Bangalore"));

        Map<String, EmployeeDTO> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparing(EmployeeDTO::getCity)))
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new));

        sortedMap.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
