package lab_5;
import java.util.NoSuchElementException;

public class  PriorityQueueUsingArray {
	
	private int [] Array;
	private int size;
	
	public PriorityQueueUsingArray(){
		 
		this.Array= new int [10];
		size =0;
	} 
	
	public void enqueue(int x) {
		if(isEmpty()) {
			Array[size++]=x;
			return ;
		}
		
		if(size()==Array.length) {
			doubleArray();
		}
		
		int temp=x;
		
		for(int i=0; i<size; i++) {
			
			if(x<Array[i]) {
				int next;
				temp=Array[i];
				Array[i]=x;
				
				while(i<size-1) {
					next = Array[i+1];
					Array[i+1]=temp;
					temp = next;
					i++;
					}
				break;
			}
		}
		Array[size++]=temp;
	}
	
	
	
	
	public int dequeue() {
		
		if(isEmpty()) {
			throw new NoSuchElementException("Queue is Empty");
		}
		
		int value = Array[0];
		for(int i=1; i<size; i++) {
			
			Array[i-1]=Array[i];
		}
		Array[size-1]=0;
		size--;
		return value;
		
		}
	
	
	
	
	public int peek() {
		
		if(isEmpty()) {
			throw new NoSuchElementException("The Queue is Empty");
		}
		
		return Array[0];
	}
	
	
	
	public boolean contains(int x) {
		if(isEmpty())
			return false;
		for(int i=0;i<size;i++)
		{
			if(Array[i]==x)
				return true;
		}
		
		return false;
		
	}
	
	
	
	
	private void doubleArray() {
		// TODO Auto-generated method stub
		int [] newArray= new int [Array.length*2];
		for(int i=0;i<Array.length;i++)
		{
			newArray[i]= Array [i];
		}
		
		Array= newArray;
	}
	
	public void print()
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(Array[i]+" ");
		}
		System.out.println();
		
	}

	private int size() {
		// TODO Auto-generated method stub
		return size;
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return size== 0;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 PriorityQueueUsingArray queue= new  PriorityQueueUsingArray();
		 queue.enqueue(5);
		 queue.enqueue(3);
		 queue.enqueue(1);
		 queue.enqueue(2);
		 queue.enqueue(4);
		 
		 System.out.println("Dequeue "+queue.dequeue());
		 System.out.println("Peek "+queue.peek());
		 System.out.println(queue.contains(3));
		 System.out.println(queue.isEmpty());
		 System.out.println(queue.size);
		 queue.print();

	}

}
