package com.Shefali;

public class HashMapLinearProbing {
    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    Entry[] entries = new Entry[6];
    private int index = 0;
    private int count = 0;
    private int len = entries.length;

    public void put(int key, String value) {
        int i = 0;
        while (i < len) {
            index = (hash(key) + i) % entries.length;
            if (entries[index] == null || entries[index].key == key)
                break;
            i = i + 1;
        }

        entries[index] = new Entry(key, value);
        count++;
    }

    public String get(int key) {
        int index = hash(key);
        if (entries[index] == null) {
            throw new IllegalStateException("No value for this key");
        }

        return entries[index].value;
    }

    public String remove(int key) {
        int index = hash(key);
        if (entries[index] == null) {
            throw new IllegalStateException("No value for this key");
        }
        String value = entries[index].value;
        entries[index] = null;
        count--;
        return value;
    }

    public int size() {
        return count;
    }

    private int hash(int key) {
        return key % entries.length;
    }
}
