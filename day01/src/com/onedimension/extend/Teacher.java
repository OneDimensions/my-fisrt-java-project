package com.onedimension.extend;

/**
 * 继承
 * 特点:
 * 1. 子类只能继承一个父类
 * 2. 子类可以继承父类的属性和方法
 * 3. 子类可以定义新的属性和方法
 * 4. 子类可以重写父类的方法
 * 5. 子类可以调用父类的方法
 * 6. 子类可以调用父类的构造方法
 * 7. 访问顺序 就近优先原则
 */
public class Teacher extends Father{
    /**
     * 技能
     */
    private String skill;

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    private void call() {
        // 通过super关键字调用父类的方法,或者访问父类的属性
        System.out.println(super.getName());
    }
}
