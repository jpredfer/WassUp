import java.util.Scanner;

public class MessageMenu
{
    public static void main(String[] args) {

        int userChoice;
        Scanner input = new Scanner(System.in);
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please choose from the following options: ");
        System.out.println("------------------------------------------");
        System.out.println("1. Past Messages");
        System.out.println("2. New Message");
        System.out.println("3. Archive Message");
        System.out.println("4. Delete Message");
        System.out.println("5. Go to Buddy List");
        System.out.println("6. Return to Profile");

        userChoice = input.nextInt();
        
        
    }

    
}