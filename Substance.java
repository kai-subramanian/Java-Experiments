import java.util.*;
class BoilingPoint{
	public void diff(double per){
		double temp,per1,per2;
		temp=0.05*per;
		per1=per-temp;
		per2=per+temp;
		System.out.println("lower limit is : "+per1);
		System.out.println("upper limit is : "+per2);
		if(per>=95 && per<= 105){
			System.out.println("Water");
		}
		else if(per>=339.15 && per<= 374.85){
			System.out.println("Mercury ");
		}
		else if(per>=1127.65 && per<= 1246.35){
			System.out.println("Copper");
		}
		else if(per>=2083.35 && per<= 2302.65){
			System.out.println("Silver");
		}
		else if(per>=2527 && per<= 2793){
			System.out.println("Gold");
		}
		else{
			System.out.println("Sorry! Substance not found . . . . .");
		}
	
	}
}
public class Substance{
	public static void main(String args[]){
		double p;
		BoilingPoint bp=new BoilingPoint();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the boiling point : ");
		p=in.nextDouble();
		bp.diff(p);
	}
}