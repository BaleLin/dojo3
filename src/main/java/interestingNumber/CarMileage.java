package interestingNumber;

import java.util.ArrayList;
import java.util.List;

public class CarMileage {

  public static int isInteresting(int number) {
    if(number < 100)
      return 0;
    else {
      if (digitFollowedByZeros(number))
        return 2;
      if(digitIsSameNumber(number))
        return 2;
      else return 0;
    }
  }

  private static boolean digitIsSameNumber(int number) {
    return true;
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