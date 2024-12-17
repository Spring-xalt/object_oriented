package Gather.GatherExercise;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 我亦无他，惟手熟尔
 */
public class GatherExercise1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(new Message("源于武汉的新型冠状病毒肆虐全球"));
        al.add(new Message("奇闻异事"));

        int size=al.size();
        for(int i=size-1;i>=0;i--){
            Message str=(Message)al.get(i);
            System.out.println(Message.processString(str.getTheme()));//方法体传入解决
        }
    }
}
class Message{
    private String theme;
    private String message;
    public static String processString(String theme) {
        if(theme==null){
            return "";
        }
        if(theme.length()>10)return theme.substring(0,10)+"...";
        return theme;
    }

    public Message(String theme) {
        this.theme = theme;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message{" +
                theme +
                '}';
    }
}