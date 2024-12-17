package Generics;

import java.util.*;

/**
 * 我亦无他，惟手熟尔
 */
public class Generics3 {
    public static void main(String[] args) {
        //HashSet
        HashSet<Student> stu = new HashSet<Student>();
        stu.add(new Student("jack",18));
        stu.add(new Student("dzy",19));
        for(Student s:stu){
            System.out.println(s);
        }
        //HashMap
        HashMap<Integer, Student> hm = new HashMap<Integer,Student>();
        hm.put(1,new Student("hk",20));
        hm.put(2,new Student("cjm",21));
        Set<Map.Entry<Integer, Student>> entry = hm.entrySet();

        Iterator<Map.Entry<Integer, Student>> iterator = entry.iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,Student> next=iterator.next();
            System.out.println(next.getKey()+"-"+next.getValue());
        }
    }
}
class Student{
    private String name;
    private int age;

    public Student(String name,int age) {
        this.name = name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}