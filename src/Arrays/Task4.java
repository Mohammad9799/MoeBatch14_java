package Arrays;

public class Task4 {
    public static void main(String[] args) {
        String [] colors = new String[4];
        colors[0]= "Blue";
        colors[1]= "Red";
        colors[2]= "Black";
        colors[3]= "Green";

        for (int i =0; i<colors.length; i++){

            if(colors[i].length()>=4){
                System.out.println(colors[i]);
            }


//            System.out.println("This is "+ colors[i]);
        }





    }
}
