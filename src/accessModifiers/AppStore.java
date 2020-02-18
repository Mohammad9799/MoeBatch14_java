package accessModifiers;

import java.util.Date;

public class AppStore {
    public static void main(String[] args) {

        App whatsApp = new App("WhatsApp","Social Network",2.3);

        whatsApp.info();
        whatsApp.update();
        whatsApp.setSize(2.5);
        whatsApp.info();
        System.out.println();
        System.out.println(whatsApp.getReviews());


    }
}
