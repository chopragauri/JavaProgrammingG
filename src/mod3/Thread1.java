package mod3;
class Thread1 extends Thread {
//    Thread1(String Thread) {
//        super(Thread);
//    }

    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread1 t2 = new Thread1();
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName());
        }
        t1.start();
        t2.start();
    }
}