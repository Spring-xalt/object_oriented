package Object_.inherit.inherit_in_improve;

public class test extends student{
    public static void main(String[]args){
        Object_.inherit.inherit_in_improve.test p=new  Object_.inherit.inherit_in_improve.test();
        p.name="银角大王";
        p.age=15;

        p.setGrade(60.0);
        p.showInfo();

        Object_.inherit.inherit_in_improve.test g=new Object_.inherit.inherit_in_improve.test();
        g.name="金角大王";
        g.age=22;

        g.setGrade(90);
        g.showInfo();
    }
}
