package MethodOverRiding;

public class BankAccount {

   public double balance;
   public long accountNumber;
   public String name;

    public void info(){
        System.out.println("Name: " +this.name);
        System.out.println("Account Number: "+ this.accountNumber);
        System.out.println("Balance: " + this.balance);
    }

    public void transfer(double amount){
        System.out.println("Money is transferred: " +amount);
        this.balance -= amount;
        this.balance -=(amount*0.1);

    }

    public void deposit(double dip){
      this.balance += dip;
    }



}
