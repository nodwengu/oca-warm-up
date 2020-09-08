package net.ocawarmup;

public class MultiplesOfInteger {
   private int[][] numbers;
   private int multiple;

   public MultiplesOfInteger(int[][] numbers) {
      this.numbers = numbers;
   }

   public void setMultiple(int multiple) {
      this.multiple = multiple;
   }

   public int getSumOfNumber() {
      int sum = 0;

      for (int x = 0; x < numbers.length; x++) {
         for (int y = 0; y < numbers.length; y++) {
            if (numbers[x][y] % multiple == 0)
               sum += numbers[x][y];
            //System.out.print(numbers[x][y]);
         }
         //System.out.println();
      }

      //System.out.println(sum);
      return sum;
   }
}
