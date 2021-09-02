package main.topFifty.deadlock;

public class Deadlock {
    static final String resource1 = "resource1";
    static final String resource2 = "resource2";

    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1 lock resource1");
                synchronized (resource2) {
                    System.out.println("Thread 1 lock resource2");
                }
            }
        }).start();

        new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2 lock resource2");
                synchronized (resource1) {
                    System.out.println("Thread 2 lock resource1");
                }
            }
        }).start();
    }
}
