/*Documentation section
This is the Review 1 Source code for Movie Ticket Booking Application 
Done by S Kailash 18MIS1074, Karthikeyan R 18MIS1053 and Deepika K 18MIS1011
Basic class structure is defined and the main method is created in class
*/

import java.util.*;
import java.io.*;
import java.awt.*;

class getUserDetails{
	String nam,ph,cit;
	getUserDetails(){}                                                                                                  			//Dummy constructor initialised to give some XYZ values
	void inputUserDet()throws IOException{
		System.out.println("````````````````````````````````````````````````");
		System.out.println("       WELCOME TO MOVIE TICKET BOOKING APPLICATION        ");
		System.out.println("````````````````````````````````````````````````");
		System.out.println("Please Enter Your Basic Details");
		DataInputStream d = new DataInputStream(System.in);
		System.out.println("Enter your name");
		nam=d.readLine();
		System.out.println("Hello,"+nam+". Enter your mobile number");
		ph=d.readLine();
		System.out.println("Stored. Which city do you live in?");
		cit=d.readLine();
		System.out.println("Done :)");
	}

}
public class MovieTickets{
	public static void main(String args[])throws IOException{
		getUserDetails G= new getUserDetails();
		G.inputUserDet();
		
	}
}
