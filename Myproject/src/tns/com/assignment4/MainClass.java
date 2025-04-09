package tns.com.assignment4;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard credit = new CreditCard("Amex","7896 7851 6324 6332");
		UpiPayment upi = new UpiPayment("Gpay","abe46gc246efa6");
		credit.process(18000);
		upi.process(56000);
	}

}