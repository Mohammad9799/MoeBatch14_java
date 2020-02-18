package Arrays;

public class Cities {
    public static void main(String[] args) {
        String [] cities = { "New York", "Madison","Chicago", "Miami", "Washington", "Chicago"};

        boolean check = false;
        int count = 0;

        for(String city: cities) {
            if(city.equalsIgnoreCase("Chicago")) {
                check = true;
                count++;
            }
        }

        if(check) {
            System.out.println("Windy city found " + count + " times");
        } else {
            System.out.println("Windy city not found");
        }



    }
}
