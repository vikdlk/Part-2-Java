package _03Collections._05HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExm1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Vikotor Dulko");
        map1.put(1100, "Marija Sidorova");
        map1.putIfAbsent(1100, "Igor Stex");
        map1.put(1800, "Vasia Vetrov");
        map1.put(1200, "Ivan Ivanov");
        map1.put(3250, "Ivan Ivanov");
        map1.put(null, "Laimis Petrikas");
        map1.put(76534, null);
        System.out.println("Before action:" + map1);
//        System.out.println(map1.get(3250));
        map1.remove(76534);
        map1.remove(null);
//        System.out.println(map1);
//        System.out.println(map1.containsValue("Ivan Ivanov"));
        System.out.println(map1.keySet());
        System.out.println(map1.values());
    }
}
