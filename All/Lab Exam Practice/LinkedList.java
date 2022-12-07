
public class LinkedList {
	Node head;
	
	Node n1;
	
	public boolean isEmpty() 
	{
		return head == null;
	}
	
	public void insertAtFirst(Object data)
	{
		Node newNode = new Node(data);
		
		if(isEmpty()) 
		{
			head = newNode;
		}
		else
		{
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void Undo()
	{
		if(head != null)
		{
			n1=head;
			head = head.next;
		}
		System.out.println("Undo Successfull");
	}

	
	
	public void Redo()
	{ 
		Node newNode = n1;
		
		if(isEmpty()) 
		{
			head = newNode;
		}
		else
		{
			newNode.next = head;
			head = newNode;
		}
		System.out.println("Redo Successfull");
	}
	
	public void Printall() 
	 {
		Node temp = head;
		if(head != null)
		{
			while(temp.next != null)
			{
				System.out.print(temp.data + ",  ");
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
		else
		{
			System.out.println("List is Empty ");
		}
		
	 } 
	
	
	public static void main(String[] args) 
    {
		LinkedList L1 = new LinkedList();
		L1.insertAtFirst("This");
		L1.insertAtFirst("is");
		L1.insertAtFirst("my");
		L1.insertAtFirst("Stack");
		L1.Printall();
		L1.Undo();
		L1.Undo();
		L1.Printall();
		L1.Redo();
//		L1.Redo();
//		L1.Printall();
    }
}

