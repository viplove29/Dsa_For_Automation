package org.example.badApproach;

import java.util.List;

public class InefficientValidation {

  public long validate(List<String> userIds) {
    long startTime = System.currentTimeMillis(); // Start timer

    boolean hasDuplicates = false;

    for (int i = 0; i < userIds.size(); i++) {
      for (int j = i + 1; j < userIds.size(); j++) {
        if (userIds.get(i).equals(userIds.get(j))) {
          hasDuplicates = true; // Duplicate found
          break;
        }
      }
    }
//    Inefficient Approach (Nested Loops):
//    Uses two loops to compare each user ID with all others (O(n²)).
//            Slows significantly as the dataset grows.

    long endTime = System.currentTimeMillis(); // End timer

    // Print result
    if (hasDuplicates) {
      System.out.println("Inefficient Approach: Duplicates detected.");
    } else {
      System.out.println("Inefficient Approach: All user IDs are unique.");
    }

    return endTime - startTime; // Return execution time
  }
}