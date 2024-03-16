package com.example;
import org.junit.Assert;
import org.junit.Test;

public class AppTest 
{
    @Test
    public void test1()
    {
        int Ox = 1,Oy = 15,R = 14, x = 15, y = 15;
        String Expected_Output = "Điểm cho trước nằm trên đường tròn";
        String Actual_Output = new App().checkPoint(Ox, Oy, R, x, y);
        System.out.println(Expected_Output == Actual_Output);
        System.out.println(Expected_Output);
        Assert.assertEquals(Expected_Output, Actual_Output);
    }

    @Test
    public void test2()
    {
        int Ox = 2,Oy = 15,R = 14, x = 15, y = 15;
        String Expected_Output = "Điểm cho trước nằm trong đường tròn";
        String Actual_Output = new App().checkPoint(Ox, Oy, R, x, y);
        System.out.println(Expected_Output == Actual_Output);
        System.out.println(Expected_Output);
        Assert.assertEquals(Expected_Output, Actual_Output);
    }
    
    @Test
    public void test3()
    {
        int Ox = 2147483646,Oy = 15,R = 14, x = 15, y = 15;
        String Expected_Output = "Điểm cho trước nằm ngoài đường tròn";
        String Actual_Output = new App().checkPoint(Ox, Oy, R, x, y);
        System.out.println(Expected_Output == Actual_Output);
        System.out.println(Expected_Output);
        Assert.assertEquals(Expected_Output, Actual_Output);
    }
    
    @Test
    public void test4()
    {
        int Ox = 2147483647,Oy = 15,R = 14, x = 15, y = 15;
        String Expected_Output = "Điểm cho trước nằm ngoài đường tròn";
        String Actual_Output = new App().checkPoint(Ox, Oy, R, x, y);
        System.out.println(Expected_Output == Actual_Output);
        System.out.println(Expected_Output);
        Assert.assertEquals(Expected_Output, Actual_Output);
    }

    @Test
    public void test5()
    {
        int Ox = 15,Oy = 1,R = 14, x = 15, y = 15;
        String Expected_Output = "Điểm cho trước nằm trên đường tròn";
        String Actual_Output = new App().checkPoint(Ox, Oy, R, x, y);
        System.out.println(Expected_Output == Actual_Output);
        System.out.println(Expected_Output);
        Assert.assertEquals(Expected_Output, Actual_Output);
    }
    
    @Test
    public void test6()
    {
        int Ox = 15,Oy = 2,R = 14, x = 15, y = 15;
        String Expected_Output = "Điểm cho trước nằm trong đường tròn";
        String Actual_Output = new App().checkPoint(Ox, Oy, R, x, y);
        System.out.println(Expected_Output == Actual_Output);
        System.out.println(Expected_Output);
        Assert.assertEquals(Expected_Output, Actual_Output);
    }
    
    @Test
    public void test7()
    {
        int Ox = 15,Oy = 2147483646,R = 14, x = 15, y = 15;
        String Expected_Output = "Điểm cho trước nằm ngoài đường tròn";
        String Actual_Output = new App().checkPoint(Ox, Oy, R, x, y);
        System.out.println(Expected_Output == Actual_Output);
        System.out.println(Expected_Output);
        Assert.assertEquals(Expected_Output, Actual_Output);
    }
    
    @Test
    public void test8()
    {
        int Ox = 15,Oy = 2147483647,R = 14, x = 15, y = 15;
        String Expected_Output = "Điểm cho trước nằm ngoài đường tròn";
        String Actual_Output = new App().checkPoint(Ox, Oy, R, x, y);
        System.out.println(Expected_Output == Actual_Output);
        System.out.println(Expected_Output);
        Assert.assertEquals(Expected_Output, Actual_Output);
    }
    
    @Test
    public void test9()
    {
        int Ox = 15,Oy = 15,R = 1, x = 15, y = 15;
        String Expected_Output = "Điểm cho trước nằm trong đường tròn";
        String Actual_Output = new App().checkPoint(Ox, Oy, R, x, y);
        System.out.println(Expected_Output == Actual_Output);
        System.out.println(Expected_Output);
        Assert.assertEquals(Expected_Output, Actual_Output);
    }
    
    @Test
    public void test10()
    {
        int Ox = 15,Oy = 15,R = 2, x = 15, y = 15;
        String Expected_Output = "Điểm cho trước nằm trong đường tròn";
        String Actual_Output = new App().checkPoint(Ox, Oy, R, x, y);
        System.out.println(Expected_Output == Actual_Output);
        System.out.println(Expected_Output);
        Assert.assertEquals(Expected_Output, Actual_Output);
    }
    
    @Test
    public void test11()
    {
        int Ox = 15,Oy = 15,R = 2147483646, x = 15, y = 15;
        String Expected_Output = "Điểm cho trước nằm trong đường tròn";
        String Actual_Output = new App().checkPoint(Ox, Oy, R, x, y);
        System.out.println(Expected_Output == Actual_Output);
        System.out.println(Expected_Output);
        Assert.assertEquals(Expected_Output, Actual_Output);
    }
    
    @Test
    public void test12()
    {
        int Ox = 15,Oy = 15,R = 2147483647, x = 15, y = 15;
        String Expected_Output = "Điểm cho trước nằm trong đường tròn";
        String Actual_Output = new App().checkPoint(Ox, Oy, R, x, y);
        System.out.println(Expected_Output == Actual_Output);
        System.out.println(Expected_Output);
        Assert.assertEquals(Expected_Output, Actual_Output);
    }
    
