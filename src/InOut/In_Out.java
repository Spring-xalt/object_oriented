package InOut;

import java.util.Scanner;

/**
 * 我亦无他，惟手熟尔
 */
public class In_Out {
    public static void main(String[] args) {
        //in
        Scanner input=new Scanner(System.in);
        //int
        int num=input.nextInt();
        //double
        double lv=input.nextDouble();
        //char
        char ch=input.next().charAt(0);
        //String
        String str=input.next();
        //array

        int arr[]=new int[num];

        for(int i=0;i<num;i++) {
            arr[i] = input.nextInt();
        }


        //out
        System.out.println(num);
        System.out.println(lv);
        System.out.println(ch);
        System.out.println(str);
        for(int i=0;i<num;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
