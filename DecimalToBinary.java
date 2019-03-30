/**   
  * Decimal to binary conversion without.
  * using arithmetic operators. 
  *@author Shane Justice
  *@version 03/24/2019
  */
import java.util.Scanner;
  /**
    *
    *
    */
class DecimalToBinary { 
      
    /**
      *Method to convert from decimal to binary.
      *@param n for user inputed binary number.
      *@return bin for binary number.
      */
   static String decToBin(long n) { 
      if (n == 0) {
         return "0";
      } 
      
      // to store the binary string
         
      String binary = "";  
          
      while (n > 0)  { 

         binary = ((n & 1) == 0 ? '0' : '1') + binary; 
              
         n >>= 1; 
      } 
          
      return binary; 
   } 
  
   /**
     *@param args the args.
     */ 
   public static void main(String[] args) { 
      //Use a long to prevent loss of digits
      Scanner s = new Scanner(System.in);
      System.out.print("Enter any decimal number between 0 and 4294967295: ");
      long n = s.nextLong();
      //Prints out the string created by method.
      System.out.println(decToBin(n)); 
   } 
}  