package accessModifiers;

public class Storage {

    public static void main(String[] args) {

        Chair chair = new Chair();
        chair.model = "AWS";
        chair.setSize(12);
        chair.info();


        System.out.println(chair.getSize());
    }
}
