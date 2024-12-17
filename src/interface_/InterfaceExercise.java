package interface_;

public class InterfaceExercise {
}
interface OP{
    int x=0;
}
class AL{
    int x=1;
}
class BL extends AL implements OP{
    public void getX(){
        System.out.println(OP.x+super.x);
    }

    public static void main(String[] args) {
        new BL().getX();
    }
}
