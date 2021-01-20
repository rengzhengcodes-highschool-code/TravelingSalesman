import java.util.*;
public class Testing{
	public static void main (String [] args){
		System.out.println (TravelingSalesman.pathGeneration(2).length);
		System.out.println (TravelingSalesman.pathGeneration(3).length);
		System.out.println (TravelingSalesman.pathGeneration(4).length);
		System.out.println (TravelingSalesman.pathGeneration(5).length);
		System.out.println (TravelingSalesman.pathGeneration(6).length);
		System.out.println (TravelingSalesman.pathGeneration(7).length);
		System.out.println (TravelingSalesman.pathGeneration(8).length);
		System.out.println (TravelingSalesman.pathGeneration(9).length);
		int [][] FourCities = TravelingSalesman.pathGeneration(1);
		for (int i = 0; i < FourCities.length; i++){
			System.out.println(Arrays.toString(FourCities[i]));
		}

		//search Array
		System.out.println("\n dupes \n");
		int prints = 0;
		for (int path = 0; path < FourCities.length; path++) {
			for (int search_path = 0; search_path < FourCities.length; search_path++) {
				if (Arrays.toString(FourCities[path]).equals(Arrays.toString(FourCities[search_path])))  {
					System.out.println("Print: " + prints++ + " Path: " + path + " | Search: " + search_path);
					System.out.println(Arrays.toString(FourCities[path]));
				}
			}
		}
	}
}
