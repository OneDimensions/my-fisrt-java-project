package com.onedimension.junitDemo;

import org.junit.Assert;
import org.junit.Test;

// 测试类: junit但愿测试框架 对业务中的业务方法进行正确性测试
public class StringUtilTest {
    // 测试方法: 必须是公开public 没有返回值的
    // 测试方法必须加上@Test注解(junit框架的核心步骤)

    @Test
    public void testPrintNumber() {
        // 测试步骤 用例
        StringUtil.printNumber("张三");
        StringUtil.printNumber("");
        StringUtil.printNumber(null);
    }

    @Test
    public void testGetMaxIndex() {
        // 测试步骤 用例
        int index1 = StringUtil.getMaxIndex("abcdefg");
        int index2 = StringUtil.getMaxIndex("");
        int index3 = StringUtil.getMaxIndex(null);
        System.out.println(index1);

        // 断言测试 期望值与实际值是否一致
        Assert.assertEquals(6, index1);
    }

}
