package AlwaysUsedClass;

/**
 * 我亦无他，惟手熟尔
 */
public class IntegerExercise {
    public static void main(String[] args) {
        Integer i1=127;//new Integer(127)
        Integer i2=127;
        System.out.println(i1==i2);// ==要判断指向的对象（地址）是否相同，还有对象所代表的内容
        System.out.println(i1.equals(i2));
    }
}
