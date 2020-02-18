package MethodOverRiding;

public class SavingAccount extends BankAccount {

   public double interestIncome;

   @Override
   public void transfer(double amount){
       this.balance -= amount;
       this.balance -= (amount * 0.20);
   }
   @Override
    public void info(){
       super.info();
       System.out.println("Interest Income: " + interestIncome);
   }

   public void culateAnnualInterestIncome(){}
}
