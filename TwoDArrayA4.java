import javax.swing.*;
import java.util.*;
public class TwoDArrayA4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Students=sc.nextInt();
        int Subjects=sc.nextInt();
        int array[][]=new int[Students][Subjects];
        int TotalArray[]=new int[Students];
        for(int i=0;i<Students;i++){
            int TotalMarksOfAllSubjects=0;
            for(int j=0;j<Subjects;j++){
                array[i][j]=sc.nextInt();
                TotalMarksOfAllSubjects+=array[i][j];
            }
            TotalArray[i]=TotalMarksOfAllSubjects;
        }
        int TopMaxArray[][]=new int[6][3];
        for(int i=0;i<Subjects;i++){
            for(int k=0;k<3;k++){
                int Maxi=Integer.MIN_VALUE;
                int temp2=-1;
                int temp1=-1;
                for(int j=0;j<Students;j++) {
                    if(Maxi<array[j][i] && j!=temp2 ){
                        Maxi=array[j][i];
                        temp1=j;
                    }
                }
                temp2=temp1;
                TopMaxArray[i][k]=temp1;
            }
        }
        int LessAvgArray[]=new int[6];
        int c=0;

        for(int i=0;i<Students;i++) {
            int count=0;
            for (int j = 0; j < Subjects; j++) {
                if(array[i][j]<50){
                    count++;
                }
            }
            if(count>0){
                LessAvgArray[c++]=i;
            }
        }
        System.out.println("Roll No"+"    "+"Total_Marks");
        for(int i=0;i<TotalArray.length;i++){
            System.out.println((i+1)+"    "+TotalArray[i]);
        }
        System.out.println("Top 3 People in Every Subject");
        String[] strarray = {"Eng","Tel","Hindi","Math","Sci","Soc"};
        for(int i=0;i<6;i++){
            System.out.print(strarray[i]+"  ");
            for(int j=0;j<3;j++){
                System.out.print(TopMaxArray[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Below Average Students: ");
        System.out.println("Student"+"    "+"TotalMarks");
        for(int i=0;i<LessAvgArray.length;i++){
            System.out.println((i+1)+"-->"+TotalArray[i]);
        }

        System.out.println("Total marks of every student");
        System.out.println("Students"+"   " +" TotalMarks");
        int sum=0;
        for(int i=0;i<TotalArray.length;i++){
            System.out.print((i+1)+"   "+TotalArray[i]);
            sum+=TotalArray[i];
        }
        System.out.print("Average Performance Of Total Class :"+ (sum/Students));
    }

}