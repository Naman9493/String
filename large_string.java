import java.util.*;
public class large_string {
    public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
        // System.out.print("enter string: ");
        String s[]={"apple","banana","orange"};
        String large=s[0];
        for(int i=0;i<s.length;i++){
             if(large.compareTo(s[i])<0){
                large=s[i];
             }
        }
        System.out.println(large+" ");
    }
}