package Objects;

public class TestMouse {
    public static void main(String[] args) {

        Mouse m1 =new Mouse();
        Mouse m2 =new Mouse();
        m1.color="White";
        m2.color = "red";
        Mouse m3 = m2;
        System.out.println(m2.color);
        System.out.println(m1.color);
        System.out.println(m3.color);

        Mouse m4 = new Mouse("gray",23,true);



    }
}
