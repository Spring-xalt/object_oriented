package Enumeration;

public class Free {
    public static void main(String[] args) {
        System.out.println(Season1.autumn);//cn

    }
}
//自定义枚举
/**1.构造器私有化，防止数据被改变new
 * 2.去掉setXXX方法，保证数据安全
*/
class Season1{
    private String name;
    private   String descripition;
    public static Season1 spring=new Season1("chun","nuan");
    public static Season1 summer=new Season1("xai","re");
    public static Season1 autumn=new Season1("qiu","liang");
    public static Season1 winter=new Season1("dong","leng");
    private Season1(String name,String description) {
        this.name = name;
        this.descripition=description;
    }

    public  String getName() {
        return name;
    }
    public  String getDescripition() {
        return descripition;
    }


}