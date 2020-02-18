package Arrays;

public class Names {
    public static void main(String[] args) {
        String [] names={"Taha","Jurabaks","Ahmed","Mohammad"};

        for (int i=0; i<names.length; i++){
            String ready=names[i];
            System.out.println(ready.charAt(0));

//            String lastLetter="";
            String sub =names[i].substring(names[i].length()-1);
            if (sub.equals("s")){
                System.out.println(names[i]);

            }


        }
    }
}
