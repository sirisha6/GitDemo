import java.util.*;
public class Example {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int n=sc.nextInt();
        int a=n-x,b=n-z;
        if (b<n-z && n-z<0){
            System.out.println("L3");
        }
        else if(a<n-y && n-y<0){
            System.out.println("L2");
        }
        else{
            System.out.println("L1");
        }
    }
}
//commit