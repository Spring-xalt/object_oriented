package Process_.TicketSelling;

/**
 * 我亦无他，惟手熟尔
 */
public class Runnable_implements {
    public static void main(String[] args) {
        Run r=new Run();                    //此处一个Run对象对相应多个线程，是相较于thread的优势所在
        Thread thread1=new Thread(r);
        Thread thread2=new Thread(r);
        Thread thread3=new Thread(r);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
class Run implements Runnable{
    private boolean loop=true;
    private static int Ticket = 100;
    public synchronized void sell(){
            Ticket--;
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+"窗口售出一张票"+"剩余"+Ticket+"张票");
            if(Ticket==0){
                System.out.println("票已售罄...");
                loop=false;
            }

    }
    @Override
    public void run() {
       while(loop){
           sell();
       }
    }

}
//由于多个线程都进入了方法，但在--后 其他线程同样进入了程序中去，可能导致超卖,需要上锁