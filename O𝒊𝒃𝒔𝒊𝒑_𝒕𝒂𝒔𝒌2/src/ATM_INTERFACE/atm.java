package ATM_INTERFACE;
import java.util.ArrayList;
import java.util.Scanner; 

public class atm 
{
	   public static void main(String[] args) {

	        ArrayList <Integer> arr =  new ArrayList<Integer >();
	        Scanner a = new Scanner(System.in);

	        System.out.println("Welcome My_Bank🏛 ATM");

	        System.out.print("Enter Account Number : ");
	        int AccountNo = a.nextInt();

	        System.out.print("Enter Pin : ");
	        int pin= a.nextInt();

	        login user =new  login(AccountNo,pin);
	        Transactions_History bal = new Transactions_History ();
	        int userBalance =bal.accBalance(AccountNo);
	        int i=0;
	        int rem_blns = 0;
	        while (i<10){
	        if (user.loginStatus == true){
	        	System.out.println("\n**************");
	            System.out.println("\n1 : Transactions History");
	            System.out.println("2 : Withdraw");
	            System.out.println("3 : Transfer");
	            System.out.println("4 : Deposite");
	            System.out.println("5: Quit");
	            System.out.println("Please Enter Your choice : ");
	        
	        int choice = a.nextInt();
	        
	        switch(choice){
	            case 1: 
	            if (arr.isEmpty())
	            {
	                System.err.println("No recent transactions !");
	            }
	            else{
	            System.out.println("Your Transactions are :"); 
	           
	            for(int itr=0 ;itr<arr.size();itr++){
	                System.out.printf("Transaction %d : %d\n",itr+1,arr.get(itr));
	                rem_blns=(rem_blns+arr.get(itr));
	            }
	            System.out.print("Current  Balance : ");
	            System.out.println(rem_blns+userBalance);
	            }
	            break;
	            
	            case 2: 
	            System.out.print("Enter the amount you have to withdraw : ");
	            int amount = a.nextInt();
	            //System.out.println();
	            new withdraw( amount);
	            arr.add(-amount);
	            break;
	                    
	            case 3: 
	            System.out.print("Enter the benificiaries account number : ");
	            int beificiary = a.nextInt();
	            System.out.print("Enter the amount you want to transfer : ");
	            int transfer_amount = a.nextInt();
	            new transfer( beificiary, transfer_amount);
	            arr.add(-transfer_amount);
	                    break;
	            case 4: 
	            System.out.print( "Enter the amount you have to deposite : ");
	            int deposite_amount = a.nextInt();
	             new deposite(deposite_amount);
	            arr.add( +deposite_amount);
	            break;
	           
	            case 5 : 
	            System.out.println("Logout Sucessfully...\nHave a nice day 😁😍...Thank You!🙏🙏🙏....Visit Again...🏛🏛");
	            i=10;     
	            System.exit(1);       
	            break;    
	          
	            default: System.err.println("please enter valid input!");

	        }
	        i++;
	    }
	    else {
	        System.err.println("System timed out....Try Again...Thank You!");
	        break;
	    }
	}
	        a.close();
	}
	}
