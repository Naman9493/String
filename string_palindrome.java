import java.util.*;
public class string_palindrome {
     public static boolean pr( String str){
        for( int i=0;i<str.length()/2;i++){
             int n=str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
    }
        return true;
     }
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.print("enter string: ");
    String str=sc.next();
    boolean a=pr(str);
    System.out.println(a);
}
}

