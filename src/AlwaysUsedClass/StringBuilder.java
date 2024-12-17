package AlwaysUsedClass;

/**
 * 我亦无他，惟手熟尔
 */
public class StringBuilder {
    public static void main(String[] args) {
        //与StringBuffer兼容，但不保证同步，不是线程安全的，用于字符串缓冲区被单个使用
        //如果能用，优先使用，效率更高
        //在StringBuilder上主要操作时append和insert方法，可重载这些方法，来接收任意形式数据

        //String  StringBuffer  StringBuilder 区别

        //String不可变字符序列，效率较低，但复用率高
        //StringBuffer 可变字符序列,效率高（增删），线程安全
        //StringBuilder 可变字符序列,效率最高但线程不安全

    }
}
