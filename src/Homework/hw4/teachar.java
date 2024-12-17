package Homework.hw4;

public class teachar extends person{
    private double classpay;
    private int days;

    public teachar(String name, double baseMoney, double classpay,int days) {
        super(name, baseMoney);
        this.classpay = classpay;
        this.days=days;
    }
    public double getExpay(){
        return days*classpay;
    }
    public teachar(String name, double baseSalary){
        super(name,baseSalary);
    }
    public double printSalry(){
        return getBaseMoney()+getExpay();
    }
}
