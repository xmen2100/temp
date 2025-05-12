public class Exercise06_16 {
    public static void main(String[] args) {
        for (int i = 2000; i <= 2020; i++) { // iterate through year 2000 to 2020
            System.out.println(i + " has " + numberOfDaysInAYear(i) + " days"); // display number of days in year 2000-2020
        }
    }

    public static int numberOfDaysInAYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return 366; // 366 days in leap year
        }
        else {
            return 365; // 365 days in regular year
        }
    }
}
