package Homework.hw2;

public class teachar {
    private String name;
    private int age;
    private String post;
    private double salary;
    public String introduce(){
        return name+"教师,"+age+"岁"+post+"工资为："+salary;
    }

    public teachar(String name,int age,String post,double salary) {
        this.name = name;
        this.age=age;
        this.post=post;
        this.salary=salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getPost() {
        return post;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
