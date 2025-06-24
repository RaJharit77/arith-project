package com.arith.demo.unit;

import static org.junit.Assert.assertEquals;

import com.company.demo.endpoint.rest.controller.AdditionController;
import org.junit.Test;

public class AdditionTest {
  AdditionController addition = new AdditionController();

  @Test
  public void addition_test() {
    assertEquals(3, addition.addition(1, 2));
  }

  @Test
  public void addition_test_no_overflow() {
    assertEquals(3_000_000_000L, addition.addition(1_000_000_000, 2_000_000_000));
  }
}
