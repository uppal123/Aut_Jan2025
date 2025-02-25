package Ex10_Java_Concepts;

public class AbstractClass {
    public static void main(String[] args) {
        Book B = new Section();
        B.Search();
        B.addBook();

    }
}
abstract class Book {
  abstract void Search();
  void addBook() {
      System.out.println("New book is added in collection");
  }
}
class Section extends Book {
    @Override
    void addBook() {
        super.addBook();
    }
    @Override
    void Search() {
        System.out.println("Search books alphabetically");
    }


}
