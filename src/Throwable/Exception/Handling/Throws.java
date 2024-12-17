package Throwable.Exception.Handling;

/**
 * 我亦无他，惟手熟尔
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**方法 -->main-->jvm机
 如果一个方法中的语句可能造成异常，但并不确定如何处理这种异常
 需要显式声明抛出异常，表明不处理异常，由方法的调用者处理
 用throws语句声明抛出异常的列表，可以是方法中产生的异常类型，也可以是它的父类
                        eg:ArrayOutOfBounds异常 ，可以抛出throws异常
 * */
public class Throws {
    public static void main(String[] args) {

    }
    public void hi() throws FileNotFoundException {
        FileInputStream f=new FileInputStream("d/");  //io输入流？
    }
}
