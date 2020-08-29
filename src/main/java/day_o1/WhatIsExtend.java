package day_o1;

/**
 * 什么是继承?
 * 构造的作用是为了变量初始化
 * 如果无论子类有无构造，都会默认调用父类的构造方法
 *
 */
class WhatIsExtend {

    public String name;
    private int age;

    public WhatIsExtend(){
        System.out.println("调用父类的无参构造");
    }

    public WhatIsExtend(String name) {
        System.out.println("调用父类含参构造构造");
        this.name = name;
    }

    public void sayHello(){
        System.out.println("hello");
    }

    private void sayHi(){
        System.out.println("Hi");
    }


}


class Daughter extends WhatIsExtend{

    public Daughter(){
        System.out.println("子类的无参构造");
    }

    public Daughter(String name){
        System.out.println("子类的含参构造");
        super.name = name;
    }

    public static void main(String[] args) {

        Daughter daughter = new Daughter("b");
        // daughter.name = "b";
        System.out.println(daughter.name);

    }

}


class Son extends WhatIsExtend {

    public static void main(String[] args) {

        Son son = new Son();

        // 1.成员变量
        // 公有
        son.name = "a";
        System.out.println(son.name);
        // 私有(不可继承)
        // son.age = 18;
        //System.out.println(son.age);


        // 2.成员方法
        // 公有
        son.sayHello();

        // 私有(不可继承)
        // son.sayHi();

    }

}