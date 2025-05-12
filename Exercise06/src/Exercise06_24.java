class Exercise06_24 {
    public static void main(String[] args) {
        long totalMillis = System.currentTimeMillis();
        long currentMillis = totalMillis % 1000;

        long totalSeconds = totalMillis / 1000;
        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        int totalDays = (int)(totalHours / 24);
        if (currentHour > 0 || currentMinute > 0 || currentSecond > 0 || currentMillis > 0) totalDays++;

        int year = 2000;
        do {
            year++;
        } while (totalDays > systemCurrentTimeDays(year));

        int daysInCurrentYear = getDaysInCurrentYear(totalDays, year);

        int month = 0;
        int daysInMonths = 0;
        do {
            month++;
            daysInMonths += getDaysInMonth(month, year);
        } while (daysInCurrentYear > daysInMonths);

        int daysInCurrentMonth = getDaysInCurrentMonth(daysInCurrentYear, month, year);

        System.out.println(month + "/" + daysInCurrentMonth + "/" + year + " " + currentHour + ":" + currentMinute + ":" + currentSecond + " UTC");
    }

    public static int getDaysInCurrentMonth(int daysInCurrentYear, int currentMonth, int year) {
        int days = 0;
        for (int month = 1; month <= currentMonth - 1; month++) {
            days += getDaysInMonth(month, year);
        }
        return daysInCurrentYear - days;
    }

    public static int getDaysInCurrentYear(int totalDays, int year) {
        int days = 0;
        for (int temp = 1970, month = 1; temp <= year - 1; month++) {
            days += getDaysInMonth(month, temp);

            if (month == 12) {
                month = 0;
                temp++;
            }
        }
        return totalDays - days;
    }

    public static int systemCurrentTimeDays(int year) {
        int days = 0;
        for (int temp = 1970, month = 1; temp <= year; month++) {
            days += getDaysInMonth(month, temp);

            if (month == 12) {
                month = 0;
                temp++;
            }
        }
        return days;
    }

    public static int getDaysInMonth(int month, int year) {
        return switch (month){
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> 0;
        };
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}