import java.util.Scanner;

public class App {
    
    /**
     * This method is the primary driver method for your program.
     * It should primarily call other methods to do its work.
     * Do NOT edit this method until after you have fully satisfied the reqs for a 5
     */

    public void start() {
        String userName = getUserName();
        printGreeting(userName);
        printInstructions();
        doMadlib();
    }
    
    // this method 
    
    // add and implement the other methods you need in this area below!
    public String getUserName() {
        return "Pedro Martins";
    }
    public void printGreeting(String userNameInput) {
        System.out.println("Hello, "+ userNameInput + ".");
    }
    
    public void printInstructions() {
       System.out.println("Enter proper words matching its category (nouns, verbs, adjectives, etc.) into the boxes below to get a humorous story!");
       doMadLib(true);
    }
    public void doMadLib(boolean b) {
        System.out.println();
    }

    /* DO NOT TOUCH OR EDIT THE METHOD BELOW! ADD NO CODE BELOW THIS LINE */
    public static void main(String[] args) throws Exception {
        new App().start();
    }
}
