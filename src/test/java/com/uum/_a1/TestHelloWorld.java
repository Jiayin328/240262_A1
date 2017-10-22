package com.uum._a1;

import org.junit.Assert;
import org.junit.Test;

public class TestHelloWorld {
    
    @Test
    public void testHello(){
        HelloWorld hw = new HelloWorld();
        hw.sayHello("Jiayin");
        Assert.assertEquals("Hello Jiayin", "Hello Jiayin"); //first: expected output; second: real output
    }
}
