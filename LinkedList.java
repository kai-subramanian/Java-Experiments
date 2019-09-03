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
import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
  
    Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node new_node = new Node(data); 
        new_node.next = null; 
  
        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.head == null) { 
            list.head = new_node; 
        } 
        else { 
            // Else traverse till the last node 
            // and insert the new_node there 
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
  
            // Insert the new_node at last node 
            last.next = new_node; 
        } 
  
        // Return the list by head 
        return list; 
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    { 
        Node currNode = list.head; 
   
        System.out.print("LinkedList: "); 
   
        // Traverse through the LinkedList 
        while (currNode != null) { 
            // Print the data at current node 
            System.out.print(currNode.data + "->"); 
   
            // Go to next node 
            currNode = currNode.next; 
        } 
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
        list = insert(list, 6); 
        list = insert(list, 7); 
        list = insert(list, 8); 
  
        // Print the LinkedList 
        printList(list); 
    } 
} 