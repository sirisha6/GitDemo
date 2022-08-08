import java.util.*;
public class CollatzSequenceA1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(n+" ");
        while(n>1){
            if(n%2==0){
                n=n/2;
                System.out.print(n+ " ");
            }
            else{
                n=3*n+1;
                System.out.print(n+" ");
            }
        }
    }
}
