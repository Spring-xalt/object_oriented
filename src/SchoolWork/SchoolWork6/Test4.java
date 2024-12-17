package SchoolWork.SchoolWork6;

import java.util.Date;

/**
 * 我亦无他，惟手熟尔
 */
public
class Test4{
    public static void main(String[] args) {
        Date date =new Date(1234567);
        m1(date);
        System.out.println(date.getTime());
    }
    public static void m1(Date date){
        date=null;
    }
}