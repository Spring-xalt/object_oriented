package Throwable.Exception.Handling;

/**
 * 我亦无他，惟手熟尔
 */

/**     //ctrl+alt+t唤醒try-catch
        try{
            代码1（可能有异常）;             //如果异常发生，异常块后面不会执行，直接跳转到catch
            代码2；
        }catch(exception e){
            //捕获到异常，当异常发生时，将异常封装成exceptiond 对象 e，传递给catch
        }
        finally{
            //不管是否有异常，finally代码始终要执行
        }
 */
public class ExceptionHandling {

}
