package Enumeration;

/**
 * 我亦无他，惟手熟尔
 */

//本节讲述enum成员方法
public class Enum3 {
    public static void main(String[] args) {
        Season season=Season.spring;

        //toString()返回对象的属性信息
        System.out.println(season.toString());//

        //返回枚举对象name名称
        System.out.println(season.getName());

        //返回当前对象的位置号,从0开始编号(根据逗号所规定的位置确定)
        System.out.println(season.ordinal());//0

        //values()返回枚举类所有常量
        //反编译看出返回values对应的Season[]
        Season[] values=Season.values();
//        for(int i=0;i<values.length;i++){//普通for
//            System.out.println(values[i]);
//        }
        for(Season i:values){//增强for
            System.out.println(i);
        }

        //valueOf()将字符串转化为枚举对象，要求字符串必须为已有的变量名，否则报异常

        //compareTo()，比较两个常量，比较的就是位置号
    }
}
