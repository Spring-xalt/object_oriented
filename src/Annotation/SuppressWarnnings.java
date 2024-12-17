package Annotation;

import java.util.ArrayList;

/**
 * 我亦无他，惟手熟尔
 */

//抑制警告：我们不想看到警告（强迫症专用）
    //在大括号中加入希望抑制（不警告）的信息
    @SuppressWarnings({})
public class SuppressWarnnings {
    public static void main(String[] args) {
        ArrayList list =new ArrayList();
        list.add("tom");
        list.add("jack");
    }
}
