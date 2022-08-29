package example.thread.yuseon;

public class RunMultiThread {
    public static void main(String[] args) {
        RunMultiThread example = new RunMultiThread();
        example.checkMultiThread();
        
    }

    public void checkMultiThread() {
        long start = System.currentTimeMillis();
        MultiThread thread1 = new MultiThread(1);
        MultiThread thread2 = new MultiThread(2);
        MultiThread thread3 = new MultiThread(3);
        MultiThread thread4 = new MultiThread(4);
        MultiThread thread5 = new MultiThread(5);
        MultiThread thread6 = new MultiThread(6);
        MultiThread thread7 = new MultiThread(7);
        MultiThread thread8 = new MultiThread(8);
        MultiThread thread9 = new MultiThread(9);
        MultiThread thread10 = new MultiThread(10);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
            thread6.join();
            thread7.join();
            thread8.join();
            thread9.join();
            thread10.join();
            long end = System.currentTimeMillis();
            System.out.println("메소드 수행시간:"+(end-start)+"ms");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

