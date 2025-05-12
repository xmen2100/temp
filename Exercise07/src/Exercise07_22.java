public class Exercise07_22 {
    public static void main(String[] args) {
        int count = 0;

        if (args.length > 0) { // must have at least 1 cmdline arg
            String str = args[0];

            for (int i = 0; i < str.length(); i++) {
                if (Character.isUpperCase(str.charAt(i))) {
                    count++;
                }
            }
        }
        System.out.print("The number of uppercase letters in the string is " + count);
    }
}
