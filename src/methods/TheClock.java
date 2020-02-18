package methods;

public class TheClock {
    public static void main(String[] args) {

        clock(3,50,false);

    }
    public static void clock(int hour, int minutes, boolean amOrpm){
        boolean PM= false;

        if ((hour>0 && hour<13) && (minutes>=0 && minutes<60) ){

            String date = hour + " : " + minutes;

            if (amOrpm){
                date+= " AM";
            }else {
                date+=" PM";
            }
            System.out.println(date);






            }else {
            System.out.println("Invalid Data");
        }



    }
}
