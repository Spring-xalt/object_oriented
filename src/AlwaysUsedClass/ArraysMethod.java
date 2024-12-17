package AlwaysUsedClass;

import java.util.Arrays;

/**
 * 我亦无他，惟手熟尔
 */
public class ArraysMethod {
    public static void main(String[] args) {
        Integer[] integers={1,4,9,};

        //演示toString
        System.out.println(Arrays.toString(integers));//[1,4,9]
        //演示sort排序（自然排序和定制排序）

        Integer []arr={1,59,65,78,-1};
        Arrays.sort(arr);
    }
}
