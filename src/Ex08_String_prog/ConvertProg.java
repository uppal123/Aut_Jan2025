package Ex08_String_prog;

public class ConvertProg {
        public static void main(String[] args) {

                String input = "1hr 5min 6s 10ms";
                String[] inputArray = input.split(" ");
                Integer hours=0, minutes = 0, seconds = 0, miliSeconds = 0;

                for (String s : inputArray) {
                    if (s.endsWith("hr")) {
                        hours = Integer.parseInt(s.substring(0, s.length() - 2));
                    } else if (s.endsWith("min")) {
                        minutes = Integer.parseInt(s.substring(0, s.length() - 3));
                    } else if (s.endsWith("ms")) {
                        miliSeconds = Integer.parseInt(s.substring(0, s.length() - 2));
                    } else {
                        seconds = Integer.parseInt(s.substring(0, s.length() - 1));
                    }
                }
                System.out.println("Hours: " + hours + " Minutes: " + minutes + " Seconds : " + seconds + " Miliseconds :  " + miliSeconds);
                float timeInMinutes = hours*60 + minutes + (float)seconds/60 + (float)miliSeconds/60000;
                System.out.println("Time in minutes : " + timeInMinutes);
            }
}
