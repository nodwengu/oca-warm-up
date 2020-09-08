package net.ocawarmup;

public class SumOfMultiplesOfFive {
   private int[][] arrayList;

   public SumOfMultiplesOfFive(int[][] arrayList) {
      this.arrayList = arrayList;
   }

   public int getSumOfMultiplesOfFive() {
      int sumOfMultiples = 0;
      for (int x = 1; x < arrayList.length; x++) {
         for (int y = 1; y < arrayList.length; y++) {
            if (arrayList[x][y] % 5 == 0) {
               sumOfMultiples += arrayList[x][y];
            }
         }
      }

      return sumOfMultiples;
   }

}
