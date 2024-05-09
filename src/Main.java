public class Main {
    public static void main(String[] args) {
        MyHashTable myHashTable = new MyHashTable(5);
        myHashTable.put(1,"one");
        myHashTable.put(2,"two");
        myHashTable.put(3,"three");
        myHashTable.remove(2);
        for(int i=0;i<6;i++){
            System.out.println(i+" "+myHashTable.get(i));
            System.out.println();
        }
    }
}