import java.util.*;
public class Permutations{
  public static String[][] pathGeneration (int cities){


    //create an array for the cities ( ex. [0,1,2,3,4,5] for 6 cities)
    String [] CityArray = new String [cities];
    for (int i = cities - 1; i >= 0; i--){
      CityArray[i] = i + "";
    }

    List <String> CityArrayAsList = Arrays.asList(CityArray);


      // calculate the number of permutations
    int TotalPermutations = 1;
    while (cities >= 1){
      TotalPermutations = TotalPermutations * cities;
      cities--;
    }

    String [][] paths = new String [TotalPermutations][cities];
    paths[0] = CityArray;

    //create a bunch of paths
    int CurrentNumberOfPermutationsFound = 1;
    while (CurrentNumberOfPermutationsFound < TotalPermutations){
      //randomly creates a permutation
      Collections.shuffle(CityArrayAsList);
      String [] NewArray = new String [CityArrayAsList.size()];
      CityArrayAsList.toArray(NewArray);

      //checks if the permutation is a new one...
      Boolean IsNewPermutation = true;
      for (int index = 0; index < paths.length; index++){
        //if not, then ends the check and creates another permutation
        if (paths[index] == NewArray){
          IsNewPermutation = false;
          index = paths.length;
        }
      }
      //if so, then add the permutation onto the list of all possible permutations
      if (IsNewPermutation == true){
        paths[CurrentNumberOfPermutationsFound] = NewArray;
        CurrentNumberOfPermutationsFound++;
      }
    }
    return paths;
  }

  public static void main (String [] args){
    System.out.println (pathGeneration(4).length);
    System.out.println (pathGeneration(5).length);
    System.out.println (pathGeneration(6).length);
    System.out.println (pathGeneration(8).length);
    //System.out.println (pathGeneration(9).length);
    String [][] FourCities = Permutations.pathGeneration(4);
    for (int i = 0; i < FourCities.length; i++){
      System.out.println(Arrays.toString(FourCities[i]));
    }
  }
}
