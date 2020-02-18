package MethodOverRiding;

public class checkingAccount extends BankAccount {

    @Override
    public void transfer(double amount) {

        double total = amount + (amount * 0.05);


        if (total > this.balance) {
            System.out.println("You don't have enough money in the balance");
        }else {
            System.out.println("Money is transferred");
            this.balance -= total;
        }

    }
}