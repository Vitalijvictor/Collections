package arrayList;

import java.util.ArrayList;

public class ArrayListNative {
    public static void main(String[] args) {
        ArrayList names = new ArrayList();
        names.add("Petr");
        names.add("Hans");
        names.add("Theo");
        names.set(0, "Ivan");
        names.remove(0); //Ivan
        for (int index = 0; index < names.size(); index++) {
            Object value = names.get(index);
            System.out.println(value);
        }

        /**
         * preferable for-each
         */
        System.out.println(System.lineSeparator());
        for (Object value : names) {
            System.out.println(value);
        }
    }
}
