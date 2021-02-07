import java.util.Scanner;

public class inputarray {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many terms in your sequence?");
		int s = in.nextInt();
		int array[] = new int [s];
		int sum = 0;
		
		for(int i=0;i< s ;i++)
		{
            System.out.println("Enter term at " + i);
			array[i]=in.nextInt();
	
		}
			
		for(int a = 0; a<s; a++) 
		{
            if (array[a] == 7 && array[a+1]== 8 && array[a+2] == 9) 
            {
            	sum++;
            } 
            else 
            {
            }
            }
		
		if (sum >=1) 
		{
			System.out.println("True");
		}
		else 
		{
			System.out.println("False");
		}
		
		}
}
