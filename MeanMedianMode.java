import java.util.*;
public class MeanMedianMode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int array[] = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += array[i];
        }
        System.out.println("Mean of the array  :  " + sum);


        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                int temp = 0;
                if (array[j] < array[i]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        if (length % 2 != 0) {
            System.out.println("Medain of the array : " + (double) array[length / 2]);
        } else {
            System.out.println("Medain of the array : " + (double) (array[(length - 1) / 2] + array[length / 2]) / 2.0);
        }



        int maximumValue=0, count=0, maximumCount=0;

        for(int i=0;i<length;i++) {
            count = 0;
            for(int j=0;j<length;j++) {
                if(array[i] == array[j]) {
                    count++;
                }
            }
            if (count > maximumCount) {
                maximumCount = count;
                maximumValue = array[i];
            }
        }
        System.out.println("Mode of the array : "+maximumValue);
    }
}
