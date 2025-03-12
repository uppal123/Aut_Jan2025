package Ex12_ExceptionHandling;

public class Ex_008_Throw_Example {
    static void Validate_age (int age) {
        if (age < 18) {
            try {
                throw new Exception("Age is less than 18");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

        public static void main (String[] args) {
         Validate_age(17);
        }
    }

