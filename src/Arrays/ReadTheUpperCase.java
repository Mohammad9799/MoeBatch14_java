package Arrays;

public class ReadTheUpperCase {
    public static void main(String[] args) {
        int count = 0;
        String [] items = {"Bread", "cucumber", "Apples", "Orange", "cookies", "Cake"};
        for(String item: items) {

            char start = item.charAt(0);
            // if(Character.isUpperCase(start)); -> method takes character
            if(Character.isUpperCase(start)) {
                count++;
                System.out.println(item);
            }

//            if(start >= 65 && start <= 90) {
//                count++;
//            }

        }
        System.out.println(count);




    }
}
