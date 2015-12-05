
/**
 * Write a description of class j here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class j
{
   public static void main (String[] args) {
       int[][] arrayTwo= { {0, 2, 3}, {2, 3, 4}, {3, 2, 1} };
       
       for (int row = 0; row < arrayTwo.length; row++) {
            for (int col = 0; col < arrayTwo[row].length; col++) {
                System.out.print (arrayTwo[row][col] + " ");
            }
            System.out.println();
        }
   }
}
