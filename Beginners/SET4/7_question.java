import java.util.*;
import java.lang.*;
public class swapp {
     public static void main(String aa[]){
     int a;
     int b;
     int t;
     Scanner s=new Scanner(System.in);
     a=s.nextInt();
     b=s.nextInt();
     t=a;
     a=b;
     b=t;
     System.out.printf("%d %d\n",a,b);
    }
}
