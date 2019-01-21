package interestingNumber;

import org.junit.Assert;
import org.junit.Test;

public class CarMileageTest {

  @Test
  public void shoule_return_0_when_check_interesting_number_given_invalid_number_0() {
    int inputNumber = 0;
    int expectedResult = 0;
    int actualResult = CarMileage.isInteresting(0);
    Assert.assertEquals(expectedResult, actualResult);
  }

  @Test
  public void should_return_0_when_check_interesting_number_given_number_1_not_in_the_range_of_interesting() {
    int inputNumber = 1;
    int expectedResult = 0;
    int actualResult = CarMileage.isInteresting(inputNumber);
    Assert.assertEquals(expectedResult, actualResult);
  }

  @Test
  public void should_return_0_when_check_interesting_number_given_number_digit_followed_by_all_zeros_100() {
    int inputNumber = 100;
    int expectedResult = 2;
    int actualResult = CarMileage.isInteresting(inputNumber);
    Assert.assertEquals(expectedResult, actualResult);
  }

  @Test
  public void should_return_0_when_check_interesting_number_given_number_digit_is_the_same_number_111() {
    int inputNumber = 111;
    int expectedResult = 2;
    int actualResult = CarMileage.isInteresting(inputNumber);
    Assert.assertEquals(expectedResult, actualResult);
  }

  @Test
  public void should_return_0_when_check_interesting_number_given_number_digits_are_sequential_and_increment_123() {
    int inputNumber = 123;
    int expectedResult = 2;
    int actualResult = CarMileage.isInteresting(inputNumber);
    Assert.assertEquals(expectedResult, actualResult);
  }
  @Test
  public void should_return_0_when_check_interesting_number_given_number_digits_are_sequential_and_incement_890() {
    int inputNumber = 890;
    int expectedResult = 2;
    int actualResult = CarMileage.isInteresting(inputNumber);
    Assert.assertEquals(expectedResult, actualResult);
  }

  @Test
  public void should_return_0_when_check_interesting_number_given_number_digits_are_sequential_and_decrement_321() {
    int inputNumber = 321;
    int expectedResult = 2;
    int actualResult = CarMileage.isInteresting(inputNumber);
    Assert.assertEquals(expectedResult, actualResult);
  }

}