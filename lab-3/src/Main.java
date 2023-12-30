public class Main {
    public static void main(String[] args) {
        HashTable<Integer, String> hashTable = new HashTable<>();
        hashTable.put(1, "1");
        hashTable.put(2, "2");
        hashTable.put(3, "3");

        System.out.println(hashTable.get(1));
        System.out.println(hashTable.get(2));

        hashTable.remove(1);
        System.out.println(hashTable.get(1));

        System.out.println(hashTable.size());
        System.out.println(hashTable.isEmpty());


        Student student = new Student("Vovan","Lukov",11,4);
        HashTable<Integer, Student> hashTable2 = new HashTable<>();

        hashTable2.put(1, student);
        hashTable2.printHashTable();
        hashTable.printHashTable();
        hashTable2.remove(1);
        System.out.println(hashTable2.get(1));
    }

}

