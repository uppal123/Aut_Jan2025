package Ex13_Collection_Framework.List;

import java.util.ArrayList;

public class Ex001_ArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Pooja");
        arrayList.add("Rian");
        arrayList.add(null);
        arrayList.add("Rian"); //duplicate is allowed
        arrayList.add(123); //different datatype is allowed
        System.out.println(arrayList);
        System.out.println(arrayList.size());



    }
}
