package Homework.hw1;

public class homework1 {
    public static void main(String[]args){
        Person[] p=new Person[3];
        p[0]= new Person("dzy",18,"java");
        p[1]= new Person("zy",19,"c");
        p[2]= new Person("y",20,"ca");
            Person temp=null;
        System.out.println("排序前：");
        for(int i=0;i<p.length;i++){
            System.out.println(p[i]);
        }
            for(int i=0;i<p.length-1;i++){
                for(int j=0;j<p.length-1-i;j++){
                    if(p[j].getAge()<p[j+1].getAge()){
                        temp=p[j];
                        p[j]=p[j+1];
                        p[j+1]=temp;
                    }
                }
            }
        System.out.println("排序后");
            for(int i=0;i<p.length;i++){
                System.out.println(p[i]);
            }
    }
}
class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name,int age,String job) {
        this.age = age;
        this.job=job;
        this.name=name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", job='" + job + "'}";
    }
}