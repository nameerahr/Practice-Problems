
public class interest {
	private double moneyy;
	private double percentt;
	private double timee;
	
	public void setAmount(double money, double percent, double time) 
	{
		moneyy = money;
		percentt = percent;
		timee = time;
	}
	
	public void calculate() 
	{
		int hundred = 100;
		double decimal =  percentt/hundred;
		double roi = 1 + decimal;
		double total = moneyy * Math.pow(roi, timee);
		System.out.printf("The final amount is: %.2f", total);
	}
	}

