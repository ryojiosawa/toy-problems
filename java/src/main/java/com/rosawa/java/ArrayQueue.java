package com.rosawa.java;

import java.util.ArrayList;

/**
 * Created by rosawa on 11/29/14.
 */
public class ArrayQueue<T> implements Queue<T> {

    private ArrayList<T> storage = new ArrayList();
    private int at = 0;

    @Override
    public void enqueue(T item) {
        storage.add(item);
    }

    @Override
    public T dequeue() {
        if (at > storage.size()) {
            return null;
        }

        T value = storage.get(at);
        at++;
        return value;
    }

    @Override
    public boolean isEmpty() {
        return (storage.size() - at) == 0;
    }

    @Override
    public int size() {
        return storage.size() - at;
    }
}
