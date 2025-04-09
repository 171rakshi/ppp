package tns.com.assignment4;

public class UpiPayment implements PaymentInterface {
		String upiName;
		String upiId;
		
		public UpiPayment(String upiName,String upiId)
		{
			this.upiName = upiName;
			this.upiId = upiId;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Upi Payment Initiated");
		}

		@Override
		public void process(double amt) {
			// TODO Auto-generated method stub
			System.out.println("Payment of "+amt+" was done using "+upiName+" and ref no is : "+upiId);
		}

	}

