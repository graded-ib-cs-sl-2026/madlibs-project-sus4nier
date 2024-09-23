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
        doMadLib();
    }

    // add and implement the other methods you need in this area below!
    public String getUserName() {
        System.out.println("Enter your name below.");
        Scanner userInput = new Scanner(System.in);
            String getUserName = userInput.nextLine();
            return getUserName;

    }

    public void printGreeting(String userNameInput) {
        System.out.println("Hello, " + userNameInput + "!");
    }

    public void printInstructions() {
        System.out.println(
                "Enter proper words matching its category (nouns, verbs, adjectives, etc.) according to the lines below to get a humorous story!");
    }

    public void doMadLib() {
        Scanner userInput = new Scanner(System.in);
        // Adjective Inputs
        System.out.println("Adjective 1:");
        String adj1 = userInput.nextLine();
        System.out.println("Adjective 2:");
        String adj2 = userInput.nextLine();
        System.out.println("Adjective 3:");
        String adj3 = userInput.nextLine();
        System.out.println("Adjective 4:");
        String adj4 = userInput.nextLine();

        // Noun Inputs
        System.out.println("Noun 1:");
        String noun1 = userInput.nextLine();
        System.out.println("Noun 2:");
        String noun2 = userInput.nextLine();

        // Misc Inputs
        System.out.println("Type of Flowers:");
        String flowers = userInput.nextLine();
        System.out.println("Past Verb:");
        String pastVerb = userInput.nextLine();
        System.out.println("Pet Species:");
        String pet = userInput.nextLine();
        System.out.println("Name:");
        String name = userInput.nextLine();

        // Madlib result
        String story = "It was a " + adj1 + ", cold November day. I woke up to the " + adj2 +
                " smell of " + flowers + " in my desk. I " + pastVerb +
                " down the stairs to see my " + pet + " running around the house like a " + noun1 +
                ". I then greeted my " + adj3 + " sibling named " + name +
                ", who has a very " + adj4 + " " + noun2 + ".";
        System.out.println(story);
        // return "Hope you had a great story!";

    }

    /* DO NOT TOUCH OR EDIT THE METHOD BELOW! ADD NO CODE BELOW THIS LINE */
    public static void main(String[] args) throws Exception {
        new App().start();
    }
}
