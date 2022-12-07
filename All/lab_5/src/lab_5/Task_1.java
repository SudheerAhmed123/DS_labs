package lab_5;

import java.util.Scanner;
import java.util.Stack;


	

public class Task_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Data Structure ");
		
		String sent; int pun = 0;
		
		Scanner x = new Scanner (System.in);
		
		System.out.println("Enter the Sentence");
		
		sent = x.nextLine();
		
		String [] word = sent.split("\\s");
		Scanner w =  new Scanner (System.in);
		
		for(int p=0; p<word.length; p++) {
			
			System.out.println(word[p]);
			
			
		}
		
		System.out.println("Enter The Word:");
		
		for(int p=0; p<word.length; p++) {
			
			String input = w.next();
			
			      if(word[p]==input){
			//if(input == word[p])
				
				
				
				System.out.println(word[p++]);
				
			}
			      else {
			    	  System.out.println("Nothing to print");
			    	  
			      }
			      
			 
		}
		
	}

}
