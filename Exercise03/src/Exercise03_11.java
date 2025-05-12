import java.util.Scanner;

public class Exercise03_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a month in the year (e.g., 1 for Jan): ");
        int month = input.nextInt();

        System.out.print("Enter a year ");
        int year = input.nextInt();

        boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        
        switch (month) {
            case 1 : System.out.print("January " + year + " has " + "31 days"); break;
            case 2 : System.out.print("February " + year + " has " + (isLeapYear ? "29 days" : "28 days")); break;
            case 3 : System.out.print("March " + year + " has " + "31 days"); break;
            case 4 : System.out.print("April " + year + " has " + "30 days"); break;
            case 5 : System.out.print("May " + year + " has " + "31 days"); break;
            case 6 : System.out.print("June " + year + " has " + "30 days"); break;
            case 7 : System.out.print("July " + year + " has " + "31 days"); break;
            case 8 : System.out.print("August " + year + " has " + "31 days"); break;
            case 9 : System.out.print("September " + year + " has " + "30 days"); break;
            case 10 : System.out.print("October " + year + " has " + "31 days"); break;
            case 11 : System.out.print("November " + year + " has " + "30 days"); break;
            case 12 : System.out.print("December " + year + " has " + "31 days"); break;
        };

        input.close();
    }
}
