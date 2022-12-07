package lab_4;

import java.util.HashSet;

public class Task3 {
	 
    static Node head; 
    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
 
    static public void push(int new_data)
    {

        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
 
    static boolean detectLoop(Node h)
    {
        HashSet<Node> s = new HashSet<Node>();
        while (h != null) {
            if (s.contains(h))
                return true;
            s.add(h);
            h = h.next;
        }
 
        return false;
    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Task3 linkedlist = new Task3();
			 
	        linkedlist.push(20);
	        linkedlist.push(4);
	        linkedlist.push(15);
	        linkedlist.push(10);
	 
	     
	        linkedlist.head.next.next.next.next = linkedlist.head;
	 
	        if (detectLoop(head))
	            System.out.println("Loop found");
	        else
	            System.out.println("No Loop");
	    }

	}


