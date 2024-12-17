package Gather.Collection.List;

import java.util.ArrayList;
import java.util.List;

/**
 * 我亦无他，惟手熟尔
 */

//实现
public class List2 {
    public static void main(String[] args) {
        List list=new ArrayList();

        list.add(new Book("SGYY",20.0,"lgz"));
        list.add(new Book("xyj",30.1,"waz"));
        list.add(new Book("hlm",10.0,"las"));

        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.size()-1-i;j++){
                //如何从list访问Book中的prices
                Book book1=(Book)list.get(j);
                Book book2=(Book)list.get(j+1);
                if(book1.getPrices()>book2.getPrices()){
                    list.set(j,book2);
                    list.set(j+1,book1);
                }
            }
        }
        System.out.println("list="+list);
    }
}
class Book{
    private String name;
    private double prices;
    private String authorName;

    public Book(String name,double prices,String authorName) {
        this.name = name;
        this.prices=prices;
        this.authorName=authorName;
    }


    public double getPrices() {
        return prices;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", prices=" + prices +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}
