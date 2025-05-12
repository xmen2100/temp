import java.util.Scanner;

public class Exercise05_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        System.out.println();
        System.out.println("0 - Sunday\n1 - Monday\n2 - Tuesday\n3 - Wednesday\n4 - Thursday\n5 - Friday\n6 - Saturday");
        System.out.print("Enter the first day of " + year + " as an integer: ");
        int firstDay = input.nextInt();

        System.out.println();
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        for (int month = 1; month <= 12; month++) {
            int numberOfDaysInMonth = 0;

            switch (month) { // Number of days depending on month
                case 1, 3, 5, 7, 8, 10, 12 -> numberOfDaysInMonth = 31;
                case 4, 6, 9, 11 -> numberOfDaysInMonth = 30;
                case 2 -> {
                    if (isLeapYear) {
                        numberOfDaysInMonth = 29;
                    }
                    else {
                        numberOfDaysInMonth = 28;
                    }
                }
            }

            String monthString = switch (month) {
                case 1 -> "January";
                case 2 -> "February";
                case 3 -> "March";
                case 4 -> "April";
                case 5 -> "May";
                case 6 -> "June";
                case 7 -> "July";
                case 8 -> "August";
                case 9 -> "September";
                case 10 -> "October";
                case 11 -> "November";
                case 12 -> "December";
                default -> "";
            };

            String dayOfTheWeek = switch (firstDay) {
                case 0 -> "Sunday";
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                default -> "";
            };

            System.out.println(monthString + " " + 1 + ", " + year + " is " + dayOfTheWeek);
            firstDay = (firstDay + numberOfDaysInMonth) % 7; // To get subsequent month's day of the week

        }
    }
}
