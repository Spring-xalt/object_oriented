package com.objcet_oriented_pro;

public class test {

    public static void main(String[] args){
        //创建s1对象，封装s1数据
        Student s1=new Student();
        s1.name="杜泽雨";
        s1.chin=100.0;
        s1.math=99.0;
        s1.printtotalGrade();
        s1.printaverageGrade();

        //创建s2对象，封装s2数据
        Student s2=new Student();
        s2.name="黄坤";
        s2.chin=75.0;
        s2.math=95.0;
        s2.printtotalGrade();
        s2.printaverageGrade();

        System.out.println(s1);
        System.out.println(s2);
    }
}
