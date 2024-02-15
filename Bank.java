import javax.swing.*;
import java.util.Scanner;
public class Bank {
    //övriga metoder
    public static void main(String[] args) {
          // Create a Scanner object to read input from the user
          Scanner scanner = new Scanner(System.in);

          // Prompt the user to enter an integer
          System.out.print("Enter an integer: ");
  
          // Check if the next input is an integer
          if (scanner.hasNextInt()) {
              // If it is an integer, read and store it
              int userInput = scanner.nextInt();
              System.out.println("You entered: " + userInput);
          } else {
              // If the input is not an integer, display an error message
              System.out.println("Invalid input. Please enter an integer.");
          }
  
          // Close the Scanner to release resources (optional but recommended)
          scanner.close();

          int n = scanner.nextInt();
      }
  

    public static double beloppVidUttag
                    (double b, double r, int n, double ut) {
        if (ut > b*0.01*r) { //Är uttaget större än räntan?
            JOptionPane.showMessageDialog(null,
                                                            "För stort uttag");
            return 0;
        }
    else {
        for (int i=1; i <= n; i++){
            b = b + b*0.01*r - ut;

            System.out.println("År: " + i + " | " + "Belopp: " + b);
        } //ett varv per år
        return b;
        }
    }
}