package StaticClass;

public class Dealer {
    public static void main(String[] args) {
        lexus carOne = new lexus("xx",2016);
        carOne.mileage= 50000;
        lexus.evaluateCar(carOne);
    }
}
