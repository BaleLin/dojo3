package interestingNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CarMileage {

  private static final int NOT_INTERESTING_NUMBER_RANGE = 0;
  private static final int INTERESTING_NUMBER_RANGE = 100;
  private static final int BORING_NUMBER = 0;
  private static final int CLOSE_TO_NUMBER = 1;
  private static final int INTERESTING_NUMBER = 2;
  private static final int NEXT_ONE_MILE = 1;
  private static final int NEXT_TWO_MILE = 2;

  public static int isInteresting(int number, Integer [] awesomePhrases) {
    if(number < INTERESTING_NUMBER_RANGE)
      return NOT_INTERESTING_NUMBER_RANGE;
    else {
      if(checkIsInterestingNumber(number, awesomePhrases))
        return INTERESTING_NUMBER;
      else if(checkIsInterestingNumber(number + NEXT_ONE_MILE, awesomePhrases)) {
        return CLOSE_TO_NUMBER;
      }
      else if(checkIsInterestingNumber(number + NEXT_TWO_MILE, awesomePhrases)) {
        return CLOSE_TO_NUMBER;
      } else {
        return BORING_NUMBER;
      }
    }
  }

  private static boolean checkIsInterestingNumber(int number, Integer[] awesomePhrases) {
    if (digitFollowedByZeros(number))
      return true;
    if(digitIsSameNumber(number))
      return true;
    if(digitSequentialAndInc(number))
      return true;
    if(digitSequentialAndDesc(number))
      return true;
    if(digitIsPalindrome(number))
      return true;
    if(matchAwesomePhrases(number, awesomePhrases))
      return true;
    return false;
  }

//  public static Integer[] isInteresting(Integer[] array, Integer [] awesomePhrases) {
//    Integer [] recordArray = new Integer[array.length];
//    for(int index = 0; index<array.length;index++) {
//      recordArray[index] = isInteresting(array[index], awesomePhrases);
//    }
//    for (int index = 0; index<array.length - 1;index++){
//      if(recordArray[index] == 0) {
//        if(recordArray[index + 1] == 2 && array[index + 1] - array[index] < 3) {
//          recordArray[index] = 1;
//        } else if(index + 2 < array.length) {
//          if(recordArray[index + 2] == 2 && array[index + 2] - array[index] < 3) {
//            recordArray[index] = 1;
//          }
//        }
//      }
//    }
//    return recordArray;
//  }

  private static boolean matchAwesomePhrases(int number, Integer[] awesomePhrases) {
    if(awesomePhrases.length == 0)
      return false;
    else {
      for(Integer awesomePhrase: awesomePhrases) {
        if(awesomePhrase == number)
          return true;
      }
    }
    return false;
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