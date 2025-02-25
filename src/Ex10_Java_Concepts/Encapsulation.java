package Ex10_Java_Concepts;

public class Encapsulation {
    public static void main(String[] args) {
    Bank b = new Bank("abcd", "Test@123");
       // System.out.println(b.getPassword());
        b.Loginvalidation();
    //b.setPassword("");
    //b.getPassword();
    }
}

class Bank {
    String username;
    private String password;

    Bank(String username, String password) {
        this.username = username;
        this.password = password;
        System.out.println("enter login details:");
    }
    public void Loginvalidation() {
        System.out.println(username);
        System.out.println(password);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
