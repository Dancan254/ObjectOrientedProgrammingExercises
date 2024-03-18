import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysInJava {

    public static void main(String[] args) {
//        int[] arr = new int[4];//length => 4 //max index/last index length - 1-> 3
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        arr[3] = 4;
//        System.out.println(Arrays.toString(arr));

        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println("Original array");
        System.out.println(Arrays.toString(arr2));

        System.out.println("Reversed array");
        reverseArray(arr2);
        System.out.println(Arrays.toString(arr2));
        sumFirstLastNum(252);

        List<Integer> nums = getOneBits(161);
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(Arrays.toString(nums.toArray()));
        }
        List<Integer> positions = getOneBits(161);
        for (int pos : positions) {
            System.out.println(pos);
        }

    }

    public static void reverseArray(int[] arr){
        //create th starting index ->
        int start = 0;
        int end = arr.length - 1;
        //iterate through the array
        /**
         * while(condition){
         * body
         * increment/decrement
         * }
         */
        while(start < end) { //start 0 1, 2, 3, 4 5
            //create a temp
            int temp = arr[start]; //start = 0 -> 8
            //swapping elements from start to end
            //arr[end] = 5 ->start -> 1
            //switch the first and last element
            arr[start] = arr[end];
            arr[end] = temp;//

            //move pointers
            start++;//0-> 1
            end--;// <<

        }
    }

    public static void sumFirstLastNum(int num){
        //245
        //convert it to a string
        String number = Integer.toString(num);
        int lengthOfString = number.length();

        //access the first number
        int firstNumber = Character.getNumericValue(number.charAt(0));
        int lastNumber = Character.getNumericValue(number.charAt(lengthOfString-1));

        int sum = firstNumber + lastNumber;
        System.out.println("The sum is " + sum);
    }

//    public static List<Integer> getOneBits(int n) {
//        List<Integer> positions = new ArrayList<>();
//        int position = 1;
//        int count = 0;
//        while (n > 0) {
//            if ((n & 1) == 1) {
//                positions.add(position);
//                count++;
//            }
//            n >>= 1;
//            position++;
//        }
//        List<Integer> result = new ArrayList<>();
//        result.add(count); // Add count of 1-bits
//        result.addAll(positions); // Add positions of 1-bits
//        return result;
//    }
public static List<Integer> getOneBits(int n) {
    String binaryString = Integer.toBinaryString(n);
    List<Integer> positions = new ArrayList<>();
    int count = 0;

    for (int i = 0; i < binaryString.length(); i++) {
        if (binaryString.charAt(i) == '1') {
            positions.add(binaryString.length() - i);
            count++;
        }
    }

    List<Integer> result = new ArrayList<>();
    result.add(count); // Add count of 1-bits
    result.addAll(positions); // Add positions of 1-bits
    return result;
}


}
