import java.io.*;
import java.util.*;

 //program to demonstarte doubly in java
public class DoublyLinkedList {

	Node head;
	int size;
	
	public DoublyLinkedList() {
		int size=0;
	}
	
	public void insertFirst(int data) {
		Node newnode=new Node(data);
		newnode.next=head;
		if(head!=null) {
			head.prev=newnode;
		}
		head=newnode;
		newnode.prev=null;
		
	}
	
	//doubly linked has a functionality, we can reverse pretty easily with each also points 
	//previously. So we can print doubly in reverse order
	
	public void revdisplay() {
		Node lastNode=null;
		while(lastNode!=null) {
			System.out.println(lastNode.data+"-><-");
			lastNode=lastNode.prev;
		}
		System.out.println();
	}
	
	
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"-><-");
			temp=temp.next;
		}
		System.out.println("End");
	}
	
	
	
	
	public class Node{
		int data;
		Node next;
		Node prev;
		
		public Node(int data) {
			this.data=data;
		}
		public Node(int data,Node next, Node prev) {
			this.data=data;
			this.next=next;
			this.prev=prev;
		}
	}
	
}
