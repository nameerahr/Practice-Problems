import java.util.Scanner;
public class doublearray {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many terms in your first array? It will be the same in the second array.");
		int s = in.nextInt();
		int array[] = new int [s];
		int sum = 0;

		
		for(int i=0;i< s ;i++)
		{
	        System.out.println("Enter term at " + i + " in first array");
			array[i]=in.nextInt();
	
		}
		
		int array2[] = new int[s];
		
		for(int i=0;i< s ;i++)
		{
			System.out.println("Enter term at " + i + " in second array");
			array2[i]=in.nextInt();
	
		}
		
		
		for (int i = 0; i<s; i++)
		{
			for (int n = 0; n<s; n++) 
			{
			if (array[i] == array2[n]) {
			System.out.println("Common number is " + array[i]);
			return;
			}
			else {
				sum++;}
		}	
			}
		
			if(sum ==s) 
			{
				System.out.println("There is no common number");
			}
		
	}
}
