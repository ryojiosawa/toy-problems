package com.rosawa.java;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestQueue {

    @Test
    public void testIsQueueEmpty() {
        Queue<String> queue = new ArrayQueue();
        Assert.assertTrue(queue.isEmpty());
    }

    @Test
    public void testEnqueueAndDequeue() {
        Queue<String> queue = new ArrayQueue();
        queue.enqueue("Spring");
        queue.enqueue("Summer");
        Assert.assertEquals(2, queue.size());

        Assert.assertEquals("Spring", queue.dequeue());
        Assert.assertEquals("Summer", queue.dequeue());
        Assert.assertTrue(queue.isEmpty());
    }

    @Test
    public void testSizeReturnQueueSize() {
        Queue<String> queue = new ArrayQueue();
        Assert.assertEquals(0, queue.size());
    }
}
