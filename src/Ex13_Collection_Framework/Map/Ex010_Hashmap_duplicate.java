package Ex13_Collection_Framework.Map;

import java.util.HashMap;
import java.util.Map;

public class Ex010_Hashmap_duplicate {
    public static void main(String[] args) {
        Map m1= new HashMap();
        m1.put(null, "Pooja");
        m1.put(null,"Uppal"); //duplicate keys are not allowed
        m1.put("name", "Pooja");
        m1.put("fname", "Pooja"); //duplicate values are allowed
        System.out.println(m1);
        System.out.println(m1.isEmpty());
        System.out.println(m1.keySet());
        System.out.println(m1.values());
        System.out.println(m1.size());
        System.out.println(m1.containsKey("name"));
        System.out.println(m1.containsValue("Pooja"));
        System.out.println(m1.get(null));

        //iterate over map by using advance for each loop

//        for(Map.Entry<String, Integer> item :m1.entrySet()) {
//            System.out.println(item.getKey() + "->" +item.getValue());
//        }

    }
}
