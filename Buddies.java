import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Buddies {

    public Buddies() throws FileNotFoundException {

        /** This method is meant to ask the user if they wish to add
         * a buddy to their buddy list.
         *
         * @BuddyID is the ID the user will input to add their friend -- username of friend??
         */


        File Buddies = new File("Buddies.txt");
        Scanner input = new Scanner(System.in);
        Character choice;
        String BuddyID;
        
        System.out.println("Add Buddy?");
            choice = input.next().charAt(0);


        if(choice == 'y' || choice == 'Y'){
            System.out.println("Enter Buddy ID: ");
            BuddyID = input.nextLine();

            if (BuddyID != ValidEntry)
                //Validate if the buddy is available to be added.
                //If not valid will ask user to re input the ID
                System.out.println("Please input a valid Buddy ID: ");

            //if buddy is available to add, it will to the Buddies.txt file for that user
            //After the buddy is added it will print the current list of buddies to the user


            else if (BuddyID == ValidEntry){
                String Friend = null;

                FileWriter fwriter = new FileWriter("Buddies.txt", true);
                PrintWriter outputFile = new PrintWriter("Buddies.txt");
                outputFile.println(BuddyID);
                outputFile.close();



                System.out.println("Here are your buddies!");

                Scanner readF = new Scanner(Buddies);

                while (readF.hasNext())
                Friend = readF.nextLine();
                System.out.println(Friend);
                readF.close();
            }

        }

        //If they do not want to add a new buddy then it will display their current buddies
        if(choice == 'n' || choice == 'N') {
            //Print Buddie.txt


        }

    }
}
