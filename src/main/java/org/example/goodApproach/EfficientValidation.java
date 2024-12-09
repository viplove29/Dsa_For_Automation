package org.example.goodApproach;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EfficientValidation {

  // Efficient Approach: Using HashSet
  public long validate(List<String> userIds) {
    long startTime = System.currentTimeMillis(); // Start timer

    Set<String> uniqueUsers = new HashSet<>();
    boolean hasDuplicates = false;

    for (String userId : userIds) {
      if (!uniqueUsers.add(userId)) {
        hasDuplicates = true; // Duplicate found
      }
    }
//    Efficient Approach (HashSet):
//    Uses a HashSet for constant-time checks (O(1)).
//            Scales well with larger datasets.

    long endTime = System.currentTimeMillis(); // End timer

    // Print result
    if (hasDuplicates) {
      System.out.println("Efficient Approach: Duplicates detected.");
    } else {
      System.out.println("Efficient Approach: All user IDs are unique.");
    }

    return endTime - startTime; // Return execution time
  }
}
