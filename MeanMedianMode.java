import java.util.*;
public class MeanMedianMode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int array[]=new int[length];
        for(int i=0;i<length;i++){
            array[i]=sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += array[i];
        }
        System.out.println("Mean of the array  :  "+sum);
        
    }
}
