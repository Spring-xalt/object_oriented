package SchoolWork;

/**
 * 我亦无他，惟手熟尔
 */
public class SchoolWork4 {
    public static void main(String[] args) {
        //100学生和储物柜，初始都是关的
        //第0个学生打开改变相隔为0的柜子状态，第一个学生改变相隔为1的状态，第二个改变相隔为2的状态.....
        //int的1替换boolean的true状态，2替换flase状态
        boolean []arr=new boolean[100];
        int []arrShow=new int [100];
        for (int i = 0; i < 100; i++) {     //对应初始化
            arr[i]=false;
            arrShow[i]=-1;
        }

        for (int i = 0; i < 100; i++) {                     //i是学生
            int j=i;
            while(j<100){
                arrShow[j]*=-1;
                j++;
                j=i+j;
            }
        }


        for (int i = 0; i < 100; i++) {
            if(arrShow[i]==-1)arr[i]=false;
            else{
                arr[i]=true;
            }
        }
        System.out.println("打开的储物柜编号");
        for (int i = 0; i < 100; i++) {
            if(arr[i]==true){
                System.out.print(+(i+1)+"\t");
            }
        }
    }
}
