package com.braco96.algoritmosestructuras._04_stack_min;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.braco96.algoritmosestructuras._04_stack_min.StackMin;

public class StackMinTest {

  @Test
  public void stackMinTest() {
    StackMin stackMin = new StackMin();

    stackMin.push(3);
    stackMin.push(1);
    stackMin.push(2);

    assertEquals(1, stackMin.min());
    stackMin.pop();
    assertEquals(1, stackMin.min());
    stackMin.pop();
    assertEquals(3, stackMin.min());
    stackMin.push(0);
    assertEquals(0, stackMin.min());
  }
}
