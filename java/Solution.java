/* 
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.

    Note: If the number is a multiple of both 3 and 5, only count it once. Also, if a number is negative, return 0(for languages that do have them)
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {

  public int solution(int number) {
    if (number < 0) {
      return 0;
    }
    
    Set<Integer> multiplesOfThreeOrFive = new HashSet();
    
    for(int i=1;i<number;i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        multiplesOfThreeOrFive.add(i);
      }
    }
    
    Iterator<Integer> itr = multiplesOfThreeOrFive.iterator();
    int sumOfMultiplesOfThreeOrFive = 0;
    
    while (itr.hasNext()) {
      sumOfMultiplesOfThreeOrFive += itr.next();
    }
    
    
    return sumOfMultiplesOfThreeOrFive;
  }
}

/* 
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
      assertEquals(23, new Solution().solution(10));
      assertEquals(45, new Solution().solution(15));
      assertEquals(0, new Solution().solution(-15));
      assertEquals(0, new Solution().solution(2));
      assertEquals(0, new Solution().solution(3));
      assertEquals(3, new Solution().solution(4));
      assertEquals(0, new Solution().solution(0));
    }
    
}
*/