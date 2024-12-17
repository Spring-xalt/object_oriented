package Process_;

/**
 * 我亦无他，惟手熟尔
 */
//1.NEW             尚未启动的线程
//2.RUNNABLE        在jvm中执行的线程
//3.BLOCKED         被阻塞等待监视器锁定的线程
//4.WAITING         正在等待特定线程执行特定动作的线程
//5.TIMED_WAITING   等待一个线程的执行动作到达指定时间的(计时等待)
//6.TERMINATED      已退出的线程
    /*顺序讲解： 1.new 一个线程但未调用start方法(start0)
               2.被线程调度器执行过程中    2
                                    有两个细化状态：ready和running
                                                    running中的线程一旦被让步yeild或者被挂起会变为ready
                                                    ready一旦被线程调度器唤醒，就会变为running
               3,4,5:
                 等待进入同步代码块的锁，会在5状态获得锁
                 wait(),join(),LockSupport.park()会进入4状态，再用notify(),notifyAll(),LockSupport.unpark()进入2状态
                 sleep()(最常用)时间结束即会退出
               6.ok了

        */
public class ThreadSevenState {
    public static void main(String[] args) {
        B b=new B();
        System.out.println(b.getName()+"的目前状态是"+b.getState());
        b.start();
        if(b.getState()!= Thread.State.TERMINATED){
            for (int i = 0; i < 20; i++) {
                System.out.println(b.getName()+"的第"+(i+1)+"状态是"+b.getState());
            }
        }
        System.out.println(b.getName()+"的目前状态是"+b.getState());
    }
}
class B extends Thread{
    private int i=0;
    @Override
    public void run() {
        while(true){
            for(int i=0;i<21;i++){
                System.out.println(++i);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            break;
        }
    }
}