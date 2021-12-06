/**
   A class to test the BankAccount class.
*/
public class BankAccountTester
{
   public static void main(String[] args)
   {
	   
		BankAccount harrysChecking = new BankAccount();
		final double badBal = -500;
		final double goodBal = 500;
		final double badDeposit = -100;
		final double goodDeposit = 100;
		final double badWithdraw = -200;
		final double goodWithdraw = 200;
		final double exceedsBalance = 1000;
		
		
		/**
		try {
	    	  System.out.println("Cannot enter negative balance for new account: " + badBal);
	    	  System.out.println("Successful new account: " + goodBal);
	    	  System.out.println("Cannot deposit negative ammount: " + badDeposit);
	    	  System.out.println("Successful deposit: " + goodDeposit);
	    	  System.out.println("Cannot withdraw this ammount: " + badWithdraw);
	    	  System.out.println("Successful withdrawl: " + goodWithdraw);
	    	  System.out.println("Withdrawl exceeds balance: " + exceedsBalance);
	    	  System.out.println("Account Balance: " + harrysChecking);
	      } 
	      catch (IllegalArgumentException) {
	    	  
	      }
		**/
		
		
		
		try {
			harrysChecking.initialBalance(badBal);
			System.out.println("Successful new account: " + badBal);
		} 
		catch (IllegalArgumentException bal) {
			System.out.println(bal.getMessage());
		}
		 
		
		try {
			harrysChecking.initialBalance(goodBal);
			System.out.println("Successful new account: " + goodBal);
		} 
		catch (IllegalArgumentException bal) {
			System.out.println(bal.getMessage());
		}
		
		
		try {
			harrysChecking.deposit(badDeposit);
			System.out.println("Successful deposit: " + badDeposit);
		} 
		catch (IllegalArgumentException deposit) {
			System.out.println(deposit.getMessage());
		}

		
		try {
			harrysChecking.deposit(goodDeposit);
			System.out.println("Successful deposit: " + goodDeposit);
		} 
		catch (IllegalArgumentException deposit) {
			System.out.println(deposit.getMessage());
		}
		
		
		try {
			harrysChecking.withdraw(badWithdraw);
			System.out.println("Successful withdrawal: " + badWithdraw);
		} 
		catch (IllegalArgumentException wd) {
			System.out.println(wd.getMessage());
		}
		
		try {
			harrysChecking.withdraw(goodWithdraw);
			System.out.println("Successful withdrawal: " + goodWithdraw);
		} 
		catch (IllegalArgumentException wd) {
			System.out.println(wd.getMessage());
		}
		
		
		try {
			harrysChecking.withdraw(exceedsBalance);
			System.out.println("Successful withdrawal: " + exceedsBalance);
		} 
		catch (IllegalArgumentException bal) {
			System.out.println(bal.getMessage());
		}
		
		System.out.println("Account balance is: " + harrysChecking.getBalance());
   }
}