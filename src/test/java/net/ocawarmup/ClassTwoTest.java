package net.ocawarmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassTwoTest {

   @Test
   public void shouldGetTotalScore() {
      ClassTwo classTwo = new ClassTwo(50, 50);

      assertEquals(50, classTwo.getTotalScore());
   }
}