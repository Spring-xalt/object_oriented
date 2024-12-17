package Abstract_.practice;

public class BB {
    public void job1(){
        long count=0;
        long begin=System.currentTimeMillis();
        for (long i = 0; i < 1000000; i++) {
            count+=i/2;
        }
        long over=System.currentTimeMillis();
        System.out.println("BB需要时间为"+(over-begin));
    }
}
