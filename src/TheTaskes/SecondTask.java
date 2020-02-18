package TheTaskes;

public class SecondTask {
    public static void main(String[] args) {
        System.out.println(fullWord("james","ja",2));
    }
    public static boolean fullWords(String first, String second){

        if (first.startsWith(second)){

            return true;

        }else {
        return false;
        }

    }
    public static boolean fullWord(String first, String second,int times){
        int count = 0;
        for(int i=0; i<first.length()+1; i++){
            String sub = first.substring(i,i+second.length());
            if (sub.equals(second)){
                count++;
            }
        }
        if (times==count) return true;
        return false;
    }
}

