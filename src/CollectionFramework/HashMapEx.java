package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {

        Map< String, Integer> gradeScale = new HashMap<>();

        gradeScale.put("A",90);
        gradeScale.put("B",80);
        gradeScale.put("C",80);
        gradeScale.put("D",70);
        gradeScale.put("F",50);
        gradeScale.put("F",30);

        System.out.println(gradeScale.get("F"));

        System.out.println(gradeScale);

        Set<String> keys = gradeScale.keySet();

        for (String key:gradeScale.keySet()){
            System.out.println(key);
        }

    }
}
