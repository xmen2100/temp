public class Exercise05_27 {
    public static void main(String[] args) {
        int yearsPerLine = 10;
        int count = 1;

        for (int year = 101; year <= 2100; year++) { // Year 101 to 2100
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0); // Calculate leap year

            if (isLeapYear) {
                if (count % yearsPerLine == 0) { // If 10th then print itself and new line
                    System.out.println(year);
                    count++; // Increment count
                }

                else { // If not 10th then print itself and a space
                    System.out.print(year + " ");
                    count++; // Increment count
                }
            }
        }

        System.out.println(); // Display how many leap years
        System.out.print("\nThe number of leap years from year 101 to 2100 is " + count);
    }
}
