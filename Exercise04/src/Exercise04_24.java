import java.util.Scanner;

public class Exercise04_24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String tempCity;
		
		System.out.print("Enter the first city: ");
		String city1 = input.nextLine();
		
		System.out.print("Enter the second city: ");
		String city2 = input.nextLine();
		
		System.out.print("Enter the third city: ");
		String city3 = input.nextLine();
		
		if ((city2.compareTo(city1) < 0) && (city2.compareTo(city3) < 0))
		{
			tempCity = city1;
			city1 = city2;
			city2 = tempCity;	
		}
		else if ((city3.compareTo(city1) < 0) && (city3.compareTo(city2) < 0))
		{
			tempCity = city1;
			city1 = city3;
			city3 = tempCity;
			
		}
		if (city3.compareTo(city2) < 0)
		{
			tempCity = city2;
			city2 = city3;
			city3 = tempCity;
		}
		System.out.print("The three cities in alphabetical order are " + city1 + " " + city2 + " " + city3);
		
		input.close();
	}

}
