package com.onedimension.polymorphic;

public class Test {
    public static void main(String[] args) {

        // 多态： 行为多态、对象多态
        Animal dog = new Dog();
        Animal cat = new Cat();
        // 方法：编译看左边，运行看右边
        // 多态的好处 右边对象是解耦的
        dog.eat();
        cat.eat();
        // 对象：编译看左边，运行看左边  成员变量不多态
        // 如果实例化不赋值，默认为父类的name
        System.out.println(dog.name);
        System.out.println(cat.name);

        // 多态的好处 右边对象是解耦的
        eat(dog);
        eat(cat);

        // 多态的缺点，不能调用子类的特有方法
        // cat.climb();

        // 多态下的强制类型转换, 此时可以调用子类的特有方法
        // 子类类型 变量名 = (子类类型) 对象实例
        // 有继承关系就能强转，编译时不会报错，但是运行时如果类型不符合就会报错类型转换异常 ClassCastException
        Cat cat1 = (Cat) cat;
        cat1.climb();
    }

    // 传入一个较大范围的参数类型，调用多种子类的方法， 可拓展性强大
    public static void eat(Animal a) {

        // 建议强制转换前，可以使用instanceof 判断对象的类型, 调用对象的特有方法
        if (a instanceof Cat) {
            // 强制类型转换
            // Cat a1 = (Cat) a;
            // a1.climb();
            // 上述代码也可写成
            ((Cat) a).climb();
        } else {
            a.eat();

        }

    }
}
