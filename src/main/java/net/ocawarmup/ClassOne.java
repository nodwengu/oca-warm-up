package net.ocawarmup;

public class ClassOne implements SetValuesInterface, CalcValues {
   private int totalScore;
   private int mathsScore;
   private int englishScore;

   public void setMathsGrade(int score) {
      mathsScore = score;
   }

   public void setEnglishGrade(int score) {
      englishScore = score;
   }

   public int getTotalScore() {
      totalScore = (mathsScore + englishScore) / 2 ;

      return totalScore;
   }


   public int[] replaceMultiplesOf3And5(int[] numbers) {
      for (int x = 0; x < numbers.length; x++) {
         if (numbers[x] % 3 == 0 || numbers[x] % 5 == 0)
            numbers[x] = 0;
         //System.out.println(numbers[x]);
      }
      return numbers;
   }

   public int[][] replaceMultiplesOf3And5TwoDArray(int[][] numbersArr) {
      for (int x = 0; x < numbersArr.length; x++) {
         for (int y = 0; y < numbersArr.length; y++) {
            numbersArr[x][y] = y * 2;

            if (numbersArr[x][y] % 3 == 0 || numbersArr[x][y] % 5 == 0)
               numbersArr[x][y] = 0;

            //System.out.print(numbersArr[x][y] + " ");
         }
         //System.out.println();
      }


      return numbersArr;
   }

}
