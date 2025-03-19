package Ex13_Collection_Framework.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ex009_TreeExample {
    public static void main(String[] args) {
        Map hm = new HashMap(); //no order maintained
        hm.put("name","Pooja");
        hm.put("rollno", 1);
        hm.put("phone", 678990098);
       // hm.replace("phone", "mobile");
       // hm.remove("phone");
        System.out.println(hm);

        System.out.println("-----------");

        Map lm = new LinkedHashMap(); //order maintained
        lm.put("name","Pooja");
        lm.put("rollno", 1);
        lm.put("phone", 678990098);
        System.out.println(lm);

        System.out.println("--------------");

        Map tm= new TreeMap(); //default order
        tm.put("name","Pooja");
        tm.put("rollno", 1);
        tm.put("phone", 678990098);
        System.out.println(tm);
    }
}
