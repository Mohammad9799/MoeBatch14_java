package StaticClass;

class lexus{

    String model;
    int year;
    String color;
    double mileage;
    boolean isNew;
    double price;
    static int totalNumOfLexus;


    public lexus(String model, int year){
        this.model=model;
        this.year=year;
        totalNumOfLexus++;
    }

    public static double milesToKm(double miles){
        return miles * 1.6;

    }

    public static void evaluateCar(lexus car){
        int age = 2019 - car.year;

        if (car.mileage < 50000 && age <= 3){
            System.out.println("Best Choice");

        }else if ((car.mileage >= 50000 && car.mileage < 100000) && age >= 3 && age < 7){
            System.out.println("Fair Choice");

        }else if (car.mileage >= 100000 && car.mileage < 20000){
            System.out.println("YOU decide");

        }else if (car.mileage >= 20000){
            System.out.println("Stay away");
        }else {
            System.out.println("!! Not able to evaluate !!");
        }



    }







}
