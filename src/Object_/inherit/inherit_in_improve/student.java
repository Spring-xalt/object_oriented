package Object_.inherit.inherit_in_improve;
//inherit:   pupul和graduate都是student的子类,test是测试类
public class student{
    public String name;
    public int age;
    private double grade;
    public void setGrade(double grade) {
        this.grade = grade;
    }
    public void showInfo() {
        System.out.println("学生:"+name+ "  年龄："+age+"  成绩："+grade);
    }
}
