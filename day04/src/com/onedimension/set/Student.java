package com.onedimension.set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Comparable<Student> {
    private String name;
    private double source;

    // 如果希望Set集合认为两个内容是同一个对象,需要重写对象的equals和hashCode方法

    // 但是hash值有可能不同内容的hash值也会算得相同 所以还需要重写equals
    // 只要两个对象内容一样,结果是true
    // s2.equals(s1)
    @Override
    public boolean equals(Object o) {
        // 如果传入的对象为空或者 当前两个对象的类型不一样 返回false (getClass:获取对象的类型)
        if (o == null || getClass() != o.getClass()) return false;
        // 如果上面的判断都不成立，那么就可以认为o是Student类型,也就是正确的类型,就可以进行强转
        Student student = (Student) o;
        // 进行内容比较 如果全相等 返回true
        return Double.compare(source, student.source) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        // 保证了不同对象,只要内容相同，hash值相同
        return Objects.hash(name, source);
    }


    // 对象类实现Comparable比较接口, 重写compareTo指定比较大小规则
    // 如果认为左边的对象大于右边的对象 返回正数
    // s2.compareTo(s1)
    // 如果返回0,说明左右相等, 则会进行去重
    @Override
    public int compareTo(Student o) {
        // 如果认为左边的对象大于右边的对象 返回正数 这样左边的对象就会排在右边
        // 从小到大
        // return Double.compare(source, o.source);
        // 从大到小
        int result = Double.compare(o.source, source);
        // 为了避免分数一样被去重的情况
        if (result == 0) {
            return -1;
        }
        return result;
    }
}
