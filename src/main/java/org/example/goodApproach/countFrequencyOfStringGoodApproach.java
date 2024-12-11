package org.example.goodApproach;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class countFrequencyOfStringGoodApproach {

  public static void main(String[] args) {
    // Hardcoded input array
    // Generate a large dataset of random strings
    int datasetSize = 10000; // Size of the dataset
    String[] strings = generateRandomStrings(datasetSize, 100);
    System.out.println("Dataset generated with size: " + datasetSize);

    // Start the timer
    long startTime = System.currentTimeMillis();

    // Create a map to store string frequencies
    Map<String, Integer> frequencyMap = new HashMap<>();

    for (String str : strings) {
      frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
    }
    //    As the dataset size increases, the HashMap approach remains efficient with linear time
    // complexity O(n)

    // Display the frequency of each string
    System.out.println("String frequencies:");
    for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }

    // End the timer
    long endTime = System.currentTimeMillis();

    // Calculate and display elapsed time
    long elapsedTime = endTime - startTime;
    System.out.println("\nExecution time: " + elapsedTime + " milliseconds");
  }

  // Method to generate random strings
  private static String[] generateRandomStrings(int size, int uniqueCount) {
    Random random = new Random();
    String[] uniqueStrings = new String[uniqueCount];
    for (int i = 0; i < uniqueCount; i++) {
      uniqueStrings[i] = "Str" + i;
    }

    String[] result = new String[size];
    for (int i = 0; i < size; i++) {
      result[i] = uniqueStrings[random.nextInt(uniqueCount)];
    }
    return result;
  }
}
