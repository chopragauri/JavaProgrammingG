package mod3_assignment;

public class Q10 {
        public static void main(String[] args) {
            FileDownloadThread download = new FileDownloadThread();
            download.start();
            try {
                Thread.sleep(5000);
                System.out.println("Requesting to stop download...");
                download.stopDownload();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    class FileDownloadThread extends Thread {
        private volatile boolean running = true;

        @Override
        public void run() {
            int chunk = 1;
            while (running) {
                System.out.println("Downloading chunk " + chunk);
                chunk++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Download stopped.");
        }
        public void stopDownload() {
            running = false;
        }
    }

