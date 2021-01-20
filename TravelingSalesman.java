import java.util.*;
import java.io.*;

public class TravelingSalesman {
	public static void main (String[] args) {
		System.out.println(Arrays.deepToString(pathGeneration(3)));
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
		//calculates how many possible paths there are
		int permutations = 1;
		for (int counter = cities; counter >= 1; counter--) permutations *= counter;
		//Assigns array in memory
		int[][] paths = new int[permutations][cities];
		//generates starting, ordered path
		int[] path = new int[cities];
		for (int city = 0; city < cities; city++) {
			path[city] = city;
		}

		int permutation = 0; //counts which permutation we are on
		paths[permutation] = path.clone();
		permutation++;
		while (permutation < permutations) {//keep on swapping onto all permutations are calculated
			for (int first_swap = 0; first_swap < cities; first_swap++) {
				for (int second_swap = cities - 1; second_swap > first_swap; second_swap--) {
					int holder = path[first_swap]; //holds first value for the swap
					//the swap
					path[first_swap] = path[second_swap];
					path[second_swap] = holder;
					//assigns the newly generated path
					paths[permutation] = path.clone();
					permutation++;
					if (permutation >= permutations) {
						return paths;
					}
				}
			}
		}
		return paths;
	}

	public static int leastDistancePerPath (int[][] paths) {
		int distance = (int)Double.POSITIVE_INFINITY;


		return distance;
	}
}
