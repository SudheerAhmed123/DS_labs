package lab_5;

public class Task_1 {
	int arr[];
	int size;
	
	
	Task_1() {
		
		arr= new int [10];
		size=0;
		
	}
	
	public void enqueue (int value) {
		
		if(size<10) {
			
			arr[size++]= value;
		}
		
		else {
			
			System.out.println("Array is full");
			
		}
	}
	
	
	
	
	public int dequeue (int value) {
		
		
		int index=0;
		int temp=0;
		for(int i=0; i<size; i++) {
			
			if(temp<arr[i]) {
				index=i;
				temp=arr[i];
			}
		}
		
		for(int j=index; j<size; j++) {
			
			arr[j]=arr[j+1];
		}
		
		size--;
		return temp;
	}
	
	
	
	
	public int Peek() {
		int peek =0;
		for(int i=0; i<size; i++) {
			
			if(peek<arr[i]) {
				
				peek=arr[i];
			}
		}
		
		return peek;
		
	}
	
	
	public boolean contains (int key) {
		
		for(int i=0; i<size; i++) {
			
			if(key==arr[i]) {
				return true;
				
			}
		}
		return false;
		
	}
	
	
	public boolean isEmpty() {
		return size==00;
	}
	
	
	
	public int size() {
		return size;
	}
	
	
	public void print() {
		for(int i=0; i<size; i++) {
			
			System.out.println(arr[i]+ " ");
		}
		
		System.out.println();
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Task_1 arr= new Task_1();
		arr.enqueue(5);
		arr.enqueue(3);
		arr.enqueue(1);
		arr.enqueue(4);
		arr.enqueue(2);
		
		System.out.println(arr.dequeue(3));
		System.out.println(arr.dequeue(5));
		System.out.println(arr.Peek());
		System.out.println(arr.contains(1));
		System.out.println(arr.contains(5));
		System.out.println(arr.isEmpty());
		System.out.println(arr.size());
		arr.print();
		

	}

}
