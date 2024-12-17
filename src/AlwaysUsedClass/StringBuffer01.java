package AlwaysUsedClass;

/**
 * 我亦无他，惟手熟尔
 */
public class StringBuffer01 {
    public static void main(String[] args) {
        String s=new String("");
        for (int i = 0; i < 8000; i++) {
            s+="hello";
        }   //String类型每次保存的是字符串常量，每次更改都要改变地址，效率较低

        StringBuffer02 stringBuffer = new StringBuffer02();
        //StringBuffer的直接父类是AbstractStringBuffer,是final类，无法被继承
        //实现了Serializable,使其对象可以串行化
        //在父类中有char[] value数组，不是final类型，实现String可变,

            //StringBuffer保存的是字符串变量，每次都可以更行内容，而不更新地址效率较高,char[]value保存在堆区

    }
}
