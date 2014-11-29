package com.rosawa.java;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestStringReverse {

    @Test
    public void testStringReverse() {
        String str = "abc";
        Assert.assertEquals(StringReverse.reverse(str), "cba");
    }
}
