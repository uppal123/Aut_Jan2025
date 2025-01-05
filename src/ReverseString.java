public class ReverseString {
    String str = "Pooja";
    String reverse = "";

    public void reverse(){
        for(int i = str.length()-1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);

    }
    public static void main(String[] args) {
        ReverseString r = new ReverseString();
        r.reverse();
    }
}
