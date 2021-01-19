import java.util.*;
import java.io.*;

public class TravelingSalesman {
	public static void main (String[] args) {
		System.out.println((int) Double.POSITIVE_INFINITY);
	}

	public static int[][] importFromFile(String file) {
		int cities = 0;
		ArrayList<String> citiesList = new ArrayList<String>();
		//parse each line to cities to cities to value
		try {
			File f = new File(file);
			Scanner in = new Scanner(f);
			while (in.hasNextLine()) {

				Scanner line = new Scanner(in.nextLine());

				for (int i = 0; line.hasNext(); i++) {

					String word = line.next();
					// creates a list of cities with corresponding indexes and counts number of cities
					if ((i==0||i==2) && !citiesList.contains(word)) {
						citiesList.add(word);
						cities++;
					}
				}
				line.close();
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(file + "not found");
		}

		int[][] distances = new int[cities][cities];
		//assign distances here1

		return distances;
	}

	public static int[][] pathGeneration (int cities) {
		//generates how many possible paths there are
		int permutations = 1;
		for (int counter = cities; counter >= 1; counter--) cities *= permutations;
		//generates arrays
		int[][] paths = new int[permutations][cities];

		return paths;
	}

	public static int leastDistancePerPath (int[][] paths) {
		int distance = (int)Double.POSITIVE_INFINITY;
		

		return distance;
	}
}
