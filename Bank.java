package banking;

import java.util.LinkedHashMap;

/**
 * Private Variables:<br>
 * {@link #accounts}: List&lt;Long, Account&gt;
 */
public class Bank implements BankInterface {
	private LinkedHashMap<Long, Account> accounts;

	public Bank() {
		// complete the function
		System.out.println("Bank account is created");
	}

	private Account getAccount(Long accountNumber) {
		// complete the function
        return accounts.get(accountNumber);
	}

	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		// complete the function
		//Account acc= new Account(getAccount);
		//acc.pin=pin;
		//accounts.put(null, null)
		//put(pin,pin);
		//accounts
		
        return -1L;
	}

	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		// complete the function
        return -1L;
	}

	public boolean authenticateUser(Long accountNumber, int pin) {
		// complete the function
		Account userAccount = getAccount(accountNumber);  
	     if(userAccount != null){  
	       return userAccount.validatePin(pin);  }
	       else {
	    	  System.out.println("Accountnumber os null");
	    	   return false;
	    	   }
	}

	public double getBalance(Long accountNumber) {
		// complete the function
        return accounts.get(accountNumber).getBalance();
	}

	public void credit(Long accountNumber, double amount) {
		// complete the function
		Account userAccount = getAccount(accountNumber);  
		userAccount.creditAccount(amount);
		
	}

	public boolean debit(Long accountNumber, double amount) {
		// complete the function
		Account userAccount = getAccount(accountNumber);  
        return userAccount.debitAccount(amount);
	}
}
