package day_calculator;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;

public class day {

  private Daycalcul daycalculator;

  @Before
  public void createDayCalculatorInstance() {
    this.daycalculator = new Daycalcul();
  }

  @After public void deleteDayCalculator(){
    this.daycalculator = null
  }

  @Test
  public void test_dayCalulatorInstance() {
    assertNull(this.dayCalculator);
  }

  @Test public void test_setDate(){
    this.dayCalculator.setDate(2022,5,13);

    assertEquals(expected: 2022, this.dayCalculator.getYear());
    assertEquals(expected: 5, this.dayCalculator.getMonth());
    assertEquals(expected: 13, this.dayCalculator.getDay());

    @Test public void test_setDate_20220514() {
      Daycalcul daycalculator = new DayCalcul();
      this.dayCalculator.setDate(year:2022, month: 5, day: 14);

      assertEquals(expected: 2022, this.dayCalculator.getYear());
      assertEquals(expected: 5, this.dayCalculator.getMonth());
      assertEquals(expected: 14, this.dayCalculator.getDay());
    }
  }
}
