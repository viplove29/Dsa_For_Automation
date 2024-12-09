package org.example.badApproach;

import java.util.ArrayList;
import java.util.List;

/** Hello world! */
public class BadAlgorithm {
  public static void main(String[] args) {

    // Generate a large list of user IDs for testing
    List<String> userIds = new ArrayList<>();
    for (int i = 0; i < 100000; i++) {
      userIds.add("user" + i);
      if (i % 10000 == 0) {
        userIds.add("user" + i); // Add some duplicates
      }
    }

    // Inefficient Approach
    InefficientValidation inefficientValidation = new InefficientValidation();
    long inefficientTime = inefficientValidation.validate(userIds);

    // Print results
    System.out.println("Inefficient Approach - Time Taken: " + inefficientTime + " ms");
  }
}
