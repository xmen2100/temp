import java.util.Scanner;

public class Exercise05_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Activate scanner

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        System.out.println();
        System.out.println("0 - Sunday\n1 - Monday\n2 - Tuesday\n3 - Wednesday\n4 - Thursday\n5 - Friday\n6 - Saturday");
        System.out.print("Enter the first day of " + year + " as an integer: ");
        int firstDay = input.nextInt();

        for (int month = 1; month <= 12; month++) {
            System.out.println();
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
            int numberOfDaysInMonth = 0;

            switch(month) { // Print month and get days in the month
                case 1 :
                    System.out.printf("%28s\n", "January " + year);
                    numberOfDaysInMonth = 31; break;
                case 2 :
                    System.out.printf("%28s\n", "February " + year);
                    if (isLeapYear) numberOfDaysInMonth = 29;
                    else numberOfDaysInMonth = 28; break;
                case 3:
                    System.out.printf("%27s\n", "March " + year);
                    numberOfDaysInMonth = 31; break;
                case 4 :
                    System.out.printf("%27s\n", "April " + year);
                    numberOfDaysInMonth = 30; break;
                case 5 :
                    System.out.printf("%26s\n", "May " + year);
                    numberOfDaysInMonth = 31; break;
                case 6 :
                    System.out.printf("%26s\n", "June " + year);
                    numberOfDaysInMonth = 30; break;
                case 7 :
                    System.out.printf("%26s\n", "July " + year);
                    numberOfDaysInMonth = 31; break;
                case 8 :
                    System.out.printf("%27s\n", "August " + year);
                    numberOfDaysInMonth = 31; break;
                case 9 :
                    System.out.printf("%29s\n", "September " + year);
                    numberOfDaysInMonth = 30; break;
                case 10 :
                    System.out.printf("%28s\n", "October " + year);
                    numberOfDaysInMonth = 31; break;
                case 11 :
                    System.out.printf("%28s\n", "November " + year);
                    numberOfDaysInMonth = 30; break;
                case 12 :
                    System.out.printf("%28s\n", "December " + year);
                    numberOfDaysInMonth = 31; break;
            }
            System.out.println("---------------------------------------------");

            System.out.println("Sun    Mon    Tue    Wed    Thu    Fri    Sat");
            switch (firstDay) { // Print spaces depending on what first day is
                case 1 : System.out.printf("%7s", " "); break;
                case 2 : System.out.printf("%14s", " "); break;
                case 3 : System.out.printf("%21s", " "); break;
                case 4 : System.out.printf("%28s", " "); break;
                case 5 : System.out.printf("%35s", " "); break;
                case 6 : System.out.printf("%42s", " "); break;
            }

            for (int countDate = 1, date = 1; date <= numberOfDaysInMonth; date++, countDate++) {
                if ((countDate + firstDay) % 7 == 0) { // Print only 7 per line added by first day
                    System.out.printf("%3d    ", date);
                    if (date != numberOfDaysInMonth) {
                        System.out.println();
                    }
                }
                else {
                    System.out.printf("%3d    ", date);
                }
            }
            firstDay = (firstDay + numberOfDaysInMonth) % 7; // Find first day next month
            System.out.println();
            System.out.println();
        }
    }
}
