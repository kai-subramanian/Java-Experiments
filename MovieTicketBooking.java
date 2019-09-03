import java.util.*;
class User{
	
	String n,ph,cit;
	String newuse[]=new String[5];
	String newpas[]=new String[5];
	String mid;
	Scanner in=new Scanner(System.in);
	boolean a=true; int i=0;
	int count=0;
	public void account_create(){
		System.out.println("Enter your name");
		n=in.next();
		System.out.println("Enter your phone number");
		ph=in.next();
		System.out.println("Enter your city");
		cit=in.next();
		System.out.println("Enter your mail ID :");
		mid=in.next();
		System.out.println("Enter new username");
		newuse[count]=in.next(); count ++;
		System.out.println("Enter new password; Strictly more than 8 characters");
		newpas[count]=in.next(); 
		
		if(newpas[count].length()<8){
			System.out.println("Enter an 8 character password.");
		}
		else{
			count ++;
			System.out.println("Account created !");
		}
		//gets name,phone no, city
		
	}
	
	public void user_validate(String username,String password){
			String u[]={"kailash","karthi","deepika"};
			String pw[]={"qwer0123","yuio6789","asdf4567"};
			
			for(i=0;i<3;i++){
				if(username.equals(u[i]) || username.equals(newuse[i])){
					if(!password.equals(pw[i]) || password.length()<8){
						System.out.println("Invalid Login ! Try again !");
						a=false;
					}
					else {
						System.out.println("Welcome to movie ticket booking");
						System.out.println("Enter the city ");
						cit=in.next();
					}
				}
				
			}
			
		// simple function to validate for 3 users 
	}
}

class Movie extends User{
	String movielist_chennai[]={"1. Comali (Tamil)","2. Saaho(Telugu)"};
	String movielist_bangalore[]={"1. Gubbi Mele Brahmastra(Kannada)","2. Nanna Prakara(Kannada)"};

	int i;
	int mc;
	int tc;
	int timing;
	Scanner s= new Scanner(System.in);
	
