package SchoolWork;

/**
 * 我亦无他，惟手熟尔
 */
public class SchoolWork{
    @SuppressWarnings("all")
    public static void main(String[] args) {
        //第一位
        String fir="赣";
        //第二位
        char sec1=(char)(Math.random()*8+65);//A到H
        char sec2=(char)(Math.random()*4+74);//J到M
        String sec="";
        switch((int)(Math.random()%2)){
            case 0:sec=sec1+"";break;
            case 1:sec=sec2+"";break;
        }

        //后五位
        String nextFive="";
        int randomNum=(int)(Math.random()*10);          //得到0到9的随机数
        char randomLetter=(char)(Math.random()*26+65);  //得到A到Z的随机字母
        while((randomNum!=0)&&(randomNum!=1)&&(randomLetter!='I')&&randomLetter!='O'){      //排除1，0，I，O
            if(nextFive.length()<5){
                //string长度不到5
                nextFive+=((int)(Math.random())/2==0)?((int)Math.random()+""):(Math.random()*26+65+"");
                //利用奇偶判断随机生成字母还是数字
            }
        }
        //集合
        String carCard=fir+sec+nextFive;
        System.out.println("随机车牌为"+carCard);
    }
}
