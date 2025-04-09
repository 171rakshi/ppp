package tns.com.assignment4;

public class CreditCard implements PaymentInterface {
		String cardName;
		String cardNo;
		
		public CreditCard(String cardName, String cardNo)
		{
			this.cardName = cardName;
			this.cardNo = cardNo;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Credit Card Payment");
		}

		@Override
		public void process(double amt) {
			// TODO Auto-generated method stub
			System.out.println("Payment of "+amt+" was done using "+cardName+" and card no is :"+cardNo);
		}

	}

