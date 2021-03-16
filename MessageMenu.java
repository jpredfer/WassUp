import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.IOException; 
import java.io.FileReader;

public class MessageMenu
{
    public static void main(String[] args) throws IOException {

        int userChoice;
        Scanner input = new Scanner(System.in);
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please choose from the following options: ");
        System.out.println("------------------------------------------");
        System.out.println("1. View Messages");
        System.out.println("2. New Message");
        System.out.println("3. Archive Message");
        System.out.println("4. Delete Message");
        System.out.println("5. Go to Buddy List");
        System.out.println("6. Return to Profile");

        userChoice = input.nextInt();
        
        switch(userChoice) {
            case 1:
                viewMessages();
            case 2:

        }
    }

    public static void viewMessages() throws IOException {
        HashMap<String, String> messages = new HashMap<String, String>();
            String line;
            BufferedReader messageReader = new BufferedReader(new FileReader("messages.txt"));
            try {
                while ((line = messageReader.readLine()) != null ) {
                    String[] records = line.split(":", 2);
                    if (records.length >= 2) {
                        String messageID = records[0];
                        String messageContent = records[1];
                        messages.put(messageID, messageContent);
                    } else {
                        System.out.println("ignoring line: " + line);
                    }
                }
                for (String key : messages.keySet())
                {
                    System.out.println(key + ":" + messages.get(key));
                }
                messageReader.close();
            } catch (IOException e) {
                System.out.println("IO Exception");
            }
    }
}