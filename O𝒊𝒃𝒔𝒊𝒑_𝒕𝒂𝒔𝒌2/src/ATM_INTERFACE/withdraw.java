package ATM_INTERFACE;

public class withdraw extends Transactions_History
{

		private int balance;

		withdraw(int amount) {
			balance = Balance;

			if (amount <= balance) {
				balance = deb_balance(amount);

				System.out.printf("Rs.%d has been debited from your account.\nYour current balance is  : Rs.%d", amount,
						balance);
			} else {
				System.err.println("Insufficient balance!!");
			}
		}
}
