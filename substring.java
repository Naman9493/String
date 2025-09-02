import java.util.Scanner;

public class substring {
    public static String sub(String s, int si,int ei) {
        String a="";
        for(int i=si;i<ei;i++){
            a=a+s.charAt(i);
        }
        return a;
    }
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        System.out.print("enter string: ");
        String s=sc.next();
        System.out.println(sub(s,0,5));

    //     // DIRECT
        System.out.println(s.substring(0,5));
    
    }

}
