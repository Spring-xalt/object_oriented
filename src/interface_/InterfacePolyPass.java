package interface_;

/**
演示接口多态传递现象
 */
public class InterfacePolyPass {
    public static void main(String[] args) {
        //接口类型的变量可以指向实现了该接口的对象实例(上一届多态)
        IG ig=new teachar();
        //IH ih=new teachar(); 错误
        //IH本来无法使用，若ig ih之间继承，则可以传递
        IH ih=new teachar();
        }
}
interface IG extends IH{}
interface IH{}
class teachar implements IG{}