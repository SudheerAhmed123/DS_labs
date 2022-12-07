import java.util.*;

class Node{
	
	int data;
	Node next;
	Node(int data){
		this.data =data;
	}
}

class linked_list_Stack{
	private Node top;
	
	public linked_list_Stack(){
		this.top = null;
	} 
	
	public void push(int x) {
		Node newNode = new Node(x);
		System.out.println("inserting "+x);
		
		if(this.top == null) {
			top = newNode;
		}
		else {
			newNode.next = top;
			top = newNode;
			
		}
		
		
	}
	
	
	public Boolean isEmpty() {
		if(this.top == null) {
			return true;
		}
		
		else {
			
			return false;
		}
		
	}
	
	
	
	public int peek() {
		if(this.top == null) {
			System.out.println("Stack is Underfelow");
			return -1;
		}
		
		else {
			return this.top.data;
			
		}
	}
	
	
	public int pop() {
		
		if(this.top == null) {
			
			System.out.println("Stack is Underfelow");
			return -1;
		}
		
		else {
			int temp;
			if(top.next==null) {
				temp = top.data;
				top = null;
				System.out.println("removing " +temp);
				
			}
			
			else {
				temp = top.data;
				top = top.next;
				System.out.println("removing "+temp);
				return temp;
			}
			
		}
		return 0;
	}
}














public abstract class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		linked_list_Stack stack = new linked_list_Stack();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		
		System.out.println("Top element is " + stack.peek());
		
		stack.pop();
		stack.pop();
		stack.pop();
		
		
		
		if(stack.isEmpty()) {
			System.out.println("Stack is Empty");
		}
		else
		{
			System.out.println("Stack is not Empty");
		}
		
		


	}

}
