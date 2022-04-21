import java.util.Scanner;
import java.util.*;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    List<Integer> numList = new ArrayList<Integer>();
    int maxValue = 0;
    int maxCount = 0;
    Scanner in = new Scanner(System.in);
    System.out.print("");
    int size = in.nextInt();
    for (int i = 0; i < size; i++){
      System.out.print("");
      int element = in.nextInt();
      numList.add(element);
    }
    for (int i = 0; i < size; i++){
      int count = 0;
      for (int x = 0; x < size; x++){
        if (numList.get(x) == numList.get(i)){
          ++count;
        }
      }
      if (count > maxCount) {
        maxCount = count;
        maxValue = numList.get(i);
      }
    }
    System.out.println(maxValue);
  }
}
