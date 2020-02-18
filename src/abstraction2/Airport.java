package abstraction2;

public class Airport {




    public static void main(String[] args) {

        Jet jet =new Jet();
        jet.AGE = 20 ;
        System.out.println(jet.AGE);

        jet.takeOff();
        jet.turnWifiOn();

    }


}
