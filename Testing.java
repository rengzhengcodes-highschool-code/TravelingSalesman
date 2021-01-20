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
    int [][] FourCities = TravelingSalesman.pathGeneration(4);
    for (int i = 0; i < FourCities.length; i++){
      System.out.println(Arrays.toString(FourCities[i]));
    }
  }
}
