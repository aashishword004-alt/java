class pq extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                Thread.yield();
                System.out.println("Thread is yield at i = " + i+i);
            }
            System.out.println("Exit from loop 1");
        }
    }
}

class pqr extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            if (j == 3) {
                System.out.println("Thread is stopped at j = " + j+j);
                return; // safe stop
            }
            System.out.println("Exit from loop 2");
        }
    }
}

class xyz extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            if (k == 1) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread is sleep at k = " + k);
            }
            System.out.println("Exit from loop 3");
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        pq t1 = new pq();
        pqr t2 = new pqr();
        xyz t3 = new xyz();

        t1.start();
        t2.start();
        t3.start();
    }
}
