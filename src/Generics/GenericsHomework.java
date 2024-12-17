package Generics;

import java.util.*;

/**
 * 我亦无他，惟手熟尔
 */
public class GenericsHomework {
    public static void main(String[] args) {

    }
}
class DAO<T>{
    private Map<String,T> map = new HashMap<>();
    public void save(String id,T entity){

    }
    public T get(String id){
        return map.get(id);
    }
    public void update (String id,T entity){
        map.put(id,entity);
    }
    public List<T> list(){
       List <T>list =new ArrayList<>();
       Set<String> keyset=map.keySet();     //取出map中的key
       for(String str:keyset){
           list.add(get(str));              //以key为索引向其中添加T（String）类型的value（id）
       }
        return list;
    }




}
class User{
    private int id;
    private int age;
    private String name ;

    public User(int id,int age,String name) {
        this.id = id;
        this.age=age;
        this.name=name;
    }
    public int getId() {
        return id;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

}