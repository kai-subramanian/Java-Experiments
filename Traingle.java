import java.util.*;
class Area{ 
	double ar;
	public double calcarea(int x,int y)throws Exception{
		ar=0.5*x*y;
		return ar;
	}
}

public class Traingle{
	public static void main(String args[])throws Exception{
		Scanner s=new Scanner(System.in);
		int b,h,n,i,j;
		
		System.out.println("Enter number of triangles");
		n=s.nextInt();
		Area a[]= new Area[n];
		double arr[]=new double[n];
		
		for(i=0;i<n;i++){ 
			System.out.println("Enter b and h value of "+(i+1)+"th triangle");
			b=s.nextInt();
			h=s.nextInt();
			a[i]=new Area();
			arr[i]=a[i].calcarea(b,h);
			System.out.println("Area is : "+arr[i]);
			
		}
		Arrays.sort(arr);
		for(j=n-1;j>=0;j--){
			
			System.out.println("Sorted array based on decreasing area is "+arr[j]);
			
		}
		
	
	}
}