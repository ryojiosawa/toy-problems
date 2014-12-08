package com.rosawa.java;

import java.util.ArrayList;

public class ArrayStack<T> implements Stack<T> {

    ArrayList<T> storage = new ArrayList();

    @Override
    public void push(T value) {
        storage.add(value);
    }

    @Override
    public T pop() {
        return storage.remove(storage.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return storage.size() == 0;
    }

    @Override
    public int size() {
        return storage.size();
    }
}
