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

    for (String userId :
        userIds) { //    Iterate Through the List: The loop iterates over each userId in the userIds
      // list.
      if (!uniqueUsers.add(userId)) { //    Add User ID to the HashSet:
        hasDuplicates = true; // Duplicate found
      }
    }
    //    The uniqueUsers.add(userId) method tries to add the current userId to the HashSet.
    //    Check if the Add Was Successful:
    //    The add() method of a HashSet returns:
    //    true if the element is not already in the set (it’s added successfully).
    //    false if the element is already in the set (indicating a duplicate).
    //   Mark Duplicates:
    // If add() returns false (duplicate found), the hasDuplicates flag is set to true.
    //  Why Use a HashSet?
    //       Efficient Checking:
    //    A HashSet has an average time complexity of O(1) for add() operations.
    //    This makes it much faster than checking for duplicates using nested loops, which has a
    // time complexity of O(n²).

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
