package Process_.TicketSelling;

/**
 * 我亦无他，惟手熟尔
 */

//多线程三窗口售票
public class Thread_implements {
    public static void main(String[] args) {
        Th t1=new Th();
        Th t2=new Th();
        Th t3=new Th();
        t1.start();
        t2.start();
        t3.start();
    }
}
class Th extends Thread{
    private static int Ticket=100;                          //private   确保数据安全，static保证数据变化
    @Override
    public void run() {
        while(Ticket>0){
            Ticket--;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(currentThread().getName()+"售出一张票"+"  剩余"+Ticket+"张票");
        }
    }
}

//Summary：用Thread则会导致多线程抢占  “余票" 这一共同资源, 导致余票显示故障,  也会导致票数超卖现象（最为严重的问题）
