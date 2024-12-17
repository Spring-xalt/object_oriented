package Object_.inherit.main;

import java.util.Scanner;
//自动售货机
public class vendingMachine {
    private int price=49;
    private int balance=0;
    private int total=0;
        //若干个成员函数之间调用方法不用对象，也没有对象
            vendingMachine(){
            }
            vendingMachine(int price){
                this.price=price;
            }
            void setPrice(int price){
                this.price=price;
            }
            void showPrompt(){
                System.out.println("welcome");
            }
            void inMoney(int amount){
                balance+=amount;
            }
            void showBalance(){
                System.out.println("你现在余额为"+balance);
                showPrompt();
            }
            void sellFood(){
                if(balance>=price){
                    System.out.println("Here you are");
                    balance-=price;
                    total+=balance;
                    System.out.println("取走商品后余额为"+total);
                }
                else{
                    System.out.println("那么贵你配吗？");
                }

            }

        //主函数可以创建一个对象，在主函数内要vm.
        public static void main(String[]args){
            Scanner inputprice=new Scanner(System.in);
            int price=inputprice.nextInt();
            vendingMachine vm=new vendingMachine();
            vm.setPrice(price);
            vm.showPrompt();
            vm.showBalance();
            vm.sellFood();
    }
}

