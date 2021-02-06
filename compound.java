import java.util.Scanner;
public class compound {
	public static void main(String args[]) {
		double amount;
		double rate;
		double year;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the amount invested: $");
		amount = in.nextDouble();
		System.out.print("Enter the rate: ");
		rate = in.nextDouble();
		System.out.print("Enter the number of years: ");
		year = in.nextDouble();
		
		interest interestObject = new interest();
		interestObject.setAmount(amount, rate, year);
		interestObject.calculate();
	}
}
