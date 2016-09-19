package ua.artcode.week7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by serhii on 9/17/16.
 */
public class MapOperations {

    public static void main(String[] args) {
        Map<String, String> map = generateMap();

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.printf("key %s, value %s\n", key, map.get(key));
        }
        System.out.println();

        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        entrySet.stream().forEach(
                (entry) ->
                        System.out.printf("%s - %s\n",
                                        entry.getKey(), entry.getValue()));

        System.out.println();

        map.forEach((k,v) -> System.out.printf("%s - %s\n", k,v));



    }

    private static Map<String, String> generateMap() {
        Map<String, String> map = new HashMap<>();
        map.put("1","Kolia");
        map.put("2","Vasia");
        map.put("3","Oleg");
        map.put("4","Serhii");
        return map;
    }


}
