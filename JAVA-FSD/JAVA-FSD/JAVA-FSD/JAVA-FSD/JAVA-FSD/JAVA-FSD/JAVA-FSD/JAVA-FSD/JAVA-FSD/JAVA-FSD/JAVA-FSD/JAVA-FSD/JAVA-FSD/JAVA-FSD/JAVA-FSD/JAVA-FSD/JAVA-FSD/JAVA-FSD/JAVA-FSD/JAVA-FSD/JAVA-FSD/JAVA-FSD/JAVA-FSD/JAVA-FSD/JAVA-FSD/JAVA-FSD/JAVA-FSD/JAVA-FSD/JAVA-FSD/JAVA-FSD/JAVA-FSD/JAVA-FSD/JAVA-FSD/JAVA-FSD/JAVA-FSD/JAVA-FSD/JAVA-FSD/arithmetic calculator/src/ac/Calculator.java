package ac;

import java.util.Scanner;
public class Calculator {
   public static void main(String[] args) {
	   //Enter the two numbers as A1 and A2
      double A1;
      double A2;
      double answer;
      char op;
      Scanner reader = new Scanner(System.in);
      System.out.print("Enter two numbers: ");
      A1 = reader.nextDouble();
      A2 = reader.nextDouble();
      System.out.print("\nEnter an operator (+, -, *, /): ");
      op = reader.next().charAt(0);
      switch(op) {
         case '+': answer = A1 + A2;
            break;
         case '-': answer = A1 - A2;
            break;
         case '*': answer = A1 * A2;
            break;
         case '/': answer = A1 / A2;
            break;
      default: System.out.printf("Error! Enter correct operator");
         return;
      }
      System.out.print("\nThe result is given as follows:\n");
      System.out.printf(A1 + " " + op + " " + A2 + " = " + answer);
   }

}