    @Test
    public void test13()
    {
        int Ox = 15,Oy = 15,R = 14, x = 1, y = 15;
        String Expected_Output = "Điểm cho trước nằm trên đường tròn";
        String Actual_Output = new App().checkPoint(Ox, Oy, R, x, y);
        System.out.println(Expected_Output == Actual_Output);
        System.out.println(Expected_Output);
        Assert.assertEquals(Expected_Output, Actual_Output);
    }
    
    @Test
    public void test14()
    {
        int Ox = 15,Oy = 15,R = 14, x = 2, y = 15;
        String Expected_Output = "Điểm cho trước nằm trong đường tròn";
        String Actual_Output = new App().checkPoint(Ox, Oy, R, x, y);
        System.out.println(Expected_Output == Actual_Output);
        System.out.println(Expected_Output);
        Assert.assertEquals(Expected_Output, Actual_Output);
    }
    
    @Test
    public void test15()
    {
        int Ox = 15,Oy = 15,R = 14, x = 2147483646, y = 15;
        String Expected_Output = "Điểm cho trước nằm ngoài đường tròn";
        String Actual_Output = new App().checkPoint(Ox, Oy, R, x, y);
        System.out.println(Expected_Output == Actual_Output);
        System.out.println(Expected_Output);
        Assert.assertEquals(Expected_Output, Actual_Output);
    }
    
    @Test
    public void test16()
    {
        int Ox = 15,Oy = 15,R = 14, x = 2147483647, y = 15;
        String Expected_Output = "Điểm cho trước nằm ngoài đường tròn";
        String Actual_Output = new App().checkPoint(Ox, Oy, R, x, y);
        System.out.println(Expected_Output == Actual_Output);
        System.out.println(Expected_Output);
        Assert.assertEquals(Expected_Output, Actual_Output);
    }
    
    @Test
    public void test17()
    {
        int Ox = 15,Oy = 15,R = 14, x = 15, y = 1;
        String Expected_Output = "Điểm cho trước nằm trên đường tròn";
        String Actual_Output = new App().checkPoint(Ox, Oy, R, x, y);
        System.out.println(Expected_Output == Actual_Output);
        System.out.println(Expected_Output);
        Assert.assertEquals(Expected_Output, Actual_Output);
    }
    
    @Test
    public void test18()
    {
        int Ox = 15,Oy = 15,R = 14, x = 15, y = 2;
        String Expected_Output = "Điểm cho trước nằm trong đường tròn";
        String Actual_Output = new App().checkPoint(Ox, Oy, R, x, y);
        System.out.println(Expected_Output == Actual_Output);
        System.out.println(Expected_Output);
        Assert.assertEquals(Expected_Output, Actual_Output);
    }
    
    @Test
    public void test19()
    {
        int Ox = 15,Oy = 15,R = 14, x = 15, y = 2147483646;
        String Expected_Output = "Điểm cho trước nằm ngoài đường tròn";
        String Actual_Output = new App().checkPoint(Ox, Oy, R, x, y);
        System.out.println(Expected_Output == Actual_Output);
        System.out.println(Expected_Output);
        Assert.assertEquals(Expected_Output, Actual_Output);
    }
    
    @Test
    public void test20()
    {
        int Ox = 15,Oy = 15,R = 14, x = 15, y = 2147483647;
        String Expected_Output = "Điểm cho trước nằm ngoài đường tròn";
        String Actual_Output = new App().checkPoint(Ox, Oy, R, x, y);
        System.out.println(Expected_Output == Actual_Output);
        System.out.println(Expected_Output);
        Assert.assertEquals(Expected_Output, Actual_Output);
    }
    
    @Test
    public void test21()
    {
        int Ox = 15,Oy = 15,R = 14, x = 15, y = 15;
        String Expected_Output = "Điểm cho trước nằm trong đường tròn";
        String Actual_Output = new App().checkPoint(Ox, Oy, R, x, y);
        System.out.println(Expected_Output == Actual_Output);
        System.out.println(Expected_Output);
        Assert.assertEquals(Expected_Output, Actual_Output);
    }
    
    @Test
    public void test22()
    {
        int Ox = 1,Oy = 1,R = 5, x = 4, y = 3;
        String Expected_Output = "Điểm cho trước nằm trong đường tròn";
        String Actual_Output = new App().checkPoint(Ox, Oy, R, x, y);
        System.out.println(Expected_Output == Actual_Output);
        System.out.println(Expected_Output);
        Assert.assertEquals(Expected_Output, Actual_Output);
    }
    
    @Test
    public void test23()
    {
        int Ox = 1,Oy = 1,R = 4, x = 1, y = 5;
        String Expected_Output = "Điểm cho trước nằm trên đường tròn";
        String Actual_Output = new App().checkPoint(Ox, Oy, R, x, y);
        System.out.println(Expected_Output == Actual_Output);
        System.out.println(Expected_Output);
        Assert.assertEquals(Expected_Output, Actual_Output);
    }
    
    @Test
    public void test24()
    {
        int Ox = 1,Oy = 1,R = 5, x = 6, y = 9;
        String Expected_Output = "Điểm cho trước nằm ngoài đường tròn";
        String Actual_Output = new App().checkPoint(Ox, Oy, R, x, y);
        System.out.println(Expected_Output == Actual_Output);
        System.out.println(Expected_Output);
        Assert.assertEquals(Expected_Output, Actual_Output);
    }
}
