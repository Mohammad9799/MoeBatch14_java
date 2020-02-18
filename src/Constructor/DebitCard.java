package Constructor;

public class DebitCard {

        long cardNumber;
        String nameHolder;
        String cardType;
        int pin;
        double balance;

    public void info(){
        System.out.println("Card Number: "+cardNumber);
        System.out.println("Holder Name: "+ nameHolder);
        System.out.println("Balance: "+balance);
        if (cardType!=null){
            System.out.println("Card type is "+ cardType);
        }

    }
    public DebitCard(String nameHolder,long cardNumber,double balance){

        this.cardNumber=cardNumber;
        this.nameHolder=nameHolder;
        this.balance=balance;
        String cardNum=cardNumber+"";

        if (cardNum.length()==16){
            this.cardNumber=cardNumber;
        }else {
            System.out.println("invalid card number");
        }

    }

    public DebitCard(long cardNumber,String nameHolder,double balance,int pin,String cardType){
        this(nameHolder, cardNumber,balance);
        if(String.valueOf(pin).length() == 4) {
            this.pin = pin;
        } else {
            System.out.println("Invalid pin");
        }

        if(cardType.equalsIgnoreCase("mastercard") || cardType.equalsIgnoreCase("visa")) {
            this.cardType = cardType;
        } else {
            System.out.println("Invalid card type");
        }
    }









}
