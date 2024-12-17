package Generics;

import com.sun.jdi.request.BreakpointRequest;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * 我亦无他，惟手熟尔
 */
@SuppressWarnings("all")
public class GenericsExercise {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("dzy",180000,new Mydate(2005,8,13)));
        list.add(new Employee("hk",20000,new Mydate(2004,11,25)));
        list.add(new Employee("fjm",21000,new Mydate(2005,2,13)));
        System.out.println("list="+list);
        System.out.println("--对员工进行排序，名字-->生日--");
        list.sort(new Comparator<Employee>() {           //int compare(T o1, T o2);
            @Override
            public int compare(Employee em1, Employee em2) {
                if (!(em1 instanceof Employee && em2 instanceof Employee)) {
                    System.out.println("类型不正确");
                    return 0;
                }
                int nameMinus = em1.getName().compareTo(em2.getName());
                if (nameMinus != 0) {
                    return nameMinus;
                }

                int yearMinus = em1.getBirthday().getYear() - em2.getBirthday().getYear();
                if (yearMinus != 0) {
                    return yearMinus;
                }
                int monthMinus = em1.getBirthday().getMonth() - em2.getBirthday().getMonth();
                if (monthMinus != 0) {
                    return monthMinus;
                }

                return em1.getBirthday().getDay() - em2.getBirthday().getDay();

            }
        });


    }
}
class Employee <MyDate>{
    private String name;
    private double salary;
    private Mydate birthday;

    public Employee(String name,double salary,MyDate mydate) {
        this.name = name;
        this.salary=salary;
        this.birthday=birthday;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Mydate getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", mydate=" + birthday +
                '}';
    }
}
