public class Exercise05_18 {
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Pattern A");

        for (int i = 1; i <= n; i++) {
            int p = 1; // Reinitialize to 1 for each row
            for (int j = 1; j <= i; j++) {
                System.out.print(p++ + " "); // Display results
            }
            System.out.println(); // Go next line
        }

        System.out.println();
        System.out.println("Pattern B");
        for (int i = 1; i <= n; i++) {
            int p = 1; // Reinitialize to 1 for each row
            for (int j = i; j <= n; j++) {
                System.out.print(p++ + " "); // Display results
            }
            System.out.println(); // Go next line
        }

        System.out.println();
        System.out.println("Pattern C");
        for (int i = 1; i <= n; i++) {
            int p = i;
            for (int j = i; j <= n; j++) { // Display empty spaces
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(p-- + " "); // Display numbers
            }
            System.out.println(); // Go next line
        }

        System.out.println();
        System.out.println("Pattern D");
        for (int i = 1; i <= n; i++) {
            int p2 = 1;
            for (int j = 1; j <= i; j++) { // Display empty spaces
                System.out.print("  ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(p2++ + " "); // Display numbers
            }
            System.out.println(); // Go next line
        }
    }
}