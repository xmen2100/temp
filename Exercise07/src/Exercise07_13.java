public class Exercise07_13 {
    public static void main(String[] args) {
        final int NUMBERS_PER_LINE = 15;

        for (int i = 1; i <= 45; i++) {
            String randNum = String.format("%4d", getRandom(1, 100, 4, 8, 95, 93));

            if (i % NUMBERS_PER_LINE == 0) {
                System.out.println(randNum);
            }
            else {
                System.out.print(randNum);
            }
        }
    }

    public static int getRandom(int start, int end, int... numbers) {
        while (true) {
            int randNum = (int)(start + Math.random() * end);
            boolean isValid = true;

            for (int e : numbers) {
                if (e == randNum) { // check if randNum matches any element in array
                    isValid = false;
                    break; // if found 1 number match, no need to check anymore
                }
            }

            if (isValid) {
                return randNum;
            }
        }
    }
}
