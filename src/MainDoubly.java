import java.io.*;
import java.util.*;

public class MainDoubly {

	public static void main(String[] args) {
      
		DoublyLinkedList list=new DoublyLinkedList();
		list.insertFirst(6);
		list.insertFirst(9);
		list.insertFirst(4);
		list.insertFirst(2);
		list.insertFirst(1);
		list.revdisplay();
		list.display();
		//list.revdisplay();
	}

}
