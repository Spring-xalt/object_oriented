package TankGame.Event_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * 我亦无他，惟手熟尔
 */

//事件处理机制
public class BallMoving extends JFrame{                             //ballmoving要继承框架
    public static void main(String[] args) {
        new BallMoving();                                           //实例化ballmoving对象，进入程序
    }
    public BallMoving (){
        MyPanel mp=new MyPanel();                                   //在构造器中创建mypanel对象
        this.add(mp);                                               //将mp对象添加到ballmoving中去

        this.addKeyListener(mp);

        this.setSize(400,400);                         //设置框架大小
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);     //设置点“×”时释放程序
        this.setVisible(true);                                      //设置框架窗口可见
    }
}

//KeyLstener是一个监听器
class MyPanel extends JPanel implements KeyListener {                              //MyPanel面板继承JPanel面板


    int x=10,y=10;
    @Override
    public void paint(Graphics g) {                         //重写paint方法，用画笔画出所需内容
        super.paint(g);
        g.fillOval(x,y,10,10);
    }

    //当某个键输出会触发
    @Override
    public void keyTyped(KeyEvent e) {

    }

    //当某个键被点击
    @Override
    public void keyPressed(KeyEvent e) {
        //        System.out.println((char)e.getKeyCode()+"按键被触发");
        //根据不同的按键使小球移动
        if(e.getKeyCode()==KeyEvent.VK_DOWN){                           //VK_DOWN即为向下对应的键位
                                                                        //public static final int VK_DOWN= 0x28;
                                                                        //28对应于
            y+=5;
        }
        else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
            x+=5;
        }
        else if(e.getKeyCode()==KeyEvent.VK_UP){
            y-=5;
        }
        else if (e.getKeyCode()==KeyEvent.VK_LEFT){
            x-=5;
        }
        //让面板重绘
        this.repaint();
    }

    //当某个键被释放了
    @Override
    public void keyReleased(KeyEvent e) {

    }
}