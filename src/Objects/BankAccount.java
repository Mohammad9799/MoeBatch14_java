package Objects;

public class BankAccount {

    String type;
    int accountNumber;
    double balance;
    String holderName;

    public void deposit(double Dip){
        System.out.println(Dip+"is deposited to your account");
       this.balance +=Dip;
    }
    public void transfer(double Dip){
        if (this.balance>=Dip){
            System.out.println(Dip+ " $ is trasferred from y");
        }
    }






}
