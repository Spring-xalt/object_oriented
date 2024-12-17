package SchoolWork;

/**
 * 我亦无他，惟手熟尔
 */
public class SchoolWork3 {
    public static void main(String[] args) {
        int arr[]={5,9,6,3,7};
        partition(arr);
    }
    public static int partition(int[]list){
        int key=list[0];
        int left=0;
        int right=list.length-1;
        while(left<right){
            while(key<list[right]&&left<right){
                right--;
            }
            while(key>list[left]&&left<right){
                left++;
            }
            if(list[left]==list[right]&&left<right){
                left++;
            }
            else{
                int temp=list[left];
                list[left]=list[right];
                list[right]=temp;
            }
        }return (left==right)?(left-1):(right-1);
    }
}
