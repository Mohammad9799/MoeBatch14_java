package methods;

public class WeekDays {
    public static void main(String[] args) {
        System.out.println(isWeekday("Monday"));
    }
   public static boolean isWeekday(String day){


       switch (day){
           case "Monday":
           case "Tuesday":
           case "Wednesday":
           case "Thursday":
           case "Friday":
               return true;
           case "Saturday":
           case "Sunday":
               return false;
           default:
               System.out.println("Invalid day provided!!");
               return false;
       }

   }
}
