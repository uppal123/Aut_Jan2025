public class EvenOddCheck {
    public String evenOrOdd(int number){
//       if (number % 2 == 0) {
//           return "even";
//       } else {
//           return "odd";
//       }
        return (number % 2 == 0) ? "even": "odd";

    }

    /*
    condition ? true case : false case
     */

    public static void main(String[] args) {
        EvenOddCheck e = new EvenOddCheck();
        String result = e.evenOrOdd(98);
        System.out.println(result);
    }
}
