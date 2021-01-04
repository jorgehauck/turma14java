package udemy;

import java.util.Locale;
import java.util.Scanner;
public class Bank {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		int number = 0;
		String holder = "";
		char initDeposit;
		double deposit, credito;
		
		Account account;
		System.out.print("Enter account number: ");
		number = leia.nextInt();
		System.out.println("Enter account holder: ");
	    leia.nextLine();
		holder = leia.nextLine();
		
		System.out.println("Is there na initial deposit (y/n)? ");
		initDeposit = leia.next().charAt(0);
		System.out.println();
		
		if(initDeposit == 'y')
		{
			System.out.println("Account data: ");
			System.out.println("Enter initial deposit value: ");
			deposit = leia.nextDouble();
			account = new Account(number, holder, deposit);
			
		}
		
		else
		{
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		System.out.println();
		System.out.println("Enter a deposit value: ");
		credito = leia.nextDouble();
		account.deposit(credito);
		
		System.out.println("Updated account data: ");
		System.out.println(account);
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double debito = leia.nextDouble();
		account.withdraw(debito);
		System.out.println(account);
	}

}
