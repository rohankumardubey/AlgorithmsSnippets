package com.Sample.algorithms.HashSetUsage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    //
      User user1 = new User();
      user1.setName("name");
      User user2 = new User();
      user2.setName("name");
//    System.out.println(user.getName());
      List<User> userList = Arrays.asList(user1,user2);
      HashSet<User> hashSet = new HashSet<>(userList);
    System.out.println(hashSet.size());
  }
}
