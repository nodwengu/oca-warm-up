package net.ocawarmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ClassOneTest {
   @Test
   public void shouldGetTotalScore() {
      ClassOne classOne = new ClassOne();
      classOne.setEnglishGrade(50);
      classOne.setMathsGrade(50);

      assertEquals(50, classOne.getTotalScore());
   }

   @Test
   public void shouldUseIntefaceToGetTotalScore() {
      SetValuesInterface setVal = new ClassOne();
      setVal.setEnglishGrade(50);
      setVal.setMathsGrade(50);

      CalcValues calcVal = (CalcValues)setVal;
      assertEquals(50, calcVal.getTotalScore());
   }


   @Test
   public void shouldReplaceMultiplesOf3And5() {
      ClassOne classOne = new ClassOne();
      int[] numbers = new int[10];

      for (int x = 1; x < numbers.length; x++)
         numbers[x] = x * 2;

      assertEquals(4, classOne.replaceMultiplesOf3And5(numbers)[2]);
      assertEquals(0, classOne.replaceMultiplesOf3And5(numbers)[3]);
   }

   @Test
   public void shouldReplaceMultiplesOf3And5TwoDArray() {
      ClassOne classOne = new ClassOne();

      int[][] numbersArr = new int[10][10];

      for (int x = 1; x < numbersArr.length; x++) {
         for (int y = 1; y < numbersArr.length; y++) {
            numbersArr[x][y] = y * 2;

            if (numbersArr[x][y] % 3 == 0 || numbersArr[x][y] % 5 == 0)
               numbersArr[x][y] = 0;
         }
      }
      classOne.replaceMultiplesOf3And5TwoDArray(numbersArr);
      assertEquals(8, classOne.replaceMultiplesOf3And5TwoDArray(numbersArr)[4][4]);
      assertEquals(0, classOne.replaceMultiplesOf3And5TwoDArray(numbersArr)[5][5]);

   }
}