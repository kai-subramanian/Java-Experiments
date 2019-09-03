import java.util.*;
class CalcGadget{
	int pd,hdd,tab,hs;
	Scanner in=new Scanner(System.in);
	void getdet(){
		System.out.println("WELCOME TO MERCY ELECTRONICS");
		System.out.println("Enter the details of gadgets you want to buy");
		System.out.println("If any gadget(s) not needed, input 0 as quantity");
		System.out.println("Enter number of Transcend pendrives needed");
		pd=in.nextInt();
		System.out.println("Enter number of Sony headset needed");
		hs=in.nextInt();
		System.out.println("Enter number of Samsung tablet needed");
		tab=in.nextInt();
		System.out.println("Enter number of Seagate harddrives needed");
		hdd=in.nextInt();
	}
	void costcalc(){
		
		
		double x,tot,finc;
		x=(pd*500)+(hs*1000)+(tab*3500)+(hdd*4000);
		tot=0.12*x;
		finc=x-tot;
		System.out.println("The total amount to pay after festive discount(12%) is " +finc);
	}

}

public class Gadgets{
	public static void main(String args[]){
		CalcGadget cg= new CalcGadget();
		cg.getdet();
		cg.costcalc();
	}
}