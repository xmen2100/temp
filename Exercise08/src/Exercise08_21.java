import java.util.Scanner;

public class Exercise08_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of cities: ");
        double[][] cityCoords = new double[input.nextInt()][2];

        System.out.println("Enter the coordinates of the cities: ");
        for (int i = 0; i < cityCoords.length; i++) {
            for (int j = 0; j < cityCoords[i].length; j++) {
                cityCoords[i][j] = input.nextDouble();
            }
        }

        double[] totalDist = calculateTotalDist(cityCoords);

        int centralCity = 0;
        double minTotalDist = totalDist[0];

        for (int i = 0; i < totalDist.length; i++) {
            if (minTotalDist > totalDist[i]) {
                minTotalDist = totalDist[i];
                centralCity = i;
            }
        }

        System.out.println("The central city is at (" +
            cityCoords[centralCity][0] + ", " + cityCoords[centralCity][1] + ")");
        System.out.printf("The total distance to all other cities is %.2f", minTotalDist);

    }

    public static double[] calculateTotalDist(double[][] cityCoords) {
        double[] totalDist = new double[cityCoords.length];

        for (int i = 0; i < cityCoords.length; i++) {
            for (double[] coordinate : cityCoords) {
                totalDist[i] += Math.sqrt(Math.pow(coordinate[0] - cityCoords[i][0], 2) +
                    Math.pow(coordinate[1] - cityCoords[i][1], 2));
            }
        }
        return totalDist;
    }
}
