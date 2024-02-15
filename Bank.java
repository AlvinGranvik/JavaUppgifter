import javax.swing.*;

public class Bank {
    public static void main(String[] args) {
        // Prompt the user for input values
        double initialAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter initial amount:"));
        double interestRate = Double.parseDouble(JOptionPane.showInputDialog("Enter interest rate (as a decimal):"));
        int numberOfYears = Integer.parseInt(JOptionPane.showInputDialog("Enter number of years:"));
        double withdrawalAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter withdrawal amount:"));

        // Call the method with user-defined values
        beloppVidUttag(initialAmount, interestRate, numberOfYears, withdrawalAmount);
    }

    public static double beloppVidUttag(double b, double r, int n, double ut) {
        if (ut > b * 0.01 * r) {
            JOptionPane.showMessageDialog(null, "För stort uttag");
            return 0;
        } else {
            for (int i = 1; i <= n; i++) {
                b = b + b * 0.01 * r - ut;
                System.out.println("År: " + i + " | " + "Belopp: " + b);
            }
            return b;
        }
    }
}
