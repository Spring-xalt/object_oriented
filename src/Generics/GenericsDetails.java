package Generics;

import java.util.ArrayList;

/**
 * 我亦无他，惟手熟尔
 */


//泛型只能是引用数据类型，而不能是基本数据类型（即可以是Integer，String,但不能是int等等）
//指定其类型后，可以传入该类型或者传入其子类类型
//使用形式：ArrayList<String> objects = new ArrayList<>();或者ArrayList<String> objects = new ArrayList<>()
    //<E>如果默认用E，则默认传入Object
        //即ArrayList<Object> obj1 = new ArrayList<>();等价于ArrayList arrayList = new ArrayList();可传入任何数据
public class GenericsDetails {
    public static void main(String[] args) {
        Dog<A> dog1=new Dog<>(new A());         //本类型
        Dog<B> dog2 = new Dog<>(new B());       //子类类型
    }
}
class A{
}
class B extends A{
}
class Dog<E>{
    E e;
    public Dog(E e) {
        this.e = e;
    }
}