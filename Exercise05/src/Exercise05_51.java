import java.util.Scanner;

public class Exercise05_51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = input.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = input.nextLine();

        String commonPrefix = ""; // initialize common prefix
        for (int i = 0; i <= (firstString.length() < secondString.length() ? firstString.length() - 1 :
                secondString.length() - 1); i++) { // iterate through index until reach end of smaller string
            if (firstString.charAt(i) == secondString.charAt(i)) { // check if chars match
                commonPrefix += firstString.charAt(i); // if yes, add to commonPrefix
            }
            else { // if not, break out of loop to stop checking
                break;
            }
        }

        if (commonPrefix.isEmpty()) { // if there is no common prefix
            System.out.print(firstString + " and " + secondString + " have no common prefix");
        }
        else { // display results
            System.out.print("The common prefix is " + commonPrefix);
        }
    }
}
