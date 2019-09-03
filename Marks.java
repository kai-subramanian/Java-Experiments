import java.util.*;
import java.io.*;

class Student1{
	int r,m,p,c,cs;
	float sum,avg;
	public void getdet(){
		Scanner in=new Scanner(System.in);	
		System.out.println("Enter roll no");
		r=in.nextInt();
		System.out.println("Enter math mark");
		m=in.nextInt();
		System.out.println("Enter physics mark");
		p=in.nextInt();
		System.out.println("Enter chemistry mark");
		c=in.nextInt();
		System.out.println("Enter computer science mark");
		cs=in.nextInt();
	}
}
class Student2 extends Student1 {
	public void grade(){
		
		sum=m+p+c+cs;
		avg=sum/4;
		
		if(avg<100 && avg>91){
			System.out.println("S grade");
		}
		else if (avg<90 && avg >81){
			System.out.println("A grade");
		}
		else if (avg<80 && avg >71){
			System.out.println("B grade");
		}
		else if (avg<70 && avg >61){
			System.out.println("C grade");
		}
		else if (avg<60 && avg >51){
			System.out.println("D grade");
		}
		else if(avg<50){
			System.out.println("Grade cannot be calculated");
		}	
	}

}
public class Marks{
	public static void main(String args[]){
		String chs,chc;
		Scanner i=new Scanner(System.in);
		System.out.println("Do you want to start? Press Y for yes or N for no");
		chs=i.next();
		Student2 s= new Student2();
		s.getdet();
		s.grade();
		System.out.println("Do you want to continue? Press Y for yes or N for no");
		chc=i.next();
		do{
			
			Student2 s1= new Student2();
			s1.getdet();
			s1.grade();
		}while(chc=="y");
	}
}
















