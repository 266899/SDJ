
public class Stock_Commission 
{

	public static void main(String[] args) 
	{
		int shares=1000;
		double sharePrice=25.5;
		double commission = 0.02;
		
		double totalSharesPrice = shares * sharePrice;
		double commissionPrice = totalSharesPrice * commission;
		double total = totalSharesPrice + commissionPrice;
		
		System.out.println("Paid for shares: " + totalSharesPrice);
		System.out.println("Paid for commission: " + commissionPrice);
		System.out.println("Paid in total: " + total);
		

	}

}
