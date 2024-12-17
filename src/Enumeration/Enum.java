package Enumeration;

/**
 * 我亦无他，惟手熟尔
 */

//枚举类关键：都是有限值
public class Enum {
    public static void main(String[] args) {

        System.out.println(Season.autumn);//访问变量用enum类名.常量对象
        System.out.println(Season.spring);
    }
}
//使用enum后
enum Season{
    //使用后直接enum代替class
    //多个变量间用“,”分隔,并且要求定义常量对象放在最前面
    spring("春天","nuan"),summer("夏天","re"),
    autumn("秋天","liang");

    private String name;
    private String descripition;

    //使用enum前

//    public static Season spring = new Season("春天", "温暖");
//    public static Season summer=new Season("xai","re");
//    public static Season autumn=new Season("qiu","liang");
//    public static Season winter=new Season("dong","leng");

    Season(String name, String description) {
        this.name = name;
        this.descripition=description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripition() {
        return descripition;
    }

    public void setDescripition(String descripition) {
        this.descripition = descripition;
    }
}