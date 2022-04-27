package arrayList;

import java.util.ArrayList;

public class ArrayListDictionary {
    private ArrayList<ArrayListNameAgeSex> arrayList = new ArrayList<ArrayListNameAgeSex>();

    public void add(ArrayListNameAgeSex arrayList) {
        this.arrayList.add(arrayList);
    }

    public ArrayList<ArrayListNameAgeSex> find(String key) {
        ArrayList<ArrayListNameAgeSex> result = new ArrayList<>();
        for (ArrayListNameAgeSex arrayList : arrayList) {
            if (arrayList.getName().contains(key)) {
                result.add(arrayList);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "ArrayListDictionary{" + "arrayList=" + arrayList + '}';
    }

    public static void main(String[] args) {
        ArrayListDictionary arrayListDictionary = new ArrayListDictionary();
        arrayListDictionary.add(new ArrayListNameAgeSex("John", 25, "male"));
        arrayListDictionary.add(new ArrayListNameAgeSex("Mari", 17, "female"));
        arrayListDictionary.add(new ArrayListNameAgeSex("Tony", 32, "male"));
        arrayListDictionary.add(new ArrayListNameAgeSex("Scarlet", 42,
                "female"));
        ArrayList<ArrayListNameAgeSex> list = arrayListDictionary.find("Tony");
        ArrayListNameAgeSex nameTony = list.get(0);
        System.out.println(nameTony);
        System.out.println(arrayListDictionary);
    }
}
