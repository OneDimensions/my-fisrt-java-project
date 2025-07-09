package com.onedimension.extend;

// 默认继承Object类
public class Father {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 权限修饰符
    // 1. private 只能在当前类中访问
    private void privateMethod() {
        System.out.println("privateMethod");
    }

    @Override
    public String toString() {
        return "Father{" +
                "name='" + name + '\'' +
                '}';
    }

    // 2. 缺省 只能在当前类 或者当前包的其他类中访问
    void defaultMethod() {
        System.out.println("defaultMethod");
    }

    // 3. protected 继承的子类或者同一个包下的其他类中访问
    protected void protectedMethod() {
        System.out.println("protectedMethod");
    }

    // 4. public 所有类中都可以访问
    public void publicMethod() {
        System.out.println("publicMethod");
    }

}
