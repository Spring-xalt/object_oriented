package AlwaysUsedClass;

/**
 * 我亦无他，惟手熟尔
 */
public class StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("hello");//0开始
    //增 [直接在后面加上]
        s.append(',');
        s.append("杜泽雨");
        s.append(',');
        s.append("黄坤").append(";");//hello,杜泽雨,黄坤;
        System.out.println(s);

    //删 [删除从start到end(左闭右开)的元素]
        s.delete(6,8);//删除了索引6和7
        System.out.println(s);//hello,雨,黄坤;
        s.delete(6,8); //删除后后方元素自动前移
        System.out.println(s);//hello,黄坤;

    //改 [将start到end之间元素替换为“”内容,左闭右开]
        s.replace(6,8,"hk");        //比如6到8之间有2个位置，可以插入任意长度
        System.out.println(s);//hello,hk;

    //查 [查找指定子串在字符串中的位置，找不到则返回-1]
        System.out.println(s.indexOf("hk"));       //返回开始的下标

    //插 [在指定位置插入相应元素(字符或字符串)]
        System.out.println(s.insert(5,'-')); //hello-,hk;
    }
}
