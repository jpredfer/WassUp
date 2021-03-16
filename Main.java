import java.util.Locale;
import java.util.Scanner;

public class Main {
    /**
     *
     *
     *
     * @command allows the user to choose to view chats or buddies
     * @userRealName calls the LoginPhase method and class to ensure that the username and password are valid entries
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userRealName = LoginPhase();
        String command;
        Profile userProfile = new Profile(userRealName);
        while(true){
            System.out.print("Enter command(Chat/Friend):");
            command = scan.next();
            if(command.equalsIgnoreCase("chat")){
                userProfile.DisplayChat();
                break;
            }else if(command.equalsIgnoreCase("friend")){
                userProfile.DisplayBuddy();
                break;
            }else{
                System.out.println("Invalid Command!!!");
            }
        }




    }

    public static String LoginPhase(){
        Login mylogin = new Login();
        String username;
        String password;
        String name = null;

        Scanner scan = new Scanner(System.in);

        while(name == null){
            System.out.print("Enter username:");
            username = scan.next();
            System.out.print("Enter password:");
            password = scan.next();
            name = mylogin.matching(username, password);
        }

        return  name;
    }


}


