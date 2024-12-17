package SchoolWork.SchoolWork6;

/**
 * 我亦无他，惟手熟尔
 */
public class DateP {
    public static void main(String[] args) {
        java.util.Date[] dates =new java.util.Date[10];
        System.out.println(dates[0]);                           //对象为null，直接输出
        System.out.println(dates[0].toString());                //对象为空调用toString方法，抛出空指针异常
    }
}
