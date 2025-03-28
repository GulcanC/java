// import ArrayList and List

import java.util.ArrayList;
import java.util.List;

public class BreakIntegerToDigit {
   public static List<Integer> splitToDigits(int number) {
       List<Integer> digitList = new ArrayList<>();
       while (number>0) {
           int digit = number%10;
           System.out.println(digit);
           digitList.add(0, digit); // add digit to the front of the list
           number /=10; // number = number/10
       }
      return digitList;
   }
   public static void main(String[] args) {
       int exNum = 12345;
       List<Integer> result = splitToDigits(exNum);

       System.out.println("Original Number is " + exNum);
       System.out.println("Digit list is " + result);
   }
}
