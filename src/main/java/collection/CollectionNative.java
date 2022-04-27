package collection;

import java.util.Collection;

public class CollectionNative {
    public static void main(String[] args) {
        java.util.Collection<String> collection = new java.util.ArrayList<String>();
        collection.add("one");
        collection.add("two");
        collection.add("three");
        for (String str : collection) {
            System.out.println(str);
        }
    }
}
