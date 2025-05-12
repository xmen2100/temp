public class Exercise08_04 {
    public static void main(String[] args) {
        int[][] workHours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}};

        int[] totalHours = new int[workHours.length];
        for (int i = 0; i < workHours.length; i++) {
            for (int j = 0; j < workHours[i].length; j++) {
                totalHours[i] += workHours[i][j];
            }
        }

        int[] employees = new int[workHours.length];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = i;
        }

        sortTotalHoursAndEmployees(totalHours, employees);

        for (int i = totalHours.length - 1; i >= 0; i--) {
            System.out.println("Employee " + employees[i] + "'s total hours is " + totalHours[i]);
        }
    }

    public static void sortTotalHoursAndEmployees(int[] totalHours, int[] employees) {
        for (int i = 0; i < totalHours.length - 1; i++) {
            int currentMin = totalHours[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < totalHours.length; j++) {
                if (currentMin > totalHours[j]) {
                    currentMin = totalHours[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                totalHours[currentMinIndex] = totalHours[i];
                totalHours[i] = currentMin;

                int temp = employees[currentMinIndex];
                employees[currentMinIndex] = employees[i];
                employees[i] = temp;
            }
        }

    }
}
