package udemy;

public class Account {
      private Integer number;
      private String holder;
      private double balance;
      
      public Account(Integer number, String holder, double initDeposit)
      {
    	  this.number = number;
    	  this.holder = holder;
    	  this.balance = initDeposit;
      }
      public Account(Integer number, String holder)
      {
    	  
      }
	public Integer getNumber() {
		return number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount)
	{
		this.balance+= amount;
	}
	public void withdraw(double amount)
	{
		this.balance -= amount + 5.0;
	}
    
	public String toString()
	{
		return "Account "+this.number+", Holder: "+this.holder+", Balance $ "+String.format("%.2f", this.balance);
	}
      
}
