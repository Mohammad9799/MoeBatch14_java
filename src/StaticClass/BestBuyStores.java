package StaticClass;

public class BestBuyStores {
    public static void main(String[] args) {

        BestBuy storeOne = new BestBuy();
        BestBuy storeTwo = new BestBuy();
        BestBuy.printComputer();

//        System.out.println(storeOne.numOfComputers);
        storeOne.numOfComputers--;

        System.out.println(storeTwo.numOfComputers);






    }
}
