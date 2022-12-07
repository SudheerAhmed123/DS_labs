import java.util.Stack;

public class UndoRedoTask extends Stack {
	private static Stack<Character> undo = new Stack<Character>();
	private static Stack<Character> redo = new Stack<Character>();
	
	static void WRITE(Stack<Character> undo, char x) {
		undo.push(x);
	}
	
	static void UNDO(Stack<Character> undo, Stack<Character> redo) {
		char x = (char)undo.peek();
		undo.pop();
		redo.push(x);
	}
	
	static void REDO(Stack<Character> undo, Stack<Character> redo) {
		char x = (char) redo.peek();
		redo.pop();
		undo.push(x);
	}
	
	static void READ(Stack<Character> undo) {
		Stack<Character> rev = new Stack<Character>();
		while(undo.size()>0) {
			rev.push(undo.peek());
			undo.pop();
		}
		while(rev.size()>0) {
			System.out.print(rev.peek());
			undo.push(rev.peek());
			rev.pop();
		}
		System.out.print(" ");
	}
	
	static void QUERRY(String[] arr) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == "UNDO") {
				UNDO(undo,redo);
			}
			else if(arr[i] == "REDO") {
				REDO(undo, redo);
			}
			else if(arr[i] == "READ") {
				READ(undo);
			}
			else {
				WRITE(undo, arr[i].charAt(6));
			}
		}
	}
	
	public static void main(String[] args) {
		String[] Q = { "WRITE A", "WRITE B", "WRITE C", "UNDO", "READ", "REDO", "READ" };
		QUERRY(Q);
	}
}
