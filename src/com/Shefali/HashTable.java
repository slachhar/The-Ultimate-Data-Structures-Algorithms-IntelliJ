package com.Shefali;

import java.util.LinkedList;

public class HashTable<T> {
    java.util.LinkedList[] entries = new java.util.LinkedList[6];

    private class Entry<T> {
        int key;
        T value;

        public Entry(int key, T value) {
            this.key = key;
            this.value = value;
        }
    }

    public void put(int key, T v) {
        int index = hash(key);
        if (entries[index] == null) {
            entries[index] = new java.util.LinkedList<>();
        }

        entries[index].addLast((T) new Entry(key, v));
    }

    public T get(int key) {
        int index = hash(key);
        LinkedList<Entry> bucket = entries[index];
        if (bucket != null) {
            for (Entry<T> entry : bucket) {
                if (entry.key == key) {
                    return entry.value;
                }
            }
        }
        return null;
    }

    private int hash(int key) {
        return key % entries.length;
    }

    public void remove(int key) {
        int index = hash(key);
        LinkedList<Entry> bucket = entries[index];
        if (bucket == null) {
            throw new IllegalStateException("bucket is empty");
        }
        if (bucket != null) {
            for (Entry<T> entry : bucket) {
                if (entry.key == key) {
                    bucket.remove();
                    return;
                }
            }
        }
    }
}
