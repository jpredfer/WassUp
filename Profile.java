import java.util.Scanner;

public class Profile {

    public Profile(){

        //Declare-initialize variables
        String name;
        int choice;

        //Set name with hashmap values?

        //Greet user to profile page, personalize with their name.
        //System.out.println("Welcome " + name);
        //Print out program options to user and gather user's choice
        choice = printlist();
        //Take users choice and use the directUser method to direct user according to their input
        directUser(choice);

    }

    private int printlist(){
        System.out.println("Please choose from the following options:");
        System.out.println("1. Access Convos");
        System.out.println("2. Access Buddy List");
        System.out.println("3. Change Settings");
        System.out.println("4. Logout");
        System.out.println("Choice: ");

        //Create Scanner object to hold user input
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        return choice;
    }

    private void directUser(int choice){
        //Use switch system to direct user.
        switch (choice) {
            case 1:
                //Send user to accessConvo method
                accessConvo();
                break;
            case 2:
                //Send user to accessBuddies method
                accessBuddies();
                break;
            case 3:
                //Send user to the changeSettings method
                changeSettings();
                break;
            case 4:
                //Send user to logout method
                logout();
                break;
            default:
                System.out.println("Wrong input.");
        }
    }

    protected void changeSettings(){
        //Discuss what settings group wants user to be able to change.
    }

    public void accessBuddies(){
        //Send user to the Buddies class
    }

    public void accessConvo(){
        //Send user to the Convo class
    }

    public void logout(){
        //End program
        System.exit(0);
    }

}

