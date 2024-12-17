package Homework.hw2;

public class bProfessor extends teachar {

    private double cs=1.2;
    public bProfessor(String name,int age,String post,double salary){
        super(name,age,post,salary);
    }
    public String introduce(){
        return this.getName()+"副教授,"+this.getAge()+"岁"+this.getPost()+"职称"+"工资职级:"+cs+"工资"+this.getSalary();
    }
}
