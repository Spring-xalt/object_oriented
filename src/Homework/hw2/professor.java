package Homework.hw2;

public class professor extends teachar {

    private double cs=1.3;
    public professor(String name,int age,String post,double salary){
        super(name,age,post,salary);
    }
    public String introduce(){
        return this.getName()+"教授,"+this.getAge()+"岁,"+this.getPost()+"职称,"+cs+"工资职级,"+this.getSalary()+"工资";
    }
}
