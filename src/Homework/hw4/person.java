package Homework.hw4;

public class person {
    private String name;
    private double baseMoney;
    public person(String name,double baseMoney) {
        this.baseMoney = baseMoney;
        this.name=name;
    }
    public double getBaseMoney(){
        return baseMoney;
    }
    public static void main(String[]args){
        person p=new worker("dzy",1500);
        System.out.println(((worker) p).printSalary());
    }
}
