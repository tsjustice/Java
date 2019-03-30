import java.util.Scanner;

/**
  *Convert hexadecimal to decimal.
  *@author Shane Justice
  *@version 03/24/2019
  */ 
public class HexToDecimal {

   /**
     *@param args the args.
     */

   public static void main(String[] args) {

        /**
          *
          *
          */

      System.out.print("Enter 4 Digit Hexadecimal:");

      // create scanner to get user input

      Scanner s = new Scanner(System.in); 
      //Take user input as a string
      String inputH = s.nextLine();
      //Convert string to hex
      Integer decimal = Integer.parseInt(inputH, 16);

      System.out.println("Output: " + decimal);


   }
}