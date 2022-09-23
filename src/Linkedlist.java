import java.io.*;
import java.util.*;

//Linked list full code
public class Linkedlist {

	//IN this class we have to create a another class called node.
	private Node head;
	private Node tail;
	private int size;
	
	
	public Linkedlist() {
		this.size=0;
	}
	
	
	
	//don't type static
	public void insertatFirst(int data) {
		Node newnode=new Node(data);//put data in the constructor parameter
		newnode.next= head;
		head= newnode;
		
		if(tail==null) {
			tail=head;
		}
		size+=1;
	}
	
	public void insertEnd(int data) { //Insert at end method
		if(tail==null) {
			insertatFirst(data);
			return;
		}
		
		Node newnode=new Node(data);
		tail.next=newnode;
		tail=newnode;
		size++;
		
	}
	
	public void insert(int data, int index) {//Method to insert random insert
		if(index==0) {
			insertatFirst(data);
			return;
		}
		if(index==size) {
			insertEnd(data);
			return;
		}
		
		Node temp=head;
		for(int i=1;i<index;i++) {
			temp=temp.next;
		}
		Node newnode=new Node(data, temp.next);
		temp.next=newnode;
		size++;
		
	}
	
	public int deletFirst() {
		if(head==null) {
			tail=null;
		}
		int data=head.data;
		head=head.next;
		size--;
		
		return data;//returning the value that is removed
	}
	
	public int deleteLast() {
		if(size<=1) {
			return deletFirst();
		}
		Node secondlast=get(size-2);
		int data=tail.data;
		tail=secondlast;
		tail.next=null;
		
		return data;
		
	}
	
	public Node get(int index) {
		Node temp=head;
		for(int i=0;i<index;i++) {
			temp=temp.next;
		}
		return temp;
	}
	
	public void display() {   //dispaly method
		Node temp=head;
		while(temp!=null) {//go through the loop if the temp value is not equal to null
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("End");
	}
	
	
	class Node{
		
		private int data;
		private Node next;
		
		Node(int data){
			this.data=data;
		}
		
		Node(int data, Node next){
			this.data=data;
			this.next=next;
		}
		
	}
	
	
}
