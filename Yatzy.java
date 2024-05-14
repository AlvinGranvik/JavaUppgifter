import java.util.*;

public class Yatzy {
    //Tärningen deklareras och använder sig av util.random för att slumpmässigt generera en siffra i intervallet 1 till 6
    public static int rollDice() {
        Random random = new Random();
        return random.nextInt(6) + 1; //det blir +1 eftersom att int värden börjar på 0   
    }

    //Main metoden i filen, här är vart spelet sker
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner deklareras, tar emot terminal input
        System.out.println("How many players?");
        
        //Kollar hur många spelare som finns och ger alla spelare egna poäng
        int number_of_players = Integer.parseInt(scanner.nextLine());
        String[] players = new String[number_of_players];
        int[] scores = new int[number_of_players];

        //For loop där varje spelares start poäng sätts till 30
        for (int i = 0; i < number_of_players; i++) {
            scores[i] = 30;
        }

        //For loop där varje spelare får skriva in deras namn i terminalen
        for (int i = 0; i < players.length; i++) { //Loopa tills alla spelare har skrivit in deras namn
            System.out.printf("Please enter your name player %d:\n", i + 1);
            String playerName = scanner.nextLine(); //Tar emot input från terminalen och deklarerar den som string PlayerName
            players[i] = playerName; //String playerName blir players[i], och därmed får spelaren sitt namn
        }

        //Arraylista som visar alla tärningsslag
        List<Integer> rollResults = new ArrayList<Integer>(6);
        
        //For loop som tilldelar varje spelar en varsin tur där de får slå sina tärningar
        for (int i = 0; i < players.length; i++) { //Loopa tills varje spelare har haft sin tur
            System.out.println("It's " + players[i] + "'s turn.");
            System.out.println("Press ENTER to roll the dice.");
            scanner.nextLine(); // Vänta tills spelaren trycker på enter
            System.out.println("To keep a dice, type what roll you got it on. When you press ENTER, all of the remaining ones will be discarded.");
            
            //For loop där tärningar slås 6 gånger
            for (int b = 0; b < 6; b++) { // Loopa 6 gånger
                int rollResult = rollDice(); // Denna funktion rullar tärningen
                rollResults.add(rollResult); //Kopplar ihop arraylista med rullade siffran
                System.out.println("You rolled a: " + rollResult + " on roll number " + (b+1));
            }
            
            //Detta hade varit en for loop där spelare väljer ut vilka tärningar som ska behållas, men jag blev aldrig färdig med den
            /*for (int j = 0; j < 1; j++) {
                int isKept = scanner.nextInt();
                if (rollResults.contains(isKept)) {
                    
                }*/
            }
        scanner.close(); //Scanner stängs för att förhindra en resource leak
        }
    }


    

