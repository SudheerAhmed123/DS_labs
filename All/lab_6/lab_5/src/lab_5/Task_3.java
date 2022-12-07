package lab_5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task_3 {
	
	static void pClosest(int [][] pts, int k) {
		int n = pts.length;
		int [] distance = new int [n];
		for(int i=0;i<n ;i++) {
			int x = pts[i][0], y = pts [i][1];
			distance[i] = (x*x) + (y*y);
		}
		
		Arrays.sort(distance);
		int distk = distance[k-1];
		for(int i=0;i<n;i++) {
			 int x = pts[i][0], y = pts[i][1];
		        int dist = (x * x) + (y * y);
		         
		        if (dist <= distk)
		        	System.out.println(" [" + x + ", " + y + "] ");
		            
		}

	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int points[][] = { { 3, 3 },
                { 5, -1 },
                { -2, 4 } };

		 int K = 2;

		 pClosest(points, K);

	}

}
