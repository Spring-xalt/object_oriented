package Exercise;

public class employee {
    private String name;
    private double salary;

    public employee(double salary,String name) {
        this.salary = salary;
        this.name = name;
    }
    public double getAnnual(){
        return salary;
    }
}


class pu extends employee{
    public pu(double salary,String name) {
        super(salary,name);
    }

    public void work(){

    }
    public double getAnnul(){
        return 1.0;
    }
}


class jing extends employee{
    public jing(double salary,String name){
        super(salary,name);
    }

}