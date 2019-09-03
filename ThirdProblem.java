import rectangle.*;
import circle.*;
import ellipse.*;
import square.*;
public class ThirdProblem{
	public static void main(String args[]){
		rarea r= new rarea();
		carea c=new carea();
		earea e=new earea();
		sarea s=new sarea();
		r.rectarea();
		c.circarea();
		e.elliarea();
		s.squaarea();
	}
}