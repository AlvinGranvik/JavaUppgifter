import java.time.LocalTime;

public class Time {
    public static void main(String[] args) {
        GetTime();
    }
    public static void GetTime() {
                // Ta reda på nuvarande tid
                LocalTime localTime = LocalTime.now();
        
                // Skriv ut ett litet meddelande + nuvarande tid
                System.out.println("Current time is: " + localTime);
    } 
}
