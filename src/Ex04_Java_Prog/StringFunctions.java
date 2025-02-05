package Ex04_Java_Prog;

public class StringFunctions {
    public static void main(String[] args) {
        String s1 = "Pooja";
        String s2 = "Uppal";
        String s4= "pooja";
        String s5= "pooja";
        String s6= new String("pooja");
        System.out.println(s4==s5); //true, cz both reference variable is pointing same string
        System.out.println(s4==s6); // false, cz s6 string stored in heap area
        //equals
        System.out.println("1. address compare:"+s1==s4);
        System.out.println("2. equals: "+s1.equals(s4));
        //equalIgnorecase
        System.out.println("3. equal ignore case: " +s1.equalsIgnoreCase(s4));

        //charAt()
        System.out.println("4. char at: "+s1.charAt(4));

        //length()
        System.out.println("5. length:"+ s1.length());

        //Upparcase
        System.out.println("6. Uppar case :" +s1.toUpperCase());

        //Lowercase
        System.out.println("7. Lower case: "+s1.toLowerCase());

        //concat
        System.out.println("8. concat: "+s1.concat(s2));

        //contains
        System.out.println("9. contains: "+s1.contains("oo"));

        //indexof
        System.out.println("10. index: "+s1.indexOf('o'));

        //replace
        System.out.println("11. replace j with r: "+s1.replace('j','r'));

        //substring
        System.out.println("12. substring: "+ s1.substring(3,4));

        // replaceAll()
        System.out.println("13. replace all: "+s1.replace('p','P'));

        //startsWith()
        System.out.println("14. starts with: "+s1.startsWith("p"));

        //endsWith()
        System.out.println("15. ends with: "+s1.endsWith("a"));

        //isEmpty()
        System.out.println("16. is empty: "+s1.isEmpty());

        //compareTo()
        System.out.println("17. compare to: "+s1.compareTo("Pooja"));

        //compareToIgnoreCase()
        System.out.println("18. compare to ignore case: "+s1.compareToIgnoreCase("pooja"));

        //lastIndexOf()
        System.out.println("19. last index of: "+s1.lastIndexOf("j"));

        //repeat()
        System.out.println("20. repeat string: "+s1.repeat(4));

        //trim
        String s3= "     Pooja  ";
        System.out.println("21. Trim: "+s3.trim());

    }
}