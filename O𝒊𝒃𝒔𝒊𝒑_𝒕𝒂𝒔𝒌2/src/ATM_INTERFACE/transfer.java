package ATM_INTERFACE;

public class transfer extends Transactions_History
{
		private int balance;

		transfer(int benificiary, int amount) {

			this.balance = Balance;

			if (amount <= balance) {
				balance = deb_balance(amount);
				updtBalance(balance);

				System.out.printf("Rs. %d has been succesfully transfered to %d.\nyour remaining balance is : Rs.%d",
						amount, benificiary, balance);
			} else {
				System.out.println("Insufficient balance!!");

			}

		}

	}
