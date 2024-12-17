package Enumeration;

/**
 * 我亦无他，惟手熟尔
 */
public class Enum2 {
    //用enum类开发一个枚举类时，底层会默认实现继承Enum类（javap反编译实现）
}

enum Season3{
    //若使用无参构造器创建枚举对象,实参列表和小括号都可以省略
    spring;
    private String name;

    Season3() {
    }

    public String getName() {
        return name;
    }
}
