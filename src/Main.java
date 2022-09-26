import java.io.*;
import java.util.*;

public class Main {

	//Main class for calling the Linkedlist class
	public static void main(String[] args) {
		Linkedlist list=new Linkedlist();
		
		list.insertatFirst(6);
		list.insertatFirst(7);
		list.insertatFirst(3);
		list.insertatFirst(9);
		list.insertatFirst(1);
		list.insertEnd(15);
		list.insert(50, 3);
		
		
		list.display();
		System.out.println(list.deletFirst());
		System.out.println(list.deleteLast());
		System.out.println(list.delete(2));
		list.display();
	}

}
