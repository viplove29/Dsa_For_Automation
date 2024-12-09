package org.example.goodApproach;

import java.util.ArrayList;
import java.util.List;

public class GoodAlgorithm {

  public static void main(String[] args) {
    // Generate a large list of user IDs for testing
    List<String> userIds = new ArrayList<>();
    for (int i = 0; i < 100000; i++) {
      userIds.add("user" + i);
      if (i % 10000 == 0) {
        userIds.add("user" + i); // Add some duplicates
      }
    }

    // Efficient Approach
    EfficientValidation efficientValidation = new EfficientValidation();
    long efficientTime = efficientValidation.validate(userIds);
    System.out.println("Efficient Approach - Time Taken: " + efficientTime + " ms");
  }
}
