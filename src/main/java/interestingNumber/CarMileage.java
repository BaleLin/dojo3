package interestingNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CarMileage {

  public static int isInteresting(int number, Integer [] awesomePhrases) {
    if(number < 100)
      return 0;
    else {
      if (digitFollowedByZeros(number))
        return 2;
      if(digitIsSameNumber(number))
        return 2;
      if(digitSequentialAndInc(number))
        return 2;
      if(digitSequentialAndDesc(number))
        return 2;
      if(digitIsPalindrome(number))
        return 2;
      if(matchAwesomePhrases(number, awesomePhrases))
        return 2;
      else return 0;
    }
  }

  private static boolean matchAwesomePhrases(int number, Integer[] awesomePhrases) {
    return awesomePhrases.length != 0;
  }

  private static boolean digitIsPalindrome(int number) {
    Integer[] array = numberToDigitArray(number);
    int arrayEndIndex = array.length - 1;
    for(int i = 0; i < array.length / 2; i++) {
      if(array[i] != array[arrayEndIndex - i])
        return false;
    }
    return true;
  }

  private static boolean digitSequentialAndDesc(int number) {
    Integer[] array = numberToDigitArray(number);
    for(int i = array.length - 1; i > 0; i--) {
      if ((array[i] - array[i - 1]) != 1) {
        return false;
      }
    }
    return true;
  }

  private static boolean digitSequentialAndInc(int number) {
    Integer[] array = numberToDigitArray(number);
    for(int i = array.length - 1; i > 0; i--) {
      if(array[i] == 0) {
        array[i] = 10;
      }
      if(array[i - 1] == 0) {
        array[i - 1] = 10;
      }
      if((array[i - 1] - array[i]) % 10 != 1) {
        return false;
      }
    }
    return true;
  }

  private static boolean digitIsSameNumber(int number) {
    Set<Integer> digitSet = new HashSet<Integer>(Arrays.asList(numberToDigitArray(number)));
    return digitSet.size() == 1;
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