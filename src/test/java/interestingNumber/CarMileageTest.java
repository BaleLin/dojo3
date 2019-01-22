package interestingNumber;

import org.junit.Assert;
import org.junit.Test;

public class CarMileageTest {

  @Test
  public void shoule_return_0_when_check_interesting_number_given_invalid_number_0() {
    int inputNumber = 0;
    int expectedResult = 0;
    int actualResult = CarMileage.isInteresting(0, new Integer[]{});
    Assert.assertEquals(expectedResult, actualResult);
  }

  @Test
  public void should_return_0_when_check_interesting_number_given_number_1_not_in_the_range_of_interesting() {
    int inputNumber = 1;
    int expectedResult = 0;
    int actualResult = CarMileage.isInteresting(inputNumber, new Integer[]{});
    Assert.assertEquals(expectedResult, actualResult);
  }

  @Test
  public void should_return_0_when_check_interesting_number_given_number_digit_followed_by_all_zeros_100() {
    int inputNumber = 100;
    int expectedResult = 2;
    int actualResult = CarMileage.isInteresting(inputNumber, new Integer[]{});
    Assert.assertEquals(expectedResult, actualResult);
  }

  @Test
  public void should_return_0_when_check_interesting_number_given_number_digit_is_the_same_number_111() {
    int inputNumber = 111;
    int expectedResult = 2;
    int actualResult = CarMileage.isInteresting(inputNumber, new Integer[]{});
    Assert.assertEquals(expectedResult, actualResult);
  }

  @Test
  public void should_return_0_when_check_interesting_number_given_number_digits_are_sequential_and_increment_123() {
    int inputNumber = 123;
    int expectedResult = 2;
    int actualResult = CarMileage.isInteresting(inputNumber, new Integer[]{});
    Assert.assertEquals(expectedResult, actualResult);
  }
  @Test
  public void should_return_0_when_check_interesting_number_given_number_digits_are_sequential_and_incement_890() {
    int inputNumber = 890;
    int expectedResult = 2;
    int actualResult = CarMileage.isInteresting(inputNumber, new Integer[]{});
    Assert.assertEquals(expectedResult, actualResult);
  }

  @Test
  public void should_return_0_when_check_interesting_number_given_number_digits_are_sequential_and_decrement_321() {
    int inputNumber = 321;
    int expectedResult = 2;
    int actualResult = CarMileage.isInteresting(inputNumber, new Integer[]{});
    Assert.assertEquals(expectedResult, actualResult);
  }
  @Test
  public void should_return_0_when_check_interesting_number_given_number_digits_are_a_palindrome_121() {
    int inputNumber = 121;
    int expectedResult = 2;
    int actualResult = CarMileage.isInteresting(inputNumber, new Integer[]{});
    Assert.assertEquals(expectedResult, actualResult);
  }

  @Test
  public void should_return_0_when_check_interesting_number_given_number_digits_124_not_match_awesomePhrases() {
    int inputNumber = 124;
    int expectedResult = 0;
    int actualResult = CarMileage.isInteresting(inputNumber, new Integer[]{});
    Assert.assertEquals(expectedResult, actualResult);
  }

  @Test
  public void should_return_0_when_check_interesting_number_given_number_digits_124_match_one_element_of_awesomePhrases() {
    int inputNumber = 124;
    int expectedResult = 2;
    int actualResult = CarMileage.isInteresting(inputNumber, new Integer[]{124, 245});
    Assert.assertEquals(expectedResult, actualResult);
  }

  @Test
  public void should_return_0_when_check_interesting_number_given_number_array_match_one_element_of_awesomePhrases() {
    Integer[] expectedResult = new Integer[]{0, 1, 2};
    Integer[] actualResult = CarMileage.isInteresting(new Integer[]{108, 110, 111}, new Integer[]{124, 245});
    Assert.assertEquals(expectedResult, actualResult);
  }

}