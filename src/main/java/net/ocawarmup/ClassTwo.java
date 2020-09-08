package net.ocawarmup;

public class ClassTwo {
   private int totalScore;
   private int mathsScore;
   private int englishScore;

   public ClassTwo(int mathsScore, int englishScore) {
      this.mathsScore = mathsScore;
      this.englishScore = englishScore;
   }

   public int getTotalScore() {
      totalScore = (mathsScore + englishScore) / 2 ;

      return totalScore;
   }

}
