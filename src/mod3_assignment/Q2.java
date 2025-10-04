package mod3_assignment;

public class Q2 implements Runnable {

        private String text;
        public Q2(String text) {
            this.text = text;
        }

        @Override
        public void run() {
            for (int i = text.length() - 1; i >= 0; i--) {
                System.out.println(text.charAt(i));
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted.");
                }
            }
        }

        public static void main(String[] args) {
            Q2 input = new Q2("MULTITHREADING");
            Thread thread = new Thread(input);
            thread.start();
        }
    }

