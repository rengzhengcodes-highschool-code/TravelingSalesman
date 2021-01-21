import java.util.*;
public class PathsGenerationTester {
	public static void main (String [] args){
		System.out.println (TravelingSalesman.pathGeneration(2).size());
		System.out.println (TravelingSalesman.pathGeneration(3).size());
		System.out.println (TravelingSalesman.pathGeneration(4).size());
		System.out.println (TravelingSalesman.pathGeneration(5).size());
		System.out.println (TravelingSalesman.pathGeneration(6).size());
		System.out.println (TravelingSalesman.pathGeneration(7).size());
		System.out.println (TravelingSalesman.pathGeneration(8).size());
		System.out.println (TravelingSalesman.pathGeneration(9).size());
		ArrayList<ArrayList<Integer>> FourCities = TravelingSalesman.pathGeneration(4);
		for (int i = 0; i < FourCities.size(); i++){
			System.out.println(FourCities.get(i));
		}

		//search ArrayList
		System.out.println("\n dupes \n");
		int prints = 0;
		for (int path = 0; path < FourCities.size(); path++) {
			for (int search_path = 0; search_path < FourCities.size(); search_path++) {
				if (FourCities.get(path).equals(FourCities.get(search_path)))  {
					System.out.println("Print: " + prints++ + " Path: " + path + " | Search: " + search_path);
					System.out.println(FourCities.get(path));
				}
			}
		}
	}
}
