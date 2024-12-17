package SmallChangesys;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 我亦无他，惟手熟尔
 */
public class Smallchangesys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        work w = new work();
        String key = "";

        System.out.println("\n========零钱通菜单========");
        System.out.println("1 零钱通明细");
        System.out.println("2 收益入账");
        System.out.println("3 消费");
        System.out.println("4 退出");
        System.out.println("请选择1-4");

        key = scanner.next();
        switch (key) {
            case "1":
                w.detail();
                break;
            case "2":
                w.income();
                break;
            case "3":
                w.pay();
                break;
            case "4":
                w.exit();
                break;
            default:
                System.out.println("选择错误，请重新选择");
        }
    }
}




// 零钱通功能实现部分
class work {

    // 属性区
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String details = ".......明细.......";
    double money = 0;
    double balance = 0;
    Date date = null; // 获取当前时间的包
    String note = "";

    // 方法区
    // 菜单
    public void menu() {
        System.out.println(".......零钱通........");
    }

    // 明细
    public void detail() {
        System.out.println(details);
    }

    // 收益
    public void income() {
        System.out.println("收益入账金额");
        money+=scanner.nextDouble();
        if (money <= 0) {
            System.out.println("收益入账金额需要大于0");
            return;
        }
        balance += money;
        date = new Date();
        details += "\n收益入账\t" + money + "\t" + getFormattedDate(date) + "\t" + balance;
        System.out.println("当前余额为："+balance);
    }

    // 获取格式化日期
    public String getFormattedDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

    // 消费
    public void pay() {
        System.out.println("消费金额");
        money = scanner.nextDouble();
        if (money <= 0 || money > balance) {
            System.out.println("您的消费金额应该在 0-" + balance);
            return;
        }
        System.out.println("消费说明");
        note = scanner.next();
        balance -= money;
        date = new Date();
        details += "\n消费\t" + money + "\t" + getFormattedDate(date) + "\t" + balance;
    }

    // 退出
    public void exit() {
        String choice = "";
        while (true) {
            System.out.println("你确定退出吗y/n");
            choice = scanner.next();
            if ("y".equals(choice)) {
                loop = false;
                return;
            } else if ("n".equals(choice)) {
                return;
            }
        }
    }
}
