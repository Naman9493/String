import java.util.*;
public class sortest_path {
    public static float path(String s) {
        int x=0;
        int y=0;
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)=='N'){
                y++;
            }
            else  if(s.charAt(i)=='S'){
                y--;
            }
            else  if(s.charAt(i)=='E'){
                x++;
            }
            else  if(s.charAt(i)=='W'){
                x--;
            }
        }
         int t=x*x;
         int p=y*y;
        float a= (float)Math.sqrt(t+p);
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter string: ");
        String s=sc.next();
        float b=path(s);
        System.out.println(b+" ");
    }
}
