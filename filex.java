import java.io.*;
public class filex{
	public static void main(String args[])throws IOException{
		String s="Kailash";
		FileWriter f= new FileWriter("output.txt");
		for(int i=0;i<s.length();i++){
			f.write(s.charAt(i));
		}
		System.out.println("Success");
		f.close();
	}

}