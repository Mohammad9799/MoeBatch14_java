package Objects;

public class Paper {
    public static void main(String[] args) {
        Flag flagnumberOne =new Flag();
        Flag flagNumberTwo= new Flag();

        flagnumberOne.country="USA";
        flagnumberOne.color="Red/White and Blue";
        flagnumberOne.size= 50;
        flagnumberOne.material="Silk";

        flagNumberTwo.country=flagnumberOne.country;
        flagNumberTwo.color=flagnumberOne.color;
        flagNumberTwo.size=flagnumberOne.size;
        flagNumberTwo.material=flagnumberOne.material;

        flagnumberOne.country="a";
        flagnumberOne.color="a";
        flagnumberOne.size= 0;
        flagnumberOne.material="a";

        flagnumberOne.info();
        System.out.println("---------------");
        flagNumberTwo.info();

        System.out.println("-------------");
        flagnumberOne.upgrade(255,"gold");
        flagnumberOne.info();

    }
}
