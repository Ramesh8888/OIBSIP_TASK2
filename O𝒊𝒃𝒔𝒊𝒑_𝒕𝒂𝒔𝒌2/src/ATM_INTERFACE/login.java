package ATM_INTERFACE;
import java.util.Dictionary;
import java.util.Hashtable;
public class login extends Transactions_History
{

	    private int AccountNo;
	    private int pin;
	    public boolean loginStatus = false ;
	    
	    
	     login(int AccountNo , int pin )
	     {
	        this.AccountNo = AccountNo;
	        this. pin = pin; 

	        Dictionary <Integer , Integer> input1 = new Hashtable<>();
	   

	    input1.put(89770055,1234);
	    input1.put(87901269,8888);
	        if (input1.get(AccountNo)!=null)
	        {

	        	if (pin == input1.get(AccountNo)){
	        	System.out.println("Login Sucessfull.....\n\n");
	            System.out.printf("	  Welcome %d\n", AccountNo );
	            this.loginStatus=true;
	           
	        	}
	        	else {System.err.println ("Plese enter a valid Pin Number");
	                
	        	}
	        }
	        else{
	            System.err.println("Please Enter valid Account Number!");
	        }
	    }
	}
