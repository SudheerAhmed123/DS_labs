import java.util.Arrays;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		
		int[][] arr= {{12,23,12,33,2,34}};
		int[] arr2= {12,12,23,44,54,65,3334,};
		System.out.println("The Real Prime " + Arrays.toString(arr2));
		System.out.println(arr2[2]);
		System.out.println(Arrays.deepToString(arr));
		System.out.println("Print the Length of Array = " + arr2.length);
		
		String[][]Arr= {{"String", "Sudheer", "Ahmed ", "Pitafi"}};
		String[][]Arr1= {{"here", "there", "where", "whom"}};
		System.out.println(Arrays.deepEquals(Arr, Arr1));
		
		String[][]arrys= {{"sudheer", "ahemd", "pitafi"}};
		String[][]arrys1= {{"sudheer", "ahemd", "pitafi"}};
		System.out.println(Arrays.deepEquals(arrys, arrys1));
		
		

	}

}
