import java.util.*;

interface Sample{
	void read();
	void write();
}

class Matr implements Sample{
	int q,u;
	int a[][]=new int[3][3];
	int b[][]=new int[3][3];
	
	public void read(){
	Scanner d = new Scanner(System.in);
	System.out.println("Enter the first matrix");
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
		a[i][j]=d.nextInt();
		}
	}
	System.out.println("Enter the second matrix");
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
		b[i][j]=d.nextInt();
		}
	}
}
public void write() {
	System.out.println("Addition");
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
		q=a[i][j]+b[i][j];
		System.out.println(q+" ");
		}
		System.out.println("\n");
	}
	System.out.println("Subtraction");
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			u=a[i][j]-b[i][j];
			System.out.println(u+" ");
			}
			System.out.println("\n");
		}
	}
}

class Matrix{
	public static void main(String args[]) {
	Matr m = new Matr();
	m.read();
	m.write();
	}
}