/**
 This method used to find a users login credentials to see if their profile is within the system's memory
 if the user is not found the system; it will give an error message
 otherwise, the user will be found and the method will return their profile (which is only their name currently)
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login extends Exception{
    Map<String, String[]> userLogin = new HashMap<>();

    public Login(){
        {
            try {
                File myfile = new File("credential.txt");
                Scanner text = new Scanner(myfile);
                while (text.hasNextLine()) {
                    String[] string = text.nextLine().split("[\\s]");
                    String[] userPass = {string[2],string[0]};
                    userLogin.put(string[1], userPass);
                }
                text.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found!");
            }
        }
    }

    public void getLogin(){
        //Checking whats being read, currently， actual correspondent user real Name
        for(String name: userLogin.keySet()) {
            System.out.println(userLogin.get(name)[1]);
        }
    }

    public String matching(String username, String password){
        if(userLogin.containsKey(username)){
            if(userLogin.get(username)[0].equals(password)){
                return userLogin.get(username)[1];//further on return Profile class with name declaration
            }else {
                System.out.println("Incorrect Password!!!");
                return null;//further on return Profile class with empty declaration
            }
        }else{
            System.out.println("Incorrect Username!!!");
            return null;//further on return Profile class with empty declaration
        }
    }
}
