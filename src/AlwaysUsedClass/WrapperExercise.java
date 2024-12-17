package AlwaysUsedClass;

/**
 * 我亦无他，惟手熟尔
 */
//三元运算符是一个整体，计算式要把精度提到表达式2的精度
public class WrapperExercise {
    public static void main(String[] args) {
        //包装类(以integer为例)-->String
        Integer n=100;
        String str1=n+"";
        String str2=n.toString();
        String str3=String.valueOf(n);

        //String-->包装类
        String x="100";
        Integer int1=Integer.parseInt(x);
        //Integer int2=new Integer(x);不再使用该表达
    }
}
