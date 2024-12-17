package Process_;

/**
 * 我亦无他，惟手熟尔
 */


public class Mydaemon_Thread {
    //守护线程属于是一个兜底的线程，最完美的守护线程是java的垃圾处理机制
    public static  void main(String[] args) throws InterruptedException {
        MyDaemonThread mydth= new MyDaemonThread();
        Thread thread=new Thread(mydth);

        thread.setDaemon(true); //设置为守护线程
        //如果想让主线程结束时，子线程也退出，释放程序
        //则需要将子线程设置为守护先后线程

        thread.start();


        for (int i = 1; i < 21; i++) {
            System.out.println("宝强在努力工作..."+i);
            Thread.sleep(100);
        }

    }
}
class MyDaemonThread implements Runnable{
    private int x=1;
    @Override
    public void run() {
        while(x<21){
            System.out.println("小三玩的正嗨..."+x);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
