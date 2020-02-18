package methods;

public class ArraysMethod {
    public static void main(String[] args) {
        String []arr={"a","b","c","x","z"};
//        System.out.println(Arrays.toString(increaseArray(arr,"s")));
    }
    public static String[] increaseArray(String [] arr, String word, int index){
        String [] newArr = new String[arr.length-1];
        for (int i=0, j=0; j<newArr.length; j++){

            if (index==j){
                newArr[j]= word;
            }else {
                newArr[j] = arr[i];
                i++;
            }
            return newArr;
        }
        return newArr;
    }
    public static String [] increaseArray(String []arr ,String word){

        String [] newArray=new String[arr.length+1];

        for (int i=0; i<arr.length; i++){
            newArray[i]=arr[i];

        }
        newArray[newArray.length-1]=word;

        return newArray;

    }
}
