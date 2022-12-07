import java.util.*;

class Queue{
	
	private int arr[];
	private int front;
	private int rear;
	private int capacity;
	private int count;
	
	
	
	Queue(int size){
		
		arr = new int[size];
		capacity = size;
		front = 0;
		rear = -1;
		count = 0;
		
	}
	
	
	public void inqueue(int data) {
		if(rear == capacity-1) {
			System.out.println("Queue is Overflow");
		}
		
		else {
			arr[++rear] = data;
			count ++;
			
			
		}
	}
	
	
	public int dequeue() {
		
		int temp ;
		
		if(front == rear) {
			
			System.out.println("Queue is Overflow");
			return -1;
			
		}
		
		else {
			
			temp = arr[rear];
			rear--;
			count--;
			return temp;
			
		}
	}
	
	
	public int peek() {
		if(front == rear) {
			System.out.println("Queue is underlow");
			return-1;
		}
		
		else {
			
			return arr[rear];
		}
	}
	
	
	public int size() {
		return count;
	}
	
	
	public boolean isEmpty() {
		if(this.size()==0) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	
	public boolean isFull() {
		
		if(rear == capacity-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}






















public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue q = new Queue(5);
		q.inqueue(1);
		q.inqueue(2);
		q.inqueue(3);
		
		System.out.println("Front element is: " + q.peek());
		
		q.dequeue();
		System.out.println("Front element is: " + q.peek());
		System.out.println("The Size of Queue is " + q.size());
		q.dequeue();
		q.dequeue();
		
		if (q.isEmpty())
			System.out.println("Queue is Empty");
		else
			System.out.println("Queue is Not Empty");

	}

}
