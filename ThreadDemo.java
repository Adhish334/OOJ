class DisplayThread extends Thread {
    private String message;
    private int interval;

    public DisplayThread(String message, int interval) {
        this.message = message;
        this.interval = interval;
    }

    public void run() {
        try {
            while (true) {
                System.out.println(message);
                Thread.sleep(interval * 1000); // Convert seconds to milliseconds
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        // Create and start thread for "BMS College of Engineering" message
        DisplayThread thread1 = new DisplayThread("BMS College of Engineering", 10);
        thread1.start();

        // Create and start thread for "CSE" message
        DisplayThread thread2 = new DisplayThread("CSE", 2);
        thread2.start();
    }
}
