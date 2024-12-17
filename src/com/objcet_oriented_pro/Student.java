package com.objcet_oriented_pro;
//面向对象:一种特殊的数据结构，可以定义对象的属性(成员变量)，可以定义方法(成员方法);
//类与对象的代码
public class Student {
    String name;
    double chin;
    double math;
    public void printtotalGrade(){
        System.out.println(name+"同学的总成绩是"+(chin+math));
    }
    public void printaverageGrade(){
        System.out.println(name+"同学的平均成绩是"+(chin+math)/2.0);
    }
}
//注意事项:   1.类名首位大写，遵循java命名规则
//          2.对象属性即成员变量，对象行为即成员方法
//          3.成员变量本身存在默认值（不需要设置初始值），就算赋值也没有意义：字符串（null）
//          4.可以有多个class，但只能有一个由pubulic修饰,public修饰的类名必须为代码名1
//          5.对象与对象之间不会相互影响，但多个变量指向一个对象会影响
class phone{

}
class girls{
}
