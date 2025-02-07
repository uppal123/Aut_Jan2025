package EX05_if_else;

import java.util.Scanner;

public class TypeOfWebsite {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Site URL:");
        String url = sc.next();
        if(url.endsWith(".com")){
            System.out.println("Commercial website");
        }
        else if(url.endsWith(".org")){
            System.out.println("Non-profit organization");
        }
        else if(url.endsWith(".edu")){
            System.out.println("Educational institution");
        }
        else if(url.endsWith(".gov")){
            System.out.println("Government website");
        }
        else if(url.endsWith(".net")){
            System.out.println("Network-related website");
        }
        else if(url.endsWith(".info")){
            System.out.println("Informational website");
        }
        else{
            System.out.println("Unknown or other types of websites");
        }
    }
}
