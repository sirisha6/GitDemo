import java.util.*;
import java.lang.Exception;
public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            if (age >= 25) {
                System.out.println("You are eligible");
            } else {
                throw new EligibilityException();
            }
        } catch (EligibilityException EE) {
            System.out.println("Eligibility Exception:You are not eligible ");
        }
    }
}
     class EligibilityException extends Exception{
    }