	public void moviechoosetheatre(String town){
		if (town.equalsIgnoreCase("chennai")){
			for(i=0;i<2;i++){
				System.out.println(movielist_chennai[i]);
			}
			System.out.println("Superhit Movies in your city :");
			System.out.println("Enter the corresponding movie number: ");
			mc=s.nextInt();
			if(mc==1){
				System.out.println("Comali(Tamil) is showing at: ");
				System.out.println("1. AGS Navalur 2. IMAX Velachery");
				System.out.println("Enter the corresponding theatre number: ");
				tc=s.nextInt();
				
			}
			else if (mc==2){
				System.out.println("Saaho(Telugu) is showing at: ");
				System.out.println("1. Sathyam cinemas 2. Palazzo Cinemas");
				System.out.println("Enter the corresponding theatre number: ");
				tc=s.nextInt();
			}
	
		}
		else if (town.equalsIgnoreCase("Bangalore")){
			for(i=0;i<2;i++){
				System.out.println(movielist_bangalore[i]);
			}
			System.out.println("Enter the corresponding movie number: ");
			mc=s.nextInt();
			if(mc==1){
				System.out.println("Gubbi Mele Brahmastra(Kannada) is showing at: ");
				System.out.println("1. PVR Koramangala 2. INOX Leisure");
				System.out.println("Enter the corresponding theatre number: ");
				tc=s.nextInt();
				
			}
			else if (mc==2){
				System.out.println("Nanna Prakara(Kannada) is showing at: ");
				System.out.println("1. Cinepolis Multiplex 2. PVR IMAX");
				System.out.println("Enter the corresponding theatre number: ");
				tc=s.nextInt();
			}
		}
		
			

	}
	public void theatrechoosetiming(String village){
		
		if(village.equalsIgnoreCase("chennai")){
			if(mc==1 && tc==1){
				System.out.println("Comali(Tamil) is available at your chosen theatre at following shows");
				System.out.println("1. Afternoon Show (13:00PM to 15:30PM ) \n 2. Midnight Show(23:00 PM to 3:00PM)");
				System.out.println("Enter corresponding timing");
				timing=s.nextInt();
				System.out.println("For alternate show timings, retry with different theatre");
			}
			else if(mc==1 && tc==2){
				System.out.println("Comali is available at your chosen theatre at following shows");
				System.out.println("1. Evening show(16:00PM to 18:30PM) \n 2. Afternoon show(13:00PM to 15:30PM)");
				System.out.println("Enter corresponding timing");
				timing=s.nextInt();
				System.out.println("For alternate show timings, retry with different theatre");
			}
			else if (mc==2 && tc==1){
				System.out.println("Saaho (Telugu) is available at your chosen theatre at following shows");
				System.out.println("1. Special Show (19:00 PM to 21:30PM) \n2. Afternoon show(13:00PM to 15:30PM)");
				System.out.println("Enter corresponding timing");
				timing=s.nextInt();
				System.out.println("For alternate show timings, retry with different theatre");
			}
			else if(mc==2 && tc==2){
				System.out.println("Saaho (Telugu) is available at your chosen theatre at following shows");
				System.out.println("1.Evening show (16:00PM to 18:30PM) \n2. Midnight Show(23:00 PM to 3:00PM) ");
				System.out.println("Enter corresponding timing");
				timing=s.nextInt();
				System.out.println("For alternate show timings, retry with different theatre");
			}
		}
		else if(village.equalsIgnoreCase("bangalore")){
			if(mc==1 && tc==1){
				System.out.println("Gubbi Mele Brahmastra(Kannada) is showing at your chosen theatre at following shows");
				System.out.println("1. Evening show (16:00PM to 18:30PM) \n 2. Special Show(19:00 PM to 21:30PM)");
				System.out.println("Enter corresponding timing");
				timing=s.nextInt();
				System.out.println("For alternate show timings, retry with different theatre");
			}
			else if(mc==1 && tc==2){
				System.out.println("Gubbi Mele Brahmastra(Kannada) is showing at your chosen theatre at following shows");
				System.out.println("1. Evening show (16:00PM to 18:30PM) \n 2.Afternoon show (13:00PM to 15:30PM) ");
				System.out.println("Enter corresponding timing");
				timing=s.nextInt();
				System.out.println("For alternate show timings, retry with different theatre");
			}
			else if(mc==2 && tc==1){
				System.out.println("Nanna Prakara(Kannada) is showing at your chosen theatre following shows");
				System.out.println("1.Afternoon show (13:00PM to 15:30PM) \n 2. Midnight Show(23:00 PM to 3:00PM)");
				System.out.println("Enter corresponding timing");
				timing=s.nextInt();
				System.out.println("For alternate show timings, retry with different theatre");
			
			}
			else if(mc==2 && tc==2){
				System.out.println("Nanna Prakara(Kannada) is showing at your chosen theatre following shows");
				System.out.println("1.Afternoon show (13:00PM to 15:30PM) \n2. Special Show(19:00 PM to 21:30PM)");
				System.out.println("Enter corresponding timing");
				timing=s.nextInt();
				System.out.println("For alternate show timings, retry with different theatre");
			
			}
		
		}
	}
}
class SeatTypeCost extends Movie{
		int nor=25,eli=50;
		String sch;
		int no_Of_Normal_Seats; int no_Of_Elite_Seats;
		Scanner s=new Scanner(System.in);
		Movie m3=new Movie();
		int q1,q2,q3,q4;
		
		int cost_Normal; int cost_Elite;
		double tax_Normal; double tax_Elite;
		double final_Normal_Cost; double final_Elite_Cost;
		
		String fch; // Food yes or no.
		int pch; // Preference of food.
		double entire_Normal; double entire_Elite;
		
		int x,y;     //Loop variables for increment control.
		
