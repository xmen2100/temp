import java.util.Scanner;

public class Exercise05_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");

        int numberOfLines = 0; // Force go into while loop
        while (numberOfLines < 1 || numberOfLines > 15) {
            numberOfLines = input.nextInt(); // Keep getting input and assign to numberOfLines

            if (numberOfLines < 1 || numberOfLines > 15) { // Check if input is from 1 to 15
                System.out.println("Must be an integer from 1 to 15"); // If not, re-prompt user
                System.out.print("Please try again: "); // -before going back to check with while and get input again
            }
        }
        // row is each line
        for (int row = 1; row <= numberOfLines; row++) {
            for (int col = numberOfLines - 1, tenOrGreater = numberOfLines; col >= row; col--, tenOrGreater--) {
                // Print spaces 1 less than numberOfLines # of times per line (row #)
                if (tenOrGreater >= 10) { // If numberOfLines >= 10 print 4 spaces (make up for double digits)
                    System.out.print("    ");
                }

                else { // else print 3 spaces
                    System.out.print("   ");
                }
            }

            for (int col = 1, count = row; col <= row; col++, count--) { // Print # of times equal to row #
                System.out.print(count + "  "); // # pattern -1 each time start from row # --> add count var
            }

            for (int col = 1; col <= row - 1; col++) { // Print # of times 1 less than row #
                System.out.print((col + 1) + "  "); // Start print from 2 not 1
            }

            System.out.println();
        }
        
    }
}
