package TankGame.TankWar01;

import javax.swing.*;
import java.awt.*;

/**
 * 我亦无他，惟手熟尔
 */

//战斗区域
public class MyPanel extends JPanel {
    private Mytank mytank ;
    public MyPanel(){
        mytank=new Mytank(50,50);           //初始化位置
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.CYAN);
        g.fillRect(0,0,1000,750);
        paintTank(mytank.getX(), mytank.getY(),g,1,1);
    }
    public void paintTank(int x,int y,Graphics g,int direction,int type){
                        //x y表示坦克左上角坐标
                        //g是画笔
                        //向上1，向下-1，向左-2，向右2
                        //1表示我的坦克，-1表示敌军坦克
        switch(direction){
            case 1: g.fill3DRect(x,y,5,30,false);
                    g.fill3DRect(x+5,y+5,15,20,false);
                    g.fill3DRect(x+20,y,5,30,false);
                    g.fillOval(x+5,y+7,15,15);
                    g.drawLine(x+10,y+2,x+13,y+13);
            break;

            default:
                System.out.println("暂不处理");
        }
        switch(type){
            case 1:g.setColor(Color.BLACK);break;

            case -1:g.setColor(Color.red);break;
        }

    }
}