		public void timingchooseseat(){
			System.out.println("\n\t    S E A T      L A Y O U T");
			System.out.println("\n\t\tELITE SEATS");
			
				for(int x=0;x<5;x++){
					for(int y=0;y<10;y++){
						System.out.print("*    ");
					}
					System.out.print("\n");
				}
			System.out.println("\tElite Seat - Rs.150\n");
			System.out.println("\n\t\tNORMALSEATS");	
			
				for(x=0;x<5;x++){
					for(y=0;y<5;y++){
						System.out.print("    *    ");
					}
					System.out.print("\n");
				}
			System.out.println("\tNormal seat - Rs.90\n");
			
			System.out.println("Press E for Elite and N for Normal");
			sch=s.next();
			
			if (sch.equalsIgnoreCase("n")){
				System.out.println("How many normal seats do you want? (Cost - Rs.90)");
				no_Of_Normal_Seats=s.nextInt();

				nor=nor-no_Of_Normal_Seats;                                                //Decrements the total number of normal seats from the particular theatre
			}
			else if (sch.equalsIgnoreCase("e")){
				System.out.println("How many elite seats do you want? (Cost - Rs.150) ");
				no_Of_Elite_Seats=s.nextInt();
				
				eli=eli-no_Of_Elite_Seats;                                                       //Decrements the total number of elite seats from the particular theatre
			}
			
		}
		public void seatcalculatecost(){
			
			if(sch.equalsIgnoreCase("n")){
				cost_Normal=no_Of_Normal_Seats*90;
				System.out.println("Tax is 12% for normal seats");
				tax_Normal=cost_Normal*0.12;
				final_Normal_Cost=cost_Normal+tax_Normal;
				System.out.println("Total Ticket cost is "+final_Normal_Cost);
			}
			else if(sch.equalsIgnoreCase("e")){
				cost_Elite=no_Of_Elite_Seats*150;
				System.out.println("Tax is 18% for elite seats");
				tax_Elite=cost_Elite*0.18;
				final_Elite_Cost=cost_Elite+tax_Elite;
				System.out.println("Total Ticket cost is "+final_Elite_Cost);
			}
			
		}
		
		public void choosefood(){
			
			System.out.println("Would you like to add food to your billing? ");
			System.out.println("Y for Yes and press N for No");
			fch=s.next();
			if ( fch.equalsIgnoreCase("y")  && sch.equalsIgnoreCase("n") ){
				System.out.println("Popcorn is Rs 100, Pepsi/ Coca Cola - Rs 50 ");
				System.out.println("Press 0 for popcorn, Press 1 for Pepsi/ Coca Cola");
				System.out.println("Press 10 for Both");
				pch=s.nextInt();
				if(pch==0){
					System.out.println("Quantity required ?");
					q1=s.nextInt();
					entire_Normal=final_Normal_Cost+(100*q1);
					System.out.println("You have to pay Rs."+entire_Normal+" Including food and ticket cost");
					System.out.println("Details will be sent as message to phone number");
				}
				else if (pch==1 ) {
					System.out.println("Quantity required ?");
					q2=s.nextInt();
					entire_Normal=final_Normal_Cost+(50*q2);
					System.out.println("You have to pay Rs."+entire_Normal+" Including food and ticket cost");
					System.out.println("Details will be sent as message to phone number");
				}
				else if(pch==10){
					System.out.println("Quantity of popcorn?");
					q3=s.nextInt();
					System.out.println("Quantity of pepsi/ coca cola?");
					q4=s.nextInt();
					entire_Normal=final_Normal_Cost+(100*q3)+(50*q4);
					System.out.println("You have to pay Rs."+entire_Normal+" Including food and ticket cost");
					System.out.println("Details will be sent as message to phone number");
				}
			}
			
			else if(  fch.equalsIgnoreCase("y")  && sch.equalsIgnoreCase("e") ){
				System.out.println("Popcorn is Rs 100, Pepsi/ Coca Cola - Rs 50 ");
				System.out.println("Press 0 for popcorn, Press 1 for Pepsi/ Coca Cola");
				System.out.println("Press 10 for Both");
				pch=s.nextInt();
				if(pch==0 ){
					System.out.println("Quantity required ?");
					q1=s.nextInt();
					entire_Elite=final_Elite_Cost+(100*q1);
					System.out.println("You have to pay Rs."+entire_Elite+" Including food and ticket cost");
					System.out.println("Details will be sent as message to phone number");
				}
				else if(pch==1 ){
					System.out.println("Quantity required ?");
					q2=s.nextInt();
					entire_Elite=final_Elite_Cost+(50*q2);
					System.out.println("You have to pay Rs."+entire_Elite+" Including food and ticket cost");
					System.out.println("Details will be sent as message to phone number");
				}
				else if(pch==10){
					System.out.println("Quantity of popcorn?");
					q3=s.nextInt();
					System.out.println("Quantity of pepsi/ coca cola?");
					q4=s.nextInt();
					entire_Elite=final_Elite_Cost+(100*q3)+(50*q4);
					System.out.println("You have to pay Rs."+entire_Elite+" Including food and ticket cost");
					System.out.println("Details will be sent as message to phone number");
				}
			}
			else if(fch.equalsIgnoreCase("n")){
				System.out.println("Without food, you have to pay the above mentioned amount");
				System.out.println("Details will be sent as message to phone number");
			
			}
		}
		
}

