public class Exercise12_01Part2 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(1);
        }

        if (!isNumeric(args[0]) || !isNumeric(args[2])) {
            System.exit(1);
        }

        int result = switch (args[1].charAt(0)) {
            case '+' -> Integer.parseInt(args[0]) +
                Integer.parseInt(args[2]);
            case '-' -> Integer.parseInt(args[0]) -
                Integer.parseInt(args[2]);
            case '.' -> Integer.parseInt(args[0]) *
                Integer.parseInt(args[2]);
            case '/' -> Integer.parseInt(args[0]) /
                Integer.parseInt(args[2]);
            default -> 0;
        };

        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
            + " = " + result);

    }

    public static boolean isNumeric(String arg) {
        for (int i = 0; i < arg.length(); i++) {
            if (!(arg.charAt(i) >= '0' && arg.charAt(i) <= '9')) {
                System.out.println("Wrong input: " + arg);
                return false;
            }
        }
        return true;
    }
}
