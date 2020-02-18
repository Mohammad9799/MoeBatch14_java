package Moe;

public class DeleteSomeOfTheWord {
    public static void main(String[] args) {
        String [] words={"kilogramm","kilometer","kilobyte","kilobit"};



        for (int i=0; i<words.length; i++){

            if (words[i].startsWith("kilo")){
                System.out.println();
                System.out.println(i+"-"+ " " +words[i].substring(3));
            }else {
                System.out.println(words[i]);
            }




        }












    }
}
