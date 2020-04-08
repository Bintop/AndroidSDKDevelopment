package irdc.ex03_03;

import android.util.Log;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator mCalculator;

    @Before
    public void setUp() {
        //Log.v("wwb", "测试初始化");
        mCalculator = new Calculator();
    }

    @After
    public void tearDown() {
        //Log.v("wwb", "测试去初始化");
    }

    @Test
    public void add() throws Exception {
        //Log.v("wwb", "测试Add方法");
        int sum = mCalculator.add(1, 6);
        Assert.assertEquals(7, sum);
    }

    /**
     *
     * divide方法应该抛出IllegalArgumentException异常
     * 如果没有抛出该异常，则表示测试失败
     */
    @Test(expected = IllegalArgumentException.class)
    public void divide() {
        double res = mCalculator.divide(4, 0);
    }
}