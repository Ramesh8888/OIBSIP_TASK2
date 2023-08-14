package ATM_INTERFACE;
import java.util.Dictionary;
import java.util.Hashtable;
public class Transactions_History extends atm
{
		static int Balance;

		public int accBalance(int AccountNo) {
			Dictionary<Integer, Integer> userBalance = new Hashtable<>();
			userBalance.put(89770055, 5000);
			userBalance.put(87901269, 1234); //Intial Amount
			Balance = userBalance.get(AccountNo);
			return Balance;
		}

		public void updtBalance(int amount) {
			Balance = amount;

		}

		public int cred_balance(int amount) {
			Balance = Balance + amount;
			return Balance;

		}

		public int deb_balance(int amount) {
			Balance -= amount;
			return Balance;
		}
}
