package Ex08_String_prog;

public class ConvertTimeintoMinute {
    public static void main(String[] args) {
    String str= "1hr 5min 6s 10ms";
    float result = 0;
    float totaltimeinmin;
    String[] arr = str.split(" ");

    for (int i = 0; i < arr.length; i++) {

        int numberValue = Integer.parseInt(arr[i].replaceAll("[^0-9]", ""));
        if (arr[i].endsWith("hr")) {
            ///  multiply 3600000
            result = result + (numberValue * 3600000);
            continue;
        } else if (arr[i].endsWith("min")) {
            result = result + (numberValue * 60000);
            continue;
        } else if (arr[i].endsWith("ms")) {
            result = result + numberValue;
            continue;
        } else if (arr[i].endsWith("s")) {
            result = result + (numberValue * 1000);
            continue;
        }
    }
    System.out.println("total time:" +result);
    totaltimeinmin= (result)/60000;
    System.out.println("total time in minutes :" +totaltimeinmin);
    }
}
