package Process_;

/**
 * 我亦无他，惟手熟尔
 */
    //setName 设置线程名称，使之与name相同
    //getName 返回线程名称
    //start   开始线程，底层调用start0
    //run
    //setPriority设置线程优先级              MAX_PRIORITY 和 MIN_PRIORITY
    //getPriority获取线程优先级
    //sleep
    //interrupt线程中断

public class ThreadWay {
    public static void main(String[] args) throws InterruptedException {
        Th th = new Th();
        th.start();
        int i=1;
        for ( ; i < 21; i++) {
            System.out.println("主线程(小弟)吃了"+i+"个包子");
//            if(i==5){
//                th.join();                                          //插队机制
//            }
            if(i==5){
                Thread.yield();             //由于本人电脑cpu太拉跨，资源紧张，故礼让成功
            }
        }

    }
}

//Thread join和yield 线程插队
        //yiled线程礼让，但仍然不一定会礼让成功           根据cpu性能决定，故不常用
        //线程插队成功则一定会执行插队成功的那个线程的所有任务

class Th extends Thread{
    private int baozi=1;
    @Override
    public void run() {
        while(baozi<=20){
            System.out.println("子线程吃了"+baozi+"个包子");
            baozi++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
