package Abstract_;

//abstract不能和static，final，private合用

// 1.static修饰的方法是静态方法，其可以直接被类所调用。
// 而abstract修饰的方法为抽象方法，即无方法体的方法，不能够被直接调用，
// 需要在子类或实现类中去编写完整的方法处理逻辑后才能使用。（abstract需要被重写之后才能使用）

//2.abstract需要被继承完成方法final表示无法被继承，冲突

//3.private只能在本类使用，不可能重写

public abstract class employee {
    private String name;
    private int id;
    private double salary;

    public employee(String name,int id ,double salary) {
        this.name = name;
        this.id=id;
        this.salary=salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void work();
}
class Manager extends employee{
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    public void work(){
        System.out.println("经理"+getName()+"工作中...");
    }
}

