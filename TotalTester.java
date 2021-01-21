import java.util.*;
import java.io.*;
import java.util.Arrays;
public class TotalTester extends TravelingSalesman {
  public static void main (String[] args) {

    System.out.println(leastDistancePerPath(pathGeneration(importFromFile(args[0])[0].length), importFromFile(args[0])));
    //System.out.println(pathGeneration(4));

  }

}
