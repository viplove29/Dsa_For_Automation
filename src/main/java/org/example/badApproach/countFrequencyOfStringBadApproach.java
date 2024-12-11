package org.example.badApproach;

import java.util.Random;

public class countFrequencyOfStringBadApproach {

  public static void main(String[] args) {

    // Hardcoded input array
    // Generate a large dataset of random strings
    int datasetSize = 10000; // Size of the dataset
    String[] strings = generateRandomStrings(datasetSize, 100);
    System.out.println("Dataset generated with size: " + datasetSize);

    int n = strings.length;

    // Create an array to store whether a string is already counted
    boolean[] counted = new boolean[n];

    // Start the timer
    long startTime = System.currentTimeMillis();

    System.out.println("String frequencies:");

    // Outer loop to process each string
    for (int i = 0; i < n; i++) {
      if (counted[i]) {
        continue; // Skip strings that have already been counted
      }
      int count = 1;

      // Inner loop to compare the current string with all others  Ram, Sita, Ram,
      for (int j = i + 1; j < n; j++) {
        if (strings[i].equals(strings[j])) {
          count++;
          counted[j] = true; // Mark as counted
        }
      }
      //  The nested loop approach slows down significantly with quadratic time complexity O(n2)
      // Print the frequency of the current string
      System.out.println(strings[i] + ": " + count);
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
