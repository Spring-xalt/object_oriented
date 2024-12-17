package SchoolWork;


import java.util.Scanner;

/**
 * 我亦无他，惟手熟尔
 */
public class SchoolWork2 {
    public static void main(String[] args) {
        Scanner ms=new Scanner(System.in);
        System.out.println("请默认输入最复杂直线情况..");
        System.out.println("输入p0 (x0,y0): ");
        double x0 = ms.nextDouble();
        double y0 = ms.nextDouble();

        System.out.println("输入p1 (x1,y1): ");
        double x1 = ms.nextDouble();
        double y1 =ms.nextDouble();

        System.out.println("输入p2 (x2,y2): ");
        double x2 =ms.nextDouble();
        double y2 =ms.nextDouble();
        leftOfTheLine(x0,y0,x1,y1,x2,y2);
        onTheSameLine(x0,y0,x1,y1,x2,y2);
        onTheRightLine(x0,y0,x1,y1,x2,y2);
    }
    public static boolean leftOfTheLine(double x0,double y0,double x1,double y1,double x2,double y2){
        double k0=(y1-y0)/(x1-x0);
        double k1=(y0-y2)/(x0-x2);
        double k2=(y1-y2)/(x1-x2);
        return (k1<k0&&k2>k0)?true:false;
    }
    public static boolean onTheSameLine(double x0,double y0,double x1,double y1,double x2,double y2){
        double k0=(y1-y0)/(x1-x0);
        double k1=(y0-y2)/(x0-x2);
        double k2=(y1-y2)/(x1-x2);
        return (k1==k0&&k2==k0&&k2!=0)?true:false;
    }
    public static boolean onTheRightLine(double x0,double y0,double x1,double y1,double x2,double y2){
        double k0=(y1-y0)/(x1-x0);
        double k1=(y0-y2)/(x0-x2);
        double k2=(y1-y2)/(x1-x2);
        return (k1<k0&&k2<k0)?true:false;
    }
}
