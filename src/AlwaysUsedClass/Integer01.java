package AlwaysUsedClass;

/**
 * 我亦无他，惟手熟尔
 */
// ctrl+h打开源码
//拆箱与装箱是原始基本数据类型与他们的封装类之间转换
//jdk5之前是手动装箱拆箱
public class Integer01 {
    public static void main(String[] args) {
        //演示int-->integer的装箱和拆箱

            //手动
                //手动装箱:int-->Integer
                    int n=10;
                    //Integer t=new Integer(n);jdk9后已经被荒废
                    Integer integer = Integer.valueOf(n);//能走但不常用了
                //手动拆箱:Integer-->int
                    int i=integer.intValue();            //也不常用了

            //自动
                //自动装箱：int-->Integer
                    Integer integer2=n;
                //自动拆箱：Integer-->int
                    int j=integer2;

    }
}
