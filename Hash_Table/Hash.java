package Hash_Table;

import java.util.ArrayList;

public class Hash {
   // Number of buckets
    private final int bucket;
    // Hash table of size bucket
    private final ArrayList<Integer>[] table;

    @SuppressWarnings("unchecked")
    public Hash(int bucket)
    {
        this.bucket = bucket;
        this.table = (ArrayList<Integer>[]) new ArrayList[bucket];
        for (int i = 0; i < bucket; i++) {
            table[i] = new ArrayList<>();
        }
    }

    // hash function to map values to key
    public int hashFunction(int key)
    {
        return (key % bucket);
    }

    public void insertItem(int key)
    {
        int index = hashFunction(key);
        table[index].add(key);
    }

    public void deleteItem(int key)
    {
        int index = hashFunction(key);
        table[index].remove(Integer.valueOf(key));
    }

    public void displayHash()
    {
        for (int i = 0; i < bucket; i++) {
            System.out.print(i);
            for (int x : table[i]) {
                System.out.print(" --> " + x);
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int[] a = { 15, 11, 27, 8, 12 };

        Hash h = new Hash(7);

        for (int x : a) {
            h.insertItem(x);
        }

        h.deleteItem(12);
        h.displayHash();
    }

}
