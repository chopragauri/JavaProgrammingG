package mod3_assignment;

public class Q6 {
        public static void main(String[] args) {
            // Daemon Thread
            Thread autoSaveThread = new Thread(() -> {
                try {
                    while (true) {
                        System.out.println("[Daemon] Auto-Save in progress...");
                        Thread.sleep(3000);
                    }
                } catch (InterruptedException e) {
                    System.out.println("Daemon thread interrupted.");
                }
            });

            autoSaveThread.setDaemon(true);
            autoSaveThread.start();
            System.out.println("[Main] File processing started...");
            for (int i = 1; i <= 5; i++) {
                System.out.println("[Main] Processing file chunk " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Main thread interrupted.");
                }
            }
            System.out.println("[Main] File processing completed.");
        }
    }

