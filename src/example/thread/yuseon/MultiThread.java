package example.thread.yuseon;

public class MultiThread extends Thread{
    int id;

    public MultiThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            long start = System.currentTimeMillis();
            System.out.println("sleeping " + id);
            Thread.sleep(1000);
            System.out.println("stopping " + id);
            long end = System.currentTimeMillis();
            System.out.println("Thread - "+id +" 수행시간:"+(end-start)+"ms");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
