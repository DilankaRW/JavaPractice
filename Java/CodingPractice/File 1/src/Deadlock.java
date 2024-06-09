// Create a deadlock scenario programmatically in Java.

// Deadlock is a scenario in a multi-threaded Java environment where two or more threads are blocked forever. The deadlock situation arises with at two or more threads. The following example code creates a deadlock scenario
public class Deadlock {
    // Two resources
    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();

    public static void main(String[] args) {
        // Thread 1
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Locked resource 1");

                // Simulate some work with resource1
                try { Thread.sleep(50); } catch (InterruptedException e) {}

                System.out.println("Thread 1: Waiting for resource 2");

                synchronized (resource2) {
                    System.out.println("Thread 1: Locked resource 2");
                }
            }
        });

        // Thread 2
        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Locked resource 2");

                // Simulate some work with resource2
                try { Thread.sleep(50); } catch (InterruptedException e) {}

                System.out.println("Thread 2: Waiting for resource 1");

                synchronized (resource1) {
                    System.out.println("Thread 2: Locked resource 1");
                }
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();
    }
}

// Explanation
// Resources: Two static objects, resource1 and resource2, act as the shared resources.
// Threads:
// Thread 1: Locks resource1, then attempts to lock resource2.
// Thread 2: Locks resource2, then attempts to lock resource1.

// Deadlock Scenario
// Thread 1 locks resource1 and tries to lock resource2.
// Thread 2 locks resource2 and tries to lock resource1.
// Since both threads are holding one resource and waiting for the other, they get stuck, resulting in a deadlock.
// When you run this program, both threads will be blocked indefinitely, each waiting for the other to release a lock. This demonstrates a simple deadlock situation.