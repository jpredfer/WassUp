import java.io.*;
import java.util.Scanner;

/**The purpose of this class is to let the user search, add and delete their buddies.
 * This class will also need to be able to send the user to the convo and/or profile class.
 */

public class Buddies {


    public Buddies() throws IOException {

        File Buddies = new File("buddies.txt");

        startup();


    }

    protected void startup() throws IOException {
        //Use this method to present the buddy start up list to the user.
        int actionChoice;

        //Print out the users buddy list as well as the list of options the user can do.

        //Print out buddies list
        printBuddies();

        //Print out action list
        actionChoice = buddiesActionList();

        //Direct user based on input
        directUser(actionChoice);
    }

    private void printBuddies() {
        System.out.println("Buddies List:");
        System.out.println("Buddy");//Somehow print user buddies
        System.out.println("Buddy");
        System.out.println("Buddy");
        System.out.println(""); //empty line to add space between buddies list and action list.
        System.out.println(""); //empty line to add space between buddies list and action list.

        //To Axel:
        //I left this commented out so you could put it in this method. I took it from your original code
        /**
         * System.out.println("Here are your buddies!");
         *
         *Scanner readF = new Scanner(Buddies);
         *
         *while (readF.hasNext())
         *  Friend = readF.nextLine();
         *  System.out.println(Friend);
         *  readF.close();
         */
    }

    private int buddiesActionList() {

        /**
         * Needs finished.
         */

        System.out.println("Please choose from the following options:");
        System.out.println("1. Add/Search for a Buddy");
        System.out.println("2. Delete Buddy");
        System.out.println("3. Go to Convo's");
        System.out.println("4. Return to Profile");
        System.out.println("Choice: ");

        //Create Scanner object to hold user input
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        return choice;
    }

    private void directUser(int choice) throws IOException {

        /**
         * Needs finished.
         */

        //Use switch system to direct user.
        switch (choice) {
            case 1:
                //Send user to addSearchBuddy method
                searchBuddy();
                break;
            case 2:
                //Send user to deleteBuddy method
                deleteBuddy();
                break;
            case 3:
                //Send user to Convo class
                //
                break;
            case 4:
                //Send user to Profile Class
                //
                break;
            default:
                System.out.println("Wrong input.");
        }
    }

    protected  boolean validEntry(String entry){

        /**Needs finished..
         * Not sure yet how to test correctly.
         */

        //if entry exist
            //return true
        //else
            //System.out.println("Buddy not found");
            return false;
    }

    /** This method  has the user enter a name to search if the user exits.
     *  This method will use the name entered by the user and send it to the
     *  validEntry method, which returns a boolean expression.
     *  If the validEntry method returns true then the searchBuddy method will
     *  ask the user if it would like to add the buddy. If yes then the method will send the user to the addBuddy method.
     *  If the validEntry returns false then the searchBuddy method will send the user to startup method.
     *  If input is invalid the searchBuddy method will restart the searchBuddy method.
     * @name is the buddy name the user entered when searching for a buddy.
     */
    protected void searchBuddy() throws IOException {

        //Prompt user for name of the buddy wished to search for.
        System.out.println("Please enter the name of your buddy: ");
        //Create Scanner object to hold user input.
        Scanner name = new Scanner(System.in);
        //Set scanner object as a string equal to String nameSearch variable.
         String nameSearch  = name.nextLine();

        //Test is buddy name exists.
         if (validEntry(nameSearch)) {
             // Let user know the buddy has been found and prompt if user would like to add buddy.
             System.out.println("Buddy found!");
             System.out.println("Would you like to add this buddy?");
             System.out.println("Enter a 1 for 'Yes' or a 2 for 'No'");
             //Create Scanner object to hold user input.
             Scanner input = new Scanner(System.in);
             //Set scanner object as a integer equal to integer choice variable.
             int choice  = input.nextInt();

            //Test user input for new pathways.
             if(choice == 1) {
                 //Send user to the addBuddy method, passing the nameSearch variable.
                 addBuddy(nameSearch);
             } else if (choice == 2){
                 //Send user to buddy startup method.
                 System.out.println("Okay! Buddy not added!");
                 startup();
             } else {
                 //Have user restart the searchBuddy method.
                 System.out.println("Wrong input.");
                 searchBuddy();
             }

         }


    }

    /** This method adds a buddy to the users buddy list.
     *
     * @name is the buddy name the user entered when searching for a buddy.
     */
    protected void addBuddy(String name) throws IOException {
        String buddyName = name;

        /**
         * Needs finished.
         */

        //To Axel:
        //The code below is the code you used to add buddy to file. I think it should still work within this method.
        FileWriter fwriter = new FileWriter("Buddies.txt", true);
        PrintWriter outputFile = new PrintWriter("Buddies.txt");
        outputFile.println(buddyName);
        outputFile.close();

    }

    /** This method deletes a buddy to the users buddy list.
     *
     * @name is the buddy name the user entered when searching for a buddy.
     */
    protected void deleteBuddy(){
        String nameSearch;

        /**
         * Needs finished.
         */

        System.out.println("Please enter the name of your buddy you would like to delete: ");
        //Create Scanner object to hold user input
        Scanner name = new Scanner(System.in);
        nameSearch  = name.nextLine();

        //Test if in users buddies list currently
        //if (in users buddies list currently )[
            //Delete buddy
            //
            //
            //
        // } else {
        // tell user that the buddy is already not a part of their buddies list?
        // }

    }

}
