public class Exercise06_09 {
    public static void main(String[] args) {
        System.out.println("Feet\t\t\tMeters\t\t   |\t  Meters\t\t\tFeet");
        System.out.println("----------------------------------------------------------------");

        // start foot = 1, +1 each time until 10. start meter = 20, +5 each time until 65
        for (double foot = 1, meter = 20; foot <= 10 && meter <= 65; foot++, meter+=5) {
            System.out.printf("%-16.1f%-15.3f%-7s%-18.1f%.3f\n", foot, footToMeter(foot), "|", meter, meterToFoot(meter));
        }
    }

    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }
}
