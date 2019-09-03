/*Data Structure - Singly Linked List*
import java.io.*;
import java.util.*;

public class Nodlehs{
	Node head;Node ele;
	static class Node{
		int ele;
		Node next;
		Node head;
		Node(int e){
			ele=e;
			next=null;
			
		}
	}
	public static Nodlehs insert(Nodlehs nod,int ele){
		Node n=new Node(ele);
		Node kadasi=nod.head;
		n.next=null;
		
		if(nod.head==null){
			nod.head=n;
		}
		else{
		while (kadasi.head != null){
			kadasi=kadasi.next;
			}
			kadasi.next=n;
		}
		
		return nod;
	
	}
	public static Nodlehs print(Nodlehs nod){
		Node ipo=nod.head;
		while(ipo!=null){
			System.out.println(ipo.ele+"  ");
			
		}
		ipo=ipo.next;
		return ipo.ele;
		
	}
	
public static void main(String args[]){


	Nodlehs node= new Nodlehs();
	node=insert(node,'1');
	node=insert(node,'2');
	node=insert(node,'3');
	node=insert(node,'4');
	node=insert(node,'5');
	node=insert(node,'6');
	node=insert(node,'7');
	node=insert(node,'8');
	node=insert(node,'9');
	print(node);
	
	
	
	}
}*/