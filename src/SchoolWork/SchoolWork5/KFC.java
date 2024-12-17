package SchoolWork.SchoolWork5;

/**
 * 我亦无他，惟手熟尔
 */
public class KFC {
    public static void main(String[] args) {
        User user = new User("l","warm",true,"2");  //大汉堡 温可乐，堂食

        System.out.println("请问您是本店会员吗?");
        VIP vip = new VIP(true);

        if(vip.isVip()){                                           //是本店会员
            vip.setHasvipNumber(false);                            //不记得会员号码
            System.out.println("你可以输入名字来选择加入姓氏，电子邮件，手机号码");
            vip.setFirstName("吉明");
            vip.setLastName("范");
            vip.setPhoneNumber("9109223019");
            System.out.println("你将会获得一条短信或电子邮件");
            System.out.println("您可以会员价支付或者消耗积分");
        }
        else{
            System.out.println("请正常付款");
        }

        //需要修改菜品以及价格时
        Pay foodChange = new Pay("m","cold",false,"1");
        //重新选定购买多少价格的菜品
        foodChange.setHamberger(20);
        foodChange.setPepsi(5);


    }
}
class User extends Prices{
    public User(String hamberger, String pepsi, boolean kfc,String spicy) {
        super(hamberger, pepsi, kfc,spicy);
    }
}
class Prices{                                                           //1.餐点选择
    private String hamberger;         //l  m   s
    private String pepsi;             //warm  cold
    private boolean kfc;              //false(带走) true

    private String Spicy;                  //辣度：1微辣，2重辣
    public Prices(String hamberger,String pepsi,boolean kfc,String spicy) {
        this.hamberger = hamberger;
        this.pepsi=pepsi;
        this.kfc=kfc;
        this.Spicy=spicy;
    }
    public String getHamberger() {
        return hamberger;
    }
    public String getPepsi() {
        return pepsi;
    }
    public boolean isKfc() {
        return kfc;
    }
    public String getSpicy() {
        return Spicy;
    }
}
class VIP{                                                              //会员系统
    private boolean isVip;
    private boolean hasvipNumber;
    String firstName;
    String lastName;
    String phoneNumber;
    public VIP(boolean isVip) {
        this.isVip = isVip;
    }
    public boolean isVip() {
        return isVip;
    }
    public void setHasvipNumber(boolean hasvipNumber) {
        this.hasvipNumber = hasvipNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
class Pay extends Prices{                                               //支付系统
    public Pay(String hamberger, String pepsi, boolean kfc,String spicy) {
        super(hamberger, pepsi, kfc,spicy);
    }
    private int hamberger=50;
    private int pepsi=25;

    //修改食物价格
    public void setHamberger(int hamberger) {
        this.hamberger = hamberger;
    }
    public void setPepsi(int pepsi) {
        this.pepsi = pepsi;
    }
}
class SpicySum {                                                         //辣度统计系统
    private int ssum=0;
    private int lsum=0;


    public int getSsum() {
        User user = new User("l","warm",true,"2");      //内存限制，只创建一个对象
        if(user.getSpicy()=="1"){
            ssum++;
        }
        return ssum;
    }

    public int getLsum() {
        User user = new User("l","warm",true,"2");      //内存限制，只创建一个对象
        if(user.getSpicy()=="2"){
            lsum++;
        }
        return lsum;
    }

}