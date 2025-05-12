public class Exercise06_33 {
    public static void main(String[] args) {
        long totalMillis = System.currentTimeMillis();
        int currentMillis = (int)(totalMillis % 1000);

        long totalSeconds = totalMillis / 1000;
        int currentSecond = (int)(totalSeconds % 60);

        long totalMinutes = totalSeconds / 60;
        int currentMinute = (int)(totalMinutes % 60);

        long totalHours = totalMinutes / 60;
        int currentHour = (int)(totalHours % 24);

        int totalDays = (int)(totalHours / 24);

        // if there are any leftover time, then include the partial day
        if (currentHour > 0 || currentMinute > 0 || currentSecond > 0 || currentMillis > 0) totalDays++;

        int currentYear = getCurrentYear(totalDays);
        int daysInCurrentYear = getDaysInCurrentYear(totalDays, currentYear);
        int currentMonth = getMonthInCurrentYear(daysInCurrentYear, currentYear);
        int currentDay = getDaysInCurrentMonth(daysInCurrentYear, currentMonth, currentYear);

        System.out.println("Current date and time is " + getMonthName(currentMonth) + " " + currentDay +
                ", " + currentYear + " " + (currentHour <= 9 ? "0" + currentHour :
                currentHour) + ":" + (currentMinute <= 9 ? "0" + currentMinute :
                currentMinute) + ":" + (currentSecond <= 9 ? "0" + currentSecond :
                currentSecond));
    }

    public static int getCurrentYear(int totalDays) {
        int year = 1970;
        for (int days = 0, month = 1; totalDays > days; month++) {
            days += getDaysInMonth(month, year);

            if (month == 12) {
                year++;
                month = 0;
            }
        }
        return year;
    }

    public static int getDaysInCurrentYear(int totalDays, int currentYear) {
        int days = 0;
        for (int month = 1, year = 1970; year <= currentYear - 1; month++) {
            days += getDaysInMonth(month, year);

            if (month == 12) {
                year++;
                month = 0;
            }
        }
        return totalDays - days;
    }

    public static int getDaysInMonth(int month, int year) {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> 0;
        };
    }

    public static int getMonthInCurrentYear(int daysInCurrentYear, int currentYear) {
        int month = 1;
        while (true) {
            if (daysInCurrentYear - getDaysInMonth(month, currentYear) >= 0) {
                daysInCurrentYear -= getDaysInMonth(month, currentYear);
                month++;
            }
            else {
                return month;
            }
        }
    }

    public static int getDaysInCurrentMonth(int daysInCurrentYear, int currentMonth, int currentYear) {
        int days = 0;
        for (int month = 1; month <= currentMonth - 1; month++) {
            days += getDaysInMonth(month, currentYear);
        }
        return daysInCurrentYear - days;
    }

    public static String getMonthName(int currentMonth) {
        return switch (currentMonth) {
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
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
