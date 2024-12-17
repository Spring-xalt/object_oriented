package Gather.Map.MapIn;

import java.util.*;

/**
 * 我亦无他，惟手熟尔
 */
public class MapExercise1 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(1,new Employee("dzy",15000,1));
        map.put(2,new Employee("hk",4800,2));
        map.put(1,new Employee("cjm",48500,3));
        Set keySet=map.keySet();
            System.out.println("第一种KeySet增强for实现");
            for(Object obj:keySet){
                Employee emp=(Employee)map.get(obj);                        //map.get()，得到的是value，传进去的是索引
                if(emp.getSalary()>18000){
                    System.out.println(emp);
                }
            }

//            System.out.println("第二种方法keySet迭代器实现");
//            Iterator it0=keySet.iterator();
//            while(it0.hasNext()){
//                Employee employee=(Employee)it0.next();
//                if(employee.getSalary()>18000){
//                    System.out.println(employee);
//                }
//            }

//            System.out.println("第三种方法entrySet-for增强实现");
//            Set entrySet0=map.entrySet();
//            for(Object obj0:entrySet0){
//                //Object类里不能直接获取employee里的getSalary,再向下转型为Map.Entry
//                Map.Entry m0=(Map.Entry)obj0;
//                Employee em0=(Employee)m0;
//                if(em0.getSalary()>18000){
//                    System.out.println(m0.getKey()+"-"+m0.getValue());
//                }
//            }

            System.out.println("第二种entrySet迭代器实现");
            Set entrySet=map.entrySet();
            Iterator it=entrySet.iterator();
            while(it.hasNext()){
                Map.Entry m=(Map.Entry)it.next();
                Employee em=(Employee)m.getValue();
                if(em.getSalary()>18000){
                    System.out.println(m.getKey()+"-"+m.getValue());
                }
            }

    }
}
class Employee{
    private String name;
    private double salary;
    private long id;

    public Employee(String name,double salary,long id) {
        this.name = name;
        this.salary=salary;
        this.id=id;
    }
    public long getId() {
        return id;
    }
    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}