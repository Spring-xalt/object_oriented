package Object_.inherit.begining;

public class graduate extends inherit_ {
    public String name;
    public int age;
    private double grade;
    public void setGrade(double grade) {
        this.grade = grade;
    }
    public void testing(){
        System.out.println("大学生"+name+"正在考试...");
    }
    public void showInfo(){
        System.out.println("大学生"+name+ "年龄："+age+"成绩："+grade);
    }
}
