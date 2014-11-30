package com.rosawa.java;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestStack {

    @Test
    public void testIsEmpty() {
        Stack<String> stack = new ArrayStack();
        Assert.assertTrue(stack.isEmpty());
    }

    @Test
    public void testPushAndPop() {
        Stack<String> stack = new ArrayStack();
        stack.push("Spring");
        stack.push("Summer");
        Assert.assertEquals(2, stack.size());

        Assert.assertEquals("Summer", stack.pop());
        Assert.assertEquals("Spring", stack.pop());
        Assert.assertTrue(stack.isEmpty());
    }

    @Test
    public void testSizeReturnStackSize() {
        Stack<String> stack = new ArrayStack();
        Assert.assertEquals(0, stack.size());
    }
}
