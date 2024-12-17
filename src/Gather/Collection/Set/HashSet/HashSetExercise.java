package Gather.Collection.Set.HashSet;

import java.util.HashSet;
import java.util.Objects;

/**
 * 我亦无他，惟手熟尔
 */
public class HashSetExercise {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("李荣浩",20,new MyDate(1997,02,17) ));
        hashSet.add(new Employee("dzy",19,new MyDate(2005,02,13)));
        hashSet.add(new Employee("李荣浩",18,new MyDate(1997,02,17)));
        System.out.println("hashset="+hashSet);
    }
}
class Employee  {
    private String name;
    private int age;
    private MyDate birthday;
    public Employee(String name,int age,MyDate birthday) {
        this.name = name;
        this.age=age;
        this.birthday=birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(birthday, employee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }
}
class MyDate{
    private int year;
    private int month;
    private int day;

    public MyDate(int year,int month,int day) {
        this.year=year;
        this.month=month;
        this.day=day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}