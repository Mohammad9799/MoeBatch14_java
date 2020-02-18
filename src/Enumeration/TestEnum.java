package Enumeration;

public class TestEnum {
    public static void main(String[] args) {


        enumEx.LatterGrade grade;
        grade = enumEx.LatterGrade.A;

        switch (grade){
            case A:
                System.out.println("You got an A");
                break;
            case B:
                System.out.println("Not bad");
                break;
            case C:
                System.out.println("You could do batter");
                break;
            case D:
                System.out.println("Not good ");
                break;
            case F:
                System.out.println("You failed");
                break;

        }



    }
}
