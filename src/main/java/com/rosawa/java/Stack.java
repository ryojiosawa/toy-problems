package com.rosawa.java;

public interface Stack<T> {
    public void push(T value);
    public T pop();
    public boolean isEmpty();
    public int size();
}
