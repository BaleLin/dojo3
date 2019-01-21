package interestingNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CarMileage {

  public static int isInteresting(int number) {
    if(number < 100)
      return 0;
    else {
      if (digitFollowedByZeros(number))
        return 2;
      if(digitIsSameNumber(number))
        return 2;
      if(digitSequentialAndInc(number))
        return 2;
      else return 0;
    }
  }

  private static boolean digitSequentialAndInc(int number) {
    return true;
  }

  private static boolean digitIsSameNumber(int number) {
    Set<Integer> digitSet = new HashSet<Integer>(Arrays.asList(numberToDigitArray(number)));
    if(digitSet.size() == 1)
      return true;
    return false;
  }

  private static boolean digitFollowedByZeros(int number) {
    Integer[] array = numberToDigitArray(number);
    int multiple = array.length - 1;
    return number % Math.pow(10, multiple) == 0;
  }

  private static Integer[] numberToDigitArray(int number) {
    List<Integer> digitList = new ArrayList<Integer>();
    int digit = number % 10;
    digitList.add(digit);
    number /= 10;
    while(number > 0) {
      digit = number % 10;
      digitList.add(digit);
      number /= 10;
    }
    return digitList.toArray(new Integer[0]);
  }
}