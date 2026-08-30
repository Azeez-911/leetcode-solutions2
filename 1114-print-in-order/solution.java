/*
 * LeetCode #1114 - Print in Order
 * Difficulty : Easy
 * Language   : java
 * Runtime    : 12 ms
 * Memory     : 44.16 MB
 * URL        : https://leetcode.com/problems/print-in-order/
 */

hat first() is completed
        firstDone.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        // Wait until first() completes
        firstDone.await();

        printSecond.run();

        // Tell third() that second() is completed
        secondDone.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {
        // Wait until second() completes
        secondDone.await();

        printThird.run();
    }
}