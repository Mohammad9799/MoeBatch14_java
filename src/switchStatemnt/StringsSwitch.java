package switchStatemnt;

public class StringsSwitch {
    public static void main(String[] args) {
        String fruit="apple";
        switch (fruit){
            case "orange":
                System.out.println("Oranges are sweet!");
                break;
            case "banana":
            case "apple" :
                System.out.println("My favorite");
                break;
            default:
                System.out.println("Not a fruit");

        }
    }
}
