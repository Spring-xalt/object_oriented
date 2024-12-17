package TankGame.TankWar01;

import javax.swing.*;

/**
 * 我亦无他，惟手熟尔
 */
public class TankFrame extends JFrame {
    private MyPanel mp;
    public TankFrame(){
        mp=new MyPanel();
        this.add(mp);
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new TankFrame();
    }
}
