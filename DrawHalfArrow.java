import java.util.Scanner; 

public class DrawHalfArrow {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int arrowBaseHeight = 0;
      int arrowBaseWidth  = 0;
      int arrowHeadWidth = 0;
      int i = 0;
      
      System.out.println("Enter arrow base height: ");
      arrowBaseHeight = scnr.nextInt();
      
      System.out.println("Enter arrow base width: ");
      arrowBaseWidth = scnr.nextInt();
      
      System.out.println("Enter arrow head width: ");
      arrowHeadWidth = scnr.nextInt();
      
      String asterisk = "";
      
      //arrowBase
      for (int x = 1; x <= arrowBaseHeight; x++) {
          asterisk += "*";
      }
      
      for (i = 1; i <= arrowBaseHeight; ++i) {
          System.out.println(asterisk);
      }
      
      //arrowHead
      int tempArrowHeadWidth = arrowHeadWidth;
      for (int y = 1; y <= arrowHeadWidth; y++) {
          for (int z = tempArrowHeadWidth; z > 0; z--) {
              System.out.print("*");
          }
          tempArrowHeadWidth -= 1;
          
          System.out.println();
      }
      
//      // Draw arrow base (height = 3, width = 2)
//      System.out.println("**");
//      System.out.println("**");
//      System.out.println("**");
//      
//      // Draw arrow head (width = 4)
//      System.out.println("****");
//      System.out.println("***");
//      System.out.println("**");
//      System.out.println("*");
//

   }
}