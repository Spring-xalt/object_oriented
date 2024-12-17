package Recursion;

/**
 * 我亦无他，惟手熟尔
 */
public class MiGong {
    //老鼠出迷宫问题
    public static void main(String[] args) {
        int [][]map=new int [8][7];
        for(int i=0;i<7;i++){
            map[0][i]=1;
            map[7][i]=1;
        }map[4][3]=1;
        for(int i=3,j=1;j<3;j++){
            map[i][j]=1;
        }
        for(int i=0;i<map.length;i++){
            map[i][0]=1;map[i][6]=1;
        }
        for(int i=0;i<map.length;i++){
            for(int j=0;j<map[i].length;j++){
                System.out.print(map[i][j]+"\t");
            }System.out.println("\n");
        }
    }
}
class T {
    public boolean findWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            return true;
        } else {
            if (map[i][j] == 0) {
                //假定此处可以走通
                map[i][j] = 2;
                //测试上下左右四个方向
                if (findWay(map, i + 1, j)) {
                    return true;
                } else if (findWay(map, i, j + 1)) {
                    return true;
                } else if (findWay(map, i - 1, j)) {
                    return true;
                } else if (findWay(map, i, j - 1)) {
                    return true;
                } else {
                    //上下左右都走不通，假设出错，将该点设为3断点
                    map[i][j] = 3;
                    return false;
                }
            }
        }
        return true;
    }
}
