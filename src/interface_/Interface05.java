package interface_;

public class Interface05 {
    public static void main(String[] args) {
        //接口多态体现
        IF if1=new AAA();
        if1=new BBB();
        //类的多态实现
        Aa a=new Aa();
        a=new Bb();
    }
}
interface IF{ }
class AAA implements IF{ }
class BBB implements IF{ }


class Aa{ }
class Bb extends Aa{}