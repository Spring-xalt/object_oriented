package Process_;

/**
 * 我亦无他，惟手熟尔
 */

//创建线程第一种方式：继承thread类，重写run方法
    //Thread 实现了runnable接口



    //主线程名就叫main，其他叫Thread-n（0到n）
        //不一定主线程（方法）结束就会释放程序，需要等到所有线程结束才会退出程序
public class Thread1 {
    public static void main(String[] args) {
        Cat cat=new Cat();
        //cat.run();        //如果此处直接调用run方法只是一个普通的方法，不会启动一个线程，相反会阻塞主线程（方法），仅仅会在第二线程结束后才会进行主线程，随后释放程序
        cat.start();        //直接调用start方法则不会出现该问题？此处则不会阻塞主线程，二者会交替执行，至于如何交替，看电脑的配置与jvm调优性能如何
                                //接着进入start0()方法,最终隐式调用run方法(其实最本源的是runnable下面有abstract的run方法)
                                        /*
                                            public synchronized void start() {  //此方法不能被主线程或者system调用
                                                if (threadStatus != 0)
                                                    throw new IllegalThreadStateException()；
                                                group.add(this);

                                                boolean started = false;
                                                try {
                                                    start0();
                                                    started = true;
                                                } finally {
                                                    try {
                                                        if (!started) {
                                                            group.threadStartFailed(this);
                                                        }
                                                    } catch (Throwable ignore) {

                                                    }
                                                }
                                            }

                                         */

                                        /*
                                          @Override
                                            public void run() {
                                                if (target != null) {
                                                    target.run();
                                                }
                                            }
                                         */
        for (int i = 1; i < 11; i++) {
            System.out.println("主线程第"+i+"次实现");
        }
    }
}
class Cat extends Thread implements Runnable {
    @Override
    public void run() {
        int count=1;
        //super.run();重写该方法，改逻辑
        /*
            @Override
            public void run() {
                if (target != null) {
                    target.run();
                }
            }
        */
        while(count<11){
            //每隔半秒输出信息
            System.out.println("第二线程:喵喵叫第"+count+"次");
            count++;
            //让该线程休眠一秒
            try {                                               //此处try_catch是为了在休眠时仍然能够感知响应
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}