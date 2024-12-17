package Homework.hw3;

public class person {
    private String name;
    private double sinSalary;
    private int days;

    public person(String name,double sinSalary,int days) {
        this.name = name;
        this.days=days;
        this.sinSalary=sinSalary;
    }

    public double printSalary(){
        return days*sinSalary;
    }
    public static void main(String[]args){
        person MA=new boss("马云",15000.0,15);
        System.out.println(MA.printSalary());

        person me=new em("fjm",1500.0,31);
        System.out.println(me.printSalary());
    }
}
