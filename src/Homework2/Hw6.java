package Homework2;

/**
 * 我亦无他，惟手熟尔
 */
public class Hw6 {
    public static void main(String[] args) {

    }
}
enum color implements IT{
    red(255,0,0),blue(0,0,255),
    black(0,0,0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    color(int redValue,int greenValue,int blueValue) {
        this.redValue = redValue;
        this.greenValue=greenValue;
        this.blueValue=blueValue;
    }
    @Override
    public void show() {
        System.out.println(this.redValue+this.blueValue+this.greenValue);
    }
}
interface IT{
    public void show();
}