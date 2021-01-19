public class TravelingSalesman {
	public static void main (String[] args) {
		System.out.println((int) Double.POSITIVE_INFINITY);
	}

	public static int[][] importFromFile(String file) {
		int cities = 0;
		//parse each line to cities to cities to value
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
