package hashtable;

import java.util.*;

public class HashTableDemo {
    public static void main(String[] args) {
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "entry 1");
//        map.put(2, "entry 2");
//        map.put(3, "entry 3");
//
//        for (var entry : map.entrySet()) {
//            System.out.println(entry.hashCode());
//        }

//        Set<Integer> set = new HashSet<>();
//        int[] values = {2, 4, 6, 2, 5, 7, 4, 5, 1};
//
//        for (int i : values) {
//            set.add(i);
//        }
//        System.out.println(set);

//        String str = "First NonRepeated Character";
//        CharFinder find = new CharFinder(str);
//
//        char firstNonRepeatedChar = find.firstNonRepeatedChar();
//        System.out.println(firstNonRepeatedChar);
//
//        char firstRepeatedChar = find.firstRepeatedChar();
//        System.out.println(firstRepeatedChar);

        HashTable hashTable = new HashTable();
        hashTable.put(1, "entry1");
        hashTable.put(2, "entry2");
        hashTable.put(3, "entry3");
        hashTable.put(1, "new entry1");

        System.out.println(hashTable.get(1));

        hashTable.remove(5);
        System.out.println(hashTable);
    }
}
