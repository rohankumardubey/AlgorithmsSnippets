package com.Sample.algorithms.CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class LatchUsage {
  public static void main(String[] args) {
    //
      CountDownLatch latch = new CountDownLatch(2);

      DevLatch dev1 = new DevLatch(latch,"dev1");
      DevLatch dev2 = new DevLatch(latch,"dev2");
      dev1.run();
      dev2.run();

  }
}
