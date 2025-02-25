package Ex10_Java_Concepts;

public class Polymorphism {
    public static void main(String[] args) {
    Poly p= new Poly();
    p.sum(2,5);
    p.sum(2.3,5.7);
    p.sum(30, 7 , 9);
    }
}
//Method overloading
class Poly {
   int sum (int a, int b){
       System.out.println(a+b);
       return a+b;
   }

   int sum(int a, int b, int c){
       System.out.println(a+b+c);
       return a+b+c;
   }

   double sum( double a, double b){
       System.out.println(a+b);
       return a+b;
   }


}
