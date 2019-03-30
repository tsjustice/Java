import java.util.Scanner;

/**
  *@author Shane Justice
  *@version 03/24/2019
  *
  */
class BinaryToDecimal {

   /**
     *
     *Main method
     */
   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a 16 bit binary number: ");
      //Take user input as string
      String binaryString = input.nextLine();
      //Convert to decimal using parseInt
      System.out.println("Output: " + Integer.parseInt(binaryString, 2));
   }
}