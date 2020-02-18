package Moe;

import java.util.HashMap;

public class CountChars {

    public static void main(String[] args) {

        String s = "mohammad";


        HashMap<Character,Integer> map = new HashMap<>();


        for (char ch: s.toCharArray()){
            if (!map.containsKey(ch)){
                map.put(ch,1);
            }else {
                map.put(ch,map.get(ch) + 1);
            }
        }
//        System.out.println(map);

        int [] arr = {1,1,2,3,5,9,8,7,1,4,6,3,6,};

        HashMap<Integer,Integer> map1 = new HashMap<>();

        for (int i = 0; i<arr.length; i++){
            if (!map1.containsKey(arr[i])){
                map1.put(arr[i],1);

            }else {
                map1.put(arr[i],map1.get(arr[i])+1);
            }
        }

        System.out.println(map1);

    }
}
