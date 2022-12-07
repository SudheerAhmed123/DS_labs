import java.util.*;


class Stack{
	
	
	private int arr[];
	private int top;
	private int capacity;
	
	
	Stack (int size){
		arr = new int [size];
		capacity = size;
		top = -1;
		
	}
	
	public void push(int x) {
		
		if(this.top == this.capacity-1) {
			System.out.println("stack is overfelow");
		}
		else {
			System.out.println("Inserting" +x);
			arr[++top]= x;
		}
		
	}
	
	
	
	
	public int pop(){
		if(top == -1) {
			System.out.println("Stack is underflow");
			return -1;
		}
		
		else {
			
		
			int temp = arr[top];
			top = top-1;
			System.out.println("Removing "+temp);
			return temp;
			
		}
		
		
		
	}
	
	public int peek() {
		if(top == -1) {
		System.out.println("Stack is underfelow");
		return -1;
	} 
	
	else {
		
		int temp = arr[top];
		return temp;
	}
	
	
	
}
	
	public int size() {
		return ++top;
	}
	
	
	public Boolean isEmpty() {
		if(top == -1) {
			return true;
		}
	
	else {
		return false;
	}
	
}
	
	
	public Boolean isFull() {
		
		if(top==capacity-1) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	
}	

	
	
		
		
	

	




public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		
		
		System.out.println(stack.pop());
		
		
		System.out.println(stack.peek());
		
		System.out.println(stack.size());
		
		System.out.println(stack.isEmpty());
		
		System.out.println(stack.isFull());
	}
}

