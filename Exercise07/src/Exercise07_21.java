public class Exercise07_21 {
    public static void main(String[] args) {
        int sum = 0;
        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }
        System.out.print("The sum of the integers is " + sum);
    }
}
