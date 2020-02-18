package Moe;

public class CamelCase {

    public static void main(String[] args) {

        String Ex = "java is fun";
        String box = "";

        String [] word = Ex.split(" ");

        for (int i = 0; i<word.length; i++){
            if(!word[i].isEmpty()){
                word[i] = word[i].substring(0,1).toUpperCase() +
                        word[i].toLowerCase().substring(1);
            }
            box += word[i]+" ";
        }
        System.out.println(box);


    }
}
