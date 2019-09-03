import java.util.*;
public class MatrixSearch{
	public static void main(String args[]){
		int m[][]= new int[10][10];
		int r,c,i,j,ele;
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the no.of rows of matrix");
		r=in.nextInt();
		System.out.println("Enter the no.of columns of matrix");
		c=in.nextInt();
		System.out.println("Enter the elements of matrix");
		for(i=0;i<r;i++){
			for(j=0;j<c;j++){
				m[i][j]=in.nextInt();
			}
		}	
		System.out.println("Enter the element to be searched in matrix");
		ele=in.nextInt();
		for(i=0;i<r;i++){
			for(j=0;j<c;j++){
				if(m[i][j]==ele){
					System.out.println("Element found");
					System.out.println("At r ="+(i+1)+" and c ="+(j+1));
				}
			}
		}
	}
} 