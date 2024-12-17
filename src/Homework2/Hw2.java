package Homework2;

/**
 * 我亦无他，惟手熟尔
 */
public class Hw2 {
    public static void main(String[] args) {
        Animal cat =new Cat();
        Animal dog=new Dog();
        cat.shout();
        dog.shout();
    }
}
abstract class Animal{
    abstract void shout();
}
class Cat extends Animal{
    public void shout(){
        System.out.println("喵喵叫...");
    }
}
class Dog extends Animal{
    public void shout(){
        System.out.println("汪汪叫...");
    }
}