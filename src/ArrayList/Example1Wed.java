package ArrayList;

public class Example1Wed {
    public static void main(String[] args) {

        String[]cars={"mercedes","bmw","toyota","ferrari"};

        for (int i = 0; i<cars.length; i++){

            if (cars[i].contains("mercedes")){
                System.out.println(cars[i]+": Luxury");
            } else if (cars[i].contains("bmw")) {
                System.out.println(cars[i]+": Luxury-Sport");
            }else if (cars[i].contains("toyota")){
                System.out.println(cars[i]+": Reliable-Cheap");
            }else if (cars[i].contains("ferrari")){
                System.out.println(cars[i]+": Super car- expensive");
            }

        }


    }
}
