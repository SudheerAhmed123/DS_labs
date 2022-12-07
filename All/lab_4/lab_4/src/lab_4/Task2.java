spackage lab_4;

import java.util.LinkedList;

class LlinkList{
	Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data =data;
			this.next =next;
		}
	}
	
	void printRverse(Node node) {
		if(head == null) {
			return;
		}
		printRverse(head.next);
		System.out.println(head.data+ "");
		
		}
	
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next=head;
		head=newNode;
	}
}





public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList linkedlist = new LinkedList();
        linkedlist.push(4);
        linkedlist.push(3);
        linkedlist.push(2);
        linkedlist.push(1);
 
        linkedlist.printReverse(linkedlist.head);

	}

}
