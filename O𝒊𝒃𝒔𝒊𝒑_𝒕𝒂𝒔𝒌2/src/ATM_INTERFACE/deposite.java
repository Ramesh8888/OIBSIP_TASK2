package ATM_INTERFACE;

public class deposite extends Transactions_History
{
		private int accBalance;

		deposite(int deposite_amount) {
			this.accBalance = cred_balance(deposite_amount);

			System.out.printf("Rs.%d is successfully deposited into you account ",deposite_amount);
			System.out.printf("your current balance is : Rs.%d",accBalance);

		}
	}


