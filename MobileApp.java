import java.util.*;
public class MobileApp {
	public static void main(String args[]){
		String sent,temp,hold=""; 
		System.out.print("Enter sentence to be capitalised\n");
		Scanner in = new Scanner(System.in);
	 	sent=in.nextLine();
       		Scanner S= new Scanner(sent); 
        		while(S.hasNext()) {
			temp= S.next(); 
			hold = hold+(Character.toUpperCase(temp.charAt(0))+ temp.substring(1) + " "); 
         		}
      		System.out.println("Capitalised sentence is: "+hold); 
		int i,flag=0;
		for(i=0;i<sent.length();i++){
			if(sent.charAt(i)==' '){
				flag=flag+1;
			}
		}
		System.out.println("Word count is : "+(flag+1));
		
	}
}