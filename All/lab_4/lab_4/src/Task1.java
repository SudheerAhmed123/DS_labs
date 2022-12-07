class LinkedList{
	static Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			data = data;
			next = null;
		}
		
		}
	Node reverse(Node node) {
		Node prev = null;
		Node current = node;
		Node next = null;
		
		while(current!=null) {
			next = current.next;
			current.next = prev;
			current = next;
		}
		
		node = prev;
		return node;
	}
	
	void printList(Node node) {
		while(node!=null) {
			System.out.println(node.data+ " ");
			node = node.next;
		}
	}
	
	
}




public class Task1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.head = new LinkedList.Node(85);
		list.head.next = new LinkedList.Node(15);
        list.head.next.next = new LinkedList.Node(4);
        list.head.next.next.next = new LinkedList.Node(20);
        
        
        System.out.println("Given Linked list");
        list.printList(LinkedList.head);
        
       LinkedList.head  = list.reverse(LinkedList.head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(LinkedList.head);
		
		

	}

}
