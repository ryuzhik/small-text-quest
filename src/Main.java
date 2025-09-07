import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to your adventure!");
        System.out.println("You are a brave traveller, looking for adventures.");
        System.out.println("Please enjoy your journey!");
        start();
    }

    static void start() {
        Scanner scan = new Scanner(System.in);
        System.out.println("You're standing on a pathway that goes three ways.");
        System.out.println("Which way do you choose? (enter a number)");
        System.out.println("1 - left, 2 - middle, 3 - right, 4 - exit the quest");
        String path = scan.nextLine();
        switch (path) {
            case ("1"):
                System.out.println("You choose to go left and see a big castle in front of you.");
                castle();
            case ("2"):
                System.out.println("You choose to go middle and see a big tree in front of you.");
                tree();
            case ("3"):
                System.out.println("You choose to go right and see a stranger in front of you");
                stranger();
            case ("4"):
                System.out.println("Thank you for trying this quest!");
                System.out.println("Bye!");
                break;
            default:
                System.out.println("Incorrect value! Please try again!\n");
                start();
        }
    }

    static void castle() {
        Scanner scan = new Scanner(System.in);
        System.out.println("You go inside the castle and you see a big dragon in front of you!");
        System.out.println("What do you do? (write a number)");
        System.out.println("1 - fight the dragon, 2 - run away");
        String decision = scan.nextLine();
        switch (decision) {
            case ("1"):
                System.out.println("You fight the dragon, and after a tough battle, you defeat him!");
                System.out.println("You find a treasure in the castle and you take it with you!");
                System.out.println("And now you're back on the three paths.\n");
                start();
            case ("2"):
                System.out.println("You decide to run away.");
                System.out.println("You don't know, what you would get if you fought the dragon, but at least you're alive");
                System.out.println("And now you're back on the three paths\n");
                start();
            default:
                System.out.println("Incorrect value! Please try again!\n");
                castle();
        }
    }

    static void tree() {
        Scanner scan = new Scanner(System.in);
        System.out.println("You're standing in front of a big tree and you look at it for a while");
        System.out.println("And now you feel tired. What do you do? (write a number)");
        System.out.println("1 - rest under the tree, 2 - go back");
        String decision = scan.nextLine();
        switch (decision) {
            case ("1"):
                System.out.println("You decided to take a nap under the big tree.");
                System.out.println("You wake up after sleeping the whole day and decide to go back, refreshed and full of energy");
                System.out.println("And now you're back on the three paths\n");
                start();
            case ("2"):
                System.out.println("You decide to go back to take a nap somewhere else");
                System.out.println("And now you're back on the three paths\n");
                start();
            default:
                System.out.println("Incorrect value! Please try again!\n");
                tree();
        }
    }

    static void stranger() {
        Scanner scan = new Scanner(System.in);
        System.out.println("There's a stranger in front of you, and you decide to walk closer.");
        System.out.println("What do you do next? (write a number)");
        System.out.println("1 - talk to stranger, 2 - fight, 3 - go past them");
        String decision = scan.nextLine();
        switch (decision) {
            case ("1"):
                System.out.println("You talk to stranger and have a nice conversation with them!");
                System.out.println("You feel good and you go back for new adventure");
                System.out.println("And now you're back on the three paths\n");
                start();
            case("2"):
                System.out.println("You decide to fight the stranger, but they're stronger than you");
                System.out.println("They brought you back while you were passed out");
                System.out.println("At least they didn't rob you.");
                System.out.println("And now you're back on the three paths\n");
                start();
            case("3"):
                System.out.println("You decide to go past them, but you don't see anything interesting ahead.");
                System.out.println("You decide to go back, but there's no stranger anymore");
                System.out.println("And now you're back on the three paths\n");
                start();
            default:
                System.out.println("Incorrect value! Please try again!\n");
                stranger();
        }
    }

}
