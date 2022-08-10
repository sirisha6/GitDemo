import java.lang.Exception;
public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int result = a / b;
        }
        catch (ArithmeticException AE) {
            System.out.println(AE);
        }
        try {
            String string1 = null;
            int length = string1.length();
        }
        catch (NullPointerException NE) {
            System.out.println(NE);
        }
        try {
            int array[] = new int[5];
            array[10] = 0;
        }
        catch (ArrayIndexOutOfBoundsException AE) {
            System.out.println(AE);
        }
        try{
             String string2="abc";
             int i=Integer.parseInt (string2);
        }
        catch (NumberFormatException NFE){
            System.out.println(NFE);
        }

    }
}
