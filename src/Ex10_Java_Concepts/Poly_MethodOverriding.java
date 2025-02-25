package Ex10_Java_Concepts;

public class Poly_MethodOverriding {
    public static void main(String[] args) {
        Browser b = new TC();
        b.StartBrowser();
        b.StopBrowser();

        Browser b1 = new TC2();
        b1.StartBrowser();

    }
}
class Browser {
   // String browser = "Chrome";
    void StartBrowser(){
        System.out.println("Start browser in 3 sec");
    }
    void StopBrowser(){

    }
}
class TC extends Browser{

    void OpenBrowser() {
       StartBrowser();
    }

    @Override
    void StopBrowser() {
        super.StopBrowser();
        System.out.println("Stop browser");
    }
}
//method overriding
class TC2 extends Browser {
    @Override
    void StartBrowser() {
        System.out.println("Start browser in 2 sec ");
    }
}
