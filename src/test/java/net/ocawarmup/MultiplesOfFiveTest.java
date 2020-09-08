package net.ocawarmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplesOfFiveTest {
   @Test
   public void shouldReturnSumOfMultiplesOfFive() {
      int[][] numbers = new int[6][6];
      for (int x = 0; x < numbers.length; x++) {
         for (int y = 0; y < numbers.length; y++) {
            numbers[x][y] = y;
         }
      }

      SumOfMultiplesOfFive sumOfMultiplesOfFive = new SumOfMultiplesOfFive(numbers);

      assertEquals(25, sumOfMultiplesOfFive.getSumOfMultiplesOfFive());
   }


}