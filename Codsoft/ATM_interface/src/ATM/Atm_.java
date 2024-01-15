package ATM;

import java.util.Scanner;

public class Atm_ {
	
	static Scanner sc = new Scanner(System.in);
	private static int menulist() {
		
		System.out.println("Welcome To ATM");  
        System.out.println("Choose 1 for Withdraw");  
        System.out.println("Choose 2 for Deposit");  
        System.out.println("Choose 3 for Check Balance");  
        System.out.println("Choose 4 for EXIT");  
        System.out.print("Choose the operation you want to perform:");  
        int choice = sc.nextInt(); 
		return choice;
	}
	
	private static void checkBalance(BankAccount account) {
        double balance = account.getBalance();
        System.out.println("Current Balance: " + balance);
    }

    private static void deposit(BankAccount account, Scanner scanner) {
        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();
        account.deposit(amount);
    }

    private static void withdraw(BankAccount account, Scanner scanner) {
        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();
        account.withdraw(amount);
    }
	
	

	public static void main(String[] args) {
		int choice;
		System.out.println("enter the initial balance : ");
		
		double initial_balance = sc.nextDouble();
		
		BankAccount user = new BankAccount(initial_balance);
		
		while((choice = menulist()) != 4)
		{
			switch(choice)
			{
			case 1 :
				withdraw(user, sc);
				break;
				
			case 2 :
				deposit(user, sc);
				break;
				
			case 3 :
				checkBalance(user);
				break;
				
			case 4 :
				System.out.println("Exiting ATM. Thank you!");
                break;
                
			default:
                System.out.println("Invalid option. Please choose a valid option.");
			}
			
		}
		
		System.out.println("\n Thank you for using ATM");
		
	}

}

class BankAccount
{
	 private double balance;

	    public BankAccount(double initial_Balance) {
	        this.balance = initial_Balance;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposit successful. New balance: " + balance);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawal successful. New balance: " + balance);
	        } else {
	            System.out.println("Invalid withdrawal amount or insufficient funds.");
	        }
	    }
}
