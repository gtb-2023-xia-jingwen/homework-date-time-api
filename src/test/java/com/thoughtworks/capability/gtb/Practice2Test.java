package com.thoughtworks.capability.gtb;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;

/**
 * @author itutry
 * @create 2020-05-15_17:23
 */
class Practice2Test {

  @Test
  void test_getNextWorkDate() {
    LocalDate workDate1 = Practice2.getNextWorkDate(LocalDate.of(2020, 5, 14));
    assertEquals("2020-05-15", workDate1.toString());

    LocalDate workDate2 = Practice2.getNextWorkDate(LocalDate.of(2020, 5, 15));
    assertEquals("2020-05-18", workDate2.toString());
  }
}
