package Gather.GatherExercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 我亦无他，惟手熟尔
 */
public class GatherExerciese2  {
    public static void main(String[] args) {
        Map m=new HashMap();
        m.put("jack",650);
        m.put("tom",700);
        m.put("dzy",1000);
        m.put("jack",2600);
        Set keySet=m.keySet();
        for(Object obj:keySet){
            m.put(obj,(Integer)(m.get(obj))+100);
        }
    }
}

