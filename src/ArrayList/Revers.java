package ArrayList;

public class Revers {
    public static void main(String[] args){
        String sen = "We went to picnic today";
        String rev= "";

        for (int i=sen.length()-1; i>=0; i-- ){
            rev += sen.charAt(i);
        }
        System.out.println(rev);

    }
}
