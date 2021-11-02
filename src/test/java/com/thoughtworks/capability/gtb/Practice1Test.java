package com.thoughtworks.capability.gtb;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;

/**
 * @author itutry
 * @create 2020-05-15_16:43
 */
class Practice1Test {

  @Test
  void getDays_should_return_right_when_date_before_labor_day() {
    final LocalDate date = LocalDate.of(2020, 4, 30);
    assertEquals(1, Practice1.getDaysBetweenNextLaborDay(date));
  }

  @Test
  void getDays_should_return_right_when_date_after_labor_day() {
    final LocalDate date = LocalDate.of(2020, 6, 1);
    assertEquals(334, Practice1.getDaysBetweenNextLaborDay(date));
  }
}
