import java.util.*;
public class DistanceTester{
	public static void main (String [] args){
    int[][] distances = TravelingSalesman.importFromFile("Cities.txt");
    ArrayList<ArrayList<Integer>> paths = TravelingSalesman.pathGeneration(distances.length);
    System.out.println(TravelingSalesman.leastDistancePerPath(paths, distances));
  }
}
