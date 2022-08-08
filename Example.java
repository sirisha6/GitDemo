import java.util.*;
public class Example {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int n=sc.nextInt();
        if(x>=n){
            System.out.println("L1");
        }
        else if (y>=n){
            System.out.println("L2");
        }
        else{
            System.out.println("L3");
        }
    }
}
//commit added