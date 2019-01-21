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
}