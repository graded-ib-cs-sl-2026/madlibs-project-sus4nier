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
            return getUserName; // simple scanner response

    }

    public void printGreeting(String userNameInput) { // ASCII text looks cool
        System.out.println("##   ##  ### ###  ####      ## ##    ## ##   ##   ##  ### ###  \n" + //
                        "##   ##   ##  ##   ##      ##   ##  ##   ##   ## ##    ##  ##  \n" + //
                        "##   ##   ##       ##      ##       ##   ##  # ### #   ##      \n" + //
                        "## # ##   ## ##    ##      ##       ##   ##  ## # ##   ## ##   \n" + //
                        "# ### #   ##       ##      ##       ##   ##  ##   ##   ##      \n" + //
                        " ## ##    ##  ##   ##  ##  ##   ##  ##   ##  ##   ##   ##  ##  \n" + //
                        "##   ##  ### ###  ### ###   ## ##    ## ##   ##   ##  ### ###  \n" + //
                        "                                                               \n" + //
                        "");
        System.out.println("Hello " + userNameInput + "!");
    }

    public void printInstructions() {
        System.out.println(
                "Enter proper words matching its category (nouns, verbs, adjectives, etc.) according to the lines below to get a humorous story!");
    }

    public void doMadLib() {
        Scanner userInput = new Scanner(System.in);
        boolean playAgain; // 

        do { // foundation for loop
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
        
        // Choice between 2 different stories
        System.out.println("Choose what MadLib story you want!");
        System.out.println("1. Ordinary Life");
        System.out.println("2. Adventure Story");        
        int choice = userInput.nextInt(); // nextInt idea was found in the website StackOverflow
        userInput.nextLine(); // Fix for nextInt provided by teacher 


        // Madlib result
        if (choice == 1) { // Story 2
        String routineStory = "It was a " + adj1 + ", cold November day. I woke up to the " + adj2 +
                " smell of " + flowers + " in my desk. I " + pastVerb +
                " down the stairs to see my " + pet + " running around the house like a " + noun1 +
                ". I then greeted my " + adj3 + " sibling named " + name +
                ", who has a very " + adj4 + " " + noun2 + ".";
        System.out.println("Here is a ordinary story");
        System.out.println(routineStory);
        }
        else if (choice == 2){ // story 1
        String adventureStory = "It was a " + adj1 + ", bright summer morning when I stumbled upon a " + adj2 + 
            " treasure chest filled with " + flowers + ". Excited, I " + pastVerb + 
            " to my backyard, where my " + pet + " was digging like a " + noun1 + 
            ". I shared the news with my " + adj3 + " sibling, " + name + 
            ", who immediately grabbed a " + adj4 + " map to find more hidden " + noun2 + ".";
            System.out.println("Here is a adventure story");
            System.out.println(adventureStory);
        }
        else {
            System.out.println("Invalid choice. Please enter 1 or 2"); // If the user inputs a invalid answer it prompts to enter a new one (glithched atm)
        } 
        // Asks if the user plays again
        System.out.println("Would you like to play again? Answer with yes/no.");
        String response = userInput.nextLine();
        playAgain = response.equalsIgnoreCase("yes");
        
    } while(playAgain); // activates the loop
    
}

    

    /* DO NOT TOUCH OR EDIT THE METHOD BELOW! ADD NO CODE BELOW THIS LINE */
    public static void main(String[] args) throws Exception {
        new App().start();
    }
}
