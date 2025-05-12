public class Exercise13_16 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Exercise13_16 \"operand1 operator operand2\"");
            System.exit(1);
        }

        String[] equation = args[0].split(" ");

        String operand1Str = equation[0];
        String operator = equation[1];
        String operand2Str = equation[2];

        String[] operand1StrArr = operand1Str.split("/");
        String[] operand2StrArr = operand2Str.split("/");

        int[] operand1Int = new int[2];
        int[] operand2Int = new int[2];

        for (int i = 0; i < 2; i++) {
            operand1Int[i] = Integer.parseInt(operand1StrArr[i]);
            operand2Int[i] = Integer.parseInt(operand2StrArr[i]);
        }

        Rational r1 = new Rational(operand1Int[0], operand1Int[1]);
        Rational r2 = new Rational(operand2Int[0], operand2Int[1]);

        switch (operator) {
            case "+" -> System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
            case "-" -> System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
            case "*" -> System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
            case "/" -> System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        }
    }
}
