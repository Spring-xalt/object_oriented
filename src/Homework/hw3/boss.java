package Homework.hw3;

public class boss extends person{
    public boss(String name,double sinSalary,int days){
        super(name,sinSalary,days);
    }
    public double printSalary(){
        return 1000.0+super.printSalary();
    }
}
