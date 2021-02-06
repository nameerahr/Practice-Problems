import java.util.Scanner;

public class palindrome {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a palindrome: ");
		String word = input.nextLine().toLowerCase();
		
		int length = word.length();
		int check = 0;
		
		
		for(int x = length-1, y=0; x>=0 & y< length; x--, y++) /*y starts at first letter and x starts at last letter. 
																Also x must equal length -1 because char starts at 0 
																but length starts at 1*/
		{                                                           
			if (word.charAt(y) == word.charAt(x)) 
			{
				check ++; //adds one each time letters match until the whole word is checked
			}
			else 
			{
				break;
			}

		}
		
		if (check == word.length()) //makes sure that every letter has been checked and is correct
		{ 
			System.out.println("True");
		}
		else 
		{
			System.out.println("False");
		}
		
	
		}
	}
