package Process_;

/**
 * 我亦无他，惟手熟尔
 */
public class FreeLock1 {
    public static void main(String[] args) {

    }
}
/*释放锁情形：1.其中一个线程完毕，自动释放锁
            2.在同步代码块，同步方法遇到break，return这些，不得已退出
            3.同步代码块或同步方法遇到error或者exception
            4.同步代码块或方法中出现了wait方法，使该线程暂停
*/
/*不会释放锁情形：1.若同步代码块或者同步方法出现线程yield，sleep则不会释放锁
               2.某线程若调用了suspend将本线程挂起则不会释放锁
*/