import java.lang.*;

public class StringOperations {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="World";
        int length=str1.length();
        System.out.println("Length of the string : "+length);

        String str3=str1.concat(str2);// (or)str1+str2
        System.out.println("Merging two Strings  :"+str3);

        String str4="Tulla-Sirisha";
        String str5[]=str4.split("-");
        for(int i=0;i<str5.length;i++){
            System.out.println("Splitting the string  :"+ str5[i]);
        }

        String temp="";
        char ch;
        for(int i=length-1;i>=0;i--){
            ch=str1.charAt(i);
            temp=temp+ch;
        }
        System.out.println("Reverse a String  :"+ temp);


        if(str1.equals(str2)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }
    }
}

