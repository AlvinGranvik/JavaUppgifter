import java.io.IOException;
import java.util.*;
//VIKTIG VARNING: Om du runnar detta program så finns det en 1/6 chans att den stänger av din dator.


//Metod som gör en russian roulette, fortfarande icke definierat vilka nummer gör vad.
public class Roulette {
    public static int russianroulette() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public static void main(String[] args) {
        int result = russianroulette(); //Resultatet av det slumpmässiga talet sparas i en int
        Scanner scanner = new Scanner(System.in); //Scanner definieras
        
        System.out.println("Press ENTER to roll, there is a 1/6 chance for a fire."); //Russian roulette börjar
        scanner.nextLine(); //Väntar på spelare att trycka på enter

        if (result == 1) { //If sats där om resultatet är 1, så stängs datorn ner. Annars händer ingenting.
            System.out.println("womp womp");
            try { //Try & catch sats där programmet försöker stänga av ens dator
                Process process = Runtime.getRuntime().exec("shutdown -s -t 0"); //Stänger av datorn
                process.waitFor();
                System.out.println("Shutting down computer");
            } catch (IOException | InterruptedException e) { //Catch sats där om processen avbryts så printas ett error.
                e.printStackTrace();
                System.err.println("Computer didn't shut down idk why");
            }
        } else { //Else sats som egentligen inte gör så mycket alls
            System.out.println("wow let's go very nice"); //Printar helt enkelt detta om man får ett värde som inte är 1
        }
        scanner.close(); //Scanner stängs för att undvika en resource leak
    }
}
