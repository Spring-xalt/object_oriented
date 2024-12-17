package TankGame.TankWar01;

/**
 * 我亦无他，惟手熟尔
 */

//父类tank
public class Tank {


    private int x;
    private int y;

    public Tank(int x,int y) {          //先来静止的tank
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
