package aaa;

public class a2 {

        public static void main(String[] args) {
            System.out.println(findCommonChars("aiperi", "apple"));

        }

        public static String findCommonChars(String s1, String s2) {  // apple , java  == jvpple
            s1 = s1.trim().toLowerCase();
            s2 = s2.trim().toLowerCase();
            String fin = "";
            if (s1.equals(s2)) {
                return "";
            } else {
                for (int i = 0; i < s2.length(); i++) {
                    if (s1.contains(s2.charAt(i) + "")) {
                        s1 = s1.replace(s2.charAt(i) + "", "");
                        s2 = s2.replace(s2.charAt(i) + "", "");
                    }
                }

                //fin = s1 + s2;
                return s1+s2;


            }
        }
    }




