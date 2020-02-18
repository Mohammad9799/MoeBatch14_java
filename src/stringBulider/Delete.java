package stringBulider;

import utilities.MyCollection;

import java.util.ArrayList;


public class Delete {
    public static void main(String[] args) {
       System.out.println(deleteWord("I want to concant"));



    }

    public static String deleteWord(String str){

//        if (str.contains("con")) {
//            str = str.replace("con", "");
//        }
//        return str;
//

        StringBuilder sb = new StringBuilder(str);
        int index = sb.indexOf("con");

        if (index>=0){
            sb.delete(index,index+3);
        }
        return sb.toString();
    }

public static String deleteWord(String word, String target){
        StringBuilder sb = new StringBuilder(word);

        int index = sb.indexOf(target);
        if (index >=0){
            sb.delete(index,index+target.length());
        }
        return sb.toString();
}



    public static ArrayList<String>  insertWord (ArrayList<String> list){



        for (int i = 0; i<list.size(); i++){

            if (list.get(i).length()%2==0){
                StringBuilder sb = new StringBuilder(list.get(i));

                sb.insert(list.get(i).length()/2,"HELLO");

                list.set(i,sb.toString());
            }
        }
        return list;
    }


public static ArrayList<String>  insertWord (ArrayList<String> list,String target){



        for (int i = 0; i<list.size(); i++){

            if (list.get(i).length()%2==0){
               StringBuilder sb = new StringBuilder(list.get(i));

               sb.insert(list.get(i).length()/2,target);

               list.set(i,sb.toString());
            }
        }
   return list;
}





}
