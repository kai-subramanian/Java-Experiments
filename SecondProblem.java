import first.Details;
import second.Marks;
import java.util.*;
import java.io.*;
public class SecondProblem{
	public static void main(String args[])throws IOException{
		Details d=new Details();
		d.getdet();
		d.getmark();
		Marks m= new Marks();
		m.sumavg(d.m1,d.m2,d.m3);
	}
}
