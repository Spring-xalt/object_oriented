package Object_.inherit.begining;

public class pupul extends inherit_ {
    public String name;
    public int age;
    private double grade;

    public void setGrade(double grade) {
        this.grade = grade;
    }
    public void testing(){
        System.out.println("小学生"+name+"正在考试...");
    }
    public void showInfo(){
        System.out.println("小学生"+name+ "年龄："+age+"成绩："+grade);
    }
}
