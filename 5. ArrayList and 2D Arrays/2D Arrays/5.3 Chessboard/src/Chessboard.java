public class Chessboard
{
   public static void main(String[] args)
   {
      char[][] chessboard = new char[8][8];

      for (int x = 0; x < chessboard.length; x++) {
         for (int y = 0; y < chessboard.length; y++) {
            if ((x + y) % 2 == 0) {
               System.out.print('\u25A1');
            } else {
               System.out.print('\u25A0');
            }
         }
         System.out.println();
      }
   }
}