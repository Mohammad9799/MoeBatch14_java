package Enumeration;

public class TestAllDays {
    public static void main(String[] args) {
        AllDays days = AllDays.Monday;
        switch (days){
            case Monday:
                System.out.println("Mondays are bad");
                break;
            case Friday:
                System.out.println("Fridays are great");
                break;
            case Saturday:
            case Sunday:
                System.out.println("Weekends are the best");
            default:
                System.out.println("Regular day");
        }
    }
}