interface AdminDet{
	public void TicketDet();                    // Calculate total sales of tickets for a movie based on number of normal seat, elite seat, and cost per ticket.
	public void  UpcomingMovies();     //Update the movie list 
}

class Admin implements AdminDet{
	Scanner mum=new Scanner(System.in);
	String new_Movie_Mumbai;
	String a_username,a_password;
	Admin(){
		a_username="Admin"; 
		a_password="12345678";    //Pre Defined username and password for admin
	
	}
	public void TicketDet(){
		int no_Of_Elite_tick, no_Of_Normal_tick;
		System.out.println("Enter the total number of elite seats sold");
		no_Of_Elite_tick=mum.nextInt();
		System.out.println("Enter the total number of normal seats sold");
		no_Of_Normal_tick=mum.nextInt();
		int total_sales = (no_Of_Elite_tick*150) + (no_Of_Normal_tick*90);
		System.out.println("Total sales revenue is " +total_sales);
	
	}
	
	public void UpcomingMovies(){
		String Mumbai[]= new String[2];
		for(int h=0;h<2;h++){
			System.out.println("Enter the next movie in Mumbai");
			Mumbai[h]=mum.next();
			
		}
		
		for(int l=0;l<2;l++){
			System.out.println("Bookings will open for "+Mumbai[l] + " On 15.09.2019 ");
		}
		
		
	}



}


public class MovieTicketBooking{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		String uch;
		boolean b= true;
		String a_username,a_pw;
		
		System.out.println("Press U for User and A for Admin");
		uch=s.next();
			if(uch.equalsIgnoreCase("a")){
				System.out.println("Hello Admin! Enter username and password");
				
				a_username=s.next();
				a_pw=s.next();
			
				if(a_username.equals("Admin")){
					if(!a_pw.equals("12345678")){
						System.out.println("Invalid ; please try again.");
					}
					else{
						System.out.println("Login Successful. What do you want to do?");
						System.out.println("1.Calculate sales revenue. \n2.Add movies");
						System.out.println("Enter corresponding number");
						int ach;
						ach=s.nextInt();
							if(ach==1){
								Admin a1= new Admin();
								a1.TicketDet();
							}
							else if(ach==2){
								Admin a2= new Admin();
								a2.UpcomingMovies();
							}
							else{
							System.out.println("Enter a valid feature.");
							}
					}
				}
			
		
		}
		else if(uch.equalsIgnoreCase("u")){
			System.out.println("Press 1 for new user. Press 0 for existing user.");
			int ch;
			ch=s.nextInt();

			if (ch==1){
				User u1=new User();
				u1.account_create();
				
				String v=u1.cit;
				if(v.equalsIgnoreCase("Chennai") || v.equalsIgnoreCase("Bangalore")){
					System.out.println("Got it. The popular movies in your city are : ");
					String V=u1.cit;
					Movie m1= new Movie();
					m1.moviechoosetheatre(V);
					m1.theatrechoosetiming(V);
				
					SeatTypeCost stc1= new SeatTypeCost();
					stc1.timingchooseseat();
					stc1.seatcalculatecost();
					stc1.choosefood();
			
				}
				else{
					System.out.println("But Sorry!  Our presence is limited to Chennai and Bangalore only !");
				}
				
			}
			else if(ch==0){
			
				String use,pass;
				System.out.println("Enter username");
				use=s.next();
				System.out.println("Enter password");
				pass=s.next();
			
				User u2=new User();
				
				u2.user_validate(use,pass);
				if(u2.a==false){
					System.out.println("You cannot book unless you login !");
				}
				else {
					String c=u2.cit;
					if(c.equalsIgnoreCase("Chennai") || c.equalsIgnoreCase("Bangalore")){
						System.out.println("Got it. The popular movies in your city are : ");
			
						String C=u2.cit;
						Movie m2= new Movie();
						m2.moviechoosetheatre(C);
						m2.theatrechoosetiming(C);			
						SeatTypeCost stc2= new SeatTypeCost();
						stc2.timingchooseseat();
						stc2.seatcalculatecost();
						stc2.choosefood();
					}
					else{
						System.out.println("Sorry!  Our presence is limited to Chennai and Bangalore only !");
					}
				}
			}
		}
	}
}