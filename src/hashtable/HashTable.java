package hashtable;

import java.util.LinkedList;

public class HashTable {
    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry>[] entries = new LinkedList[5];

    public void put(int key, String value) {
        var index = hash(key);
        if (entries[index] == null) {
            entries[index] = new LinkedList<>();
        }

        for (var entry : entries[index]) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }

        entries[index].addLast(new Entry(key, value));
    }

    public String get(int key) {
        var index = hash(key);
        if (entries[index] != null) {
            for (var entry : entries[index]) {
                if (entry.key == key) return entry.value;
            }
        }

        return null;
    }

    public void remove(int key) {
        var index = hash(key);
        if (entries[index] == null)
            throw new IllegalArgumentException("Entry does not exist!");

        for (var entry : entries[index]) {
            if (entry.key == key) {
                entries[index].remove();
            }
        }

    }

    private int hash(int key) {
        return key % entries.length;
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        for (var entry : entries) {
            if (entry != null) {
                for (var item : entry) {
                    sb.append(item.value).append(", ");
                }
            }
        }
        return sb.toString();
    }
}
