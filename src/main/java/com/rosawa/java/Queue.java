package com.rosawa.java;

public interface Queue<T> {
    public void enqueue(T item);
    public T dequeue();
    public boolean isEmpty();
    public int size();
}
