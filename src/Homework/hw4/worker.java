package Homework.hw4;

public class worker extends person{
    public worker(String name,double baseSalary){
        super(name,baseSalary);
    }
    public double printSalary(){
        return getBaseMoney();
    }
}
