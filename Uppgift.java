import java.util.*;

public class Uppgift {
    public static void main(String[] args) {
        int[] array = new int[1000];
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        //Begär input från användare
        System.out.println("Enter as many numbers as you want, CTRL+Z to exit.");
        while (scanner.hasNextLine()) {
            int num;
            try {
                num = Integer.parseInt(scanner.nextLine());
                //Säkerställ att användare skriver in siffror
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please enter a valid integer.");
                continue;
            }

            //Kolla ifall nummeret är större än maxvärdet för integers. Om detta stämmer, visa ett error meddelande.
            if (num > Integer.MAX_VALUE) {
                System.err.println("Value is too large, input a lower number.");
                continue;
            }

            boolean found = false;
            for (int i = 0; i < count; i++) {
                if (array[i] == num) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                array[count] = num;
                count++;
            }
        }
        //Visa unika siffror i terminalen
        System.out.println("Unique numbers entered:");
        for (int i = 0; i < count; i++) {
            System.out.println(array[i]);
        }
        scanner.close();
    }
}