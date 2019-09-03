import java.util.*;
public class Kai {
 public static void main(String args[] ) {
        
        float tot,num,rate;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of units and the rate per bill");
        num=in.nextFloat();
        rate=in.nextFloat();
        tot=num*rate;
        System.out.println("Total Bill is :"+tot);
        
    }
    
}
