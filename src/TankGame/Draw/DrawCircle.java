package TankGame.Draw;

import javax.swing.*;
import java.awt.*;

//paint配置组件和外观
//repaint刷新组件和外观

/**
 * 我亦无他，惟手熟尔
 */
public class DrawCircle extends JFrame{             //继承一个框架，创建一个框架类
    //定义一个面板（画板）
    private MPanel mp;
    public static void main(String[] args) {
        new DrawCircle();
    }
    public DrawCircle(){
        mp=new MPanel();
        //再把面板放入框架中去
        this.add(mp);
        //设置窗口大小
        this.setSize(200,200);

        /*
        该程序在关闭窗口后并未释放程序，需要引入sleep机制
        * */
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);         //此处对应窗口的"×"

        //确保框架（窗口可视）
        this.setVisible(true);

        //?此处并未调用paint方法,说明被隐式调用了
        //只有在窗口大小(最小化到最大化变化也会(-))变化以及repaint方法被调用时才会调用paint



    }
}

//创建和一个画板类
class MPanel extends JPanel {

    //Graphics g作为一个画笔
    //Graphics提供了许多绘图方法
    @Override
    public void paint(Graphics g) {
        super.paint(g);                 //调用父类的方法完成初始化
        //System.out.println("paint方法被调用");

        //绘图方法
            //列举常用方法
            g.drawOval(50,50,50,50);  //画椭圆

            //画直线
            g.drawLine(5,5,7,7);
            //画矩形边框
            g.drawRect(50,50,10,10);
            //填充矩形边框
            g.fillRect(10,10,100,100);
            //填充椭圆边框
            g.fillOval(5,5,7,7);
            //画图片
            //1.获取图片
            Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/ppp.png"));
            //用draw方法显示
            g.drawImage(image,10,10,1366,754,this);

            //画字符串
            g.drawString("str",5,6);

            //设置画笔颜色
            g.setColor(Color.red);


    }

}