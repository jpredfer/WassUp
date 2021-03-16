import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Profile {
    Map<String, String> chat = new HashMap<>();
    ArrayList<String> friend = new ArrayList<>();

    public Profile(String name){
        {
            System.out.println("Hello " + name);
            try {
                File myfile = new File(name + ".txt");
                Scanner text = new Scanner(myfile);
                String[] context = text.nextLine().split("[\\s]");
                if(context.length == 1){
                    System.out.println("You have 0 live chat.");
                }else {
                    for (int i = 1; i <= context.length - 2; i += 2) {
                        chat.put(context[i], context[i + 1]);
                    }
                    System.out.println("You have " + chat.size() + " live chat.");
                }
                context = text.nextLine().split("[\\s]");
                for (int j = 1; j < context.length ; j++) {
                    friend.add(context[j]);
                }
                text.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found!");
            }
        }
    }

    public void DisplayChat(){
        if(chat.isEmpty()){
            System.out.println("No chat found.");
        }else {
            System.out.println("You have chat with: ");
            for(String name: chat.keySet()) {
                System.out.println(name);
            }


        }
    }

    public void DisplayFriend(){
        if(friend.isEmpty()){
            System.out.println("No Friend found.");
        }else {
            for(String name: friend) {
                System.out.println(name);
            }
        }
    }

}
