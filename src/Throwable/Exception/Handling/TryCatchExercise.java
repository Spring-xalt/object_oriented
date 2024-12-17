package Throwable.Exception.Handling;

/**
 * 我亦无他，惟手熟尔
 */
public class TryCatchExercise {
    public static int method(){
        try{//ctrl +alt + t 快捷唤醒
            String []name=new String[3];
            if(name[1].equals("tom")){          //NullPointerException
                System.out.println(name[1]);
            }
            else{
                name[3]="dzy";                 //ArrayIndexOutOfBoundsException
            }
            return 1;
        }catch(ArrayIndexOutOfBoundsException e ){
            return 2;
        }catch(NullPointerException n){     //先捕获
            return 3;
        }finally{                           //finally是一定执行的所以会忽略return3
            return 4;
        }
    }
    public static void main(String[] args) {
        System.out.println(method());
    }
}
class AC{
    public static int way(){
        int i=1;
        try{
            i++;            //i=2;
            String name[]=new String[3];
            if(name[1].equals("tom")){          //NullPointerException先出现
                System.out.println(name[1]);
            }
            else{
                name[3]="dzy";                 //ArrayIndexOutOfBoundsException
            }
            return 1;
        }
        catch(ArrayIndexOutOfBoundsException e){
            return 2;
        }
        catch(NullPointerException n){           //捕获异常
            return ++i;                          //此处不会执行return ，但会先执行i=i+1；i=3;
        }
        finally{
            return ++i;                          //i=4;
        }
    }
}

