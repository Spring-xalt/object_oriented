package Homework.hw4;

public class cs extends person{
    private double yearAdd;
    public cs(String name , double baseSalary,double yearAdd){
        super(name,baseSalary);
        this.yearAdd=yearAdd;
    }
    public double getYearAdd() {
        return yearAdd;
    }
    public double printSalary(){
        return getBaseMoney()+getYearAdd();
    }
}
