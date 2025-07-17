package com.onedimension.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo2 {

    @Test
    public  void getClassInfo() {
        Class c1 = Animal.class;

        // 类名的全名
        System.out.println(c1.getName());
        // 类名的简写
        System.out.println(c1.getSimpleName());
    }

    // 获取构造方法信息
    @Test
    public void getConstructorInfo() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Animal> c1 = Animal.class;

        // 获取构造器对象列表
        // getConstructors 获取公有构造方法 私有的获取不到
        // getDeclaredConstructors 获取所有构造方法
        Constructor[] cons = c1.getDeclaredConstructors();
        for (Constructor c : cons) {
            // 获取构造器的名称 + 参数个数
            System.out.println(c.getName() + "(" + c.getParameterCount() + ")");
        }

        // 获取单个构造期
        Constructor con1 = c1.getDeclaredConstructor();
        System.out.println("无参数构造期" + con1.getName() + "(" + con1.getParameterCount() + ")");

        // 获取带参构造器 指定参数类型  类型.class 将类型当作类来使用传入
        Constructor con2 = c1.getDeclaredConstructor(String.class);
        System.out.println("带参构造器" + con2.getName() + "(" + con2.getParameterCount() + ")");

        // 拿到构造期可以创建对象 需要强转类型
        // Animal a1 = (Animal) con1.newInstance();
        // 如果此时的构造器是私有构造期, 则需要调用setAccessible(true)设置权限 进行暴力反射
        con1.setAccessible(true); // 绕过访问权限
        Animal a1 = (Animal) con1.newInstance();
        System.out.println(a1);

        System.out.println("===============");
    }

    // 获取类的成员变量对象并对其操作
    @Test
    public void getField() throws Exception {
        Class c1 = Animal.class;

        // 获取成员变量列表
        Field[] fields = c1.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + ":" + field.getType());
        }

        // 获取单个成员变量
        Field field = c1.getDeclaredField("age");
        System.out.println(field.getName() + ":" + field.getType());

        // 获取成员变量的作用 赋值 取值
        Animal a1 = new Animal("Tom", 10);
        field.setAccessible(true); // 绕过访问权限修饰符
        field.set(a1, 20); // 赋值
        System.out.println(field.get(a1)); // 取值

        System.out.println("===============");
    }

    // 获取成员方法
    @Test
    public void getMethods() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InvocationTargetException, IllegalAccessException {
        Class c1 = Animal.class;

        // 获取全部方法
        Method[] methods = c1.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method.getName() + ":" + method.getReturnType());
        }

        // 获取指定方法
        // 无参数
        Method eat1 = c1.getDeclaredMethod("eat");
        System.out.println(eat1.getName() + ":" + eat1.getReturnType());

        // 有参数
        Method eat2 = c1.getDeclaredMethod("eat", String.class);
        System.out.println(eat2.getName() + ":" + eat2.getReturnType());

        // 获取成员方法的目的 是调用方法
        Animal a1 = new Animal("Tom", 10);
        eat2.setAccessible(true);
        String res = (String) eat2.invoke(a1, "Jerry");
        System.out.println("获取私有方法的返回值:" + res);
    }
}
