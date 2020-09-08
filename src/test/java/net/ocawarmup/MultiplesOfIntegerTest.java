package net.ocawarmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplesOfIntegerTest {

   @Test
   public void shouldSumOfAnyNumber() {
      int[][] numbers = new int[6][6];
      for (int x = 0; x < numbers.length; x++) {
         for (int y = 0; y < numbers.length; y++) {
            numbers[x][y] = y;
         }
      }

      MultiplesOfInteger multiplesOfInteger = new MultiplesOfInteger(numbers);
      multiplesOfInteger.setMultiple(3);

      assertEquals(18, multiplesOfInteger.getSumOfNumber());
   }
}