import java.util.Random;
public class Test {
    public int value;
    public Test(int value){
        this.value=value;
    }
    public static void main(String[] args){
        Random rand = new Random();
        MyHashTable<Test,String> table =new MyHashTable<>(99999);
        for(int i=0;i<99999;i++){
            int randv=rand.nextInt(99999);
            Test key =new Test(randv);
            table.put(key," " + randv);
        }
        for(int i=0;i<table.table.length;i++){
            System.out.println(i+" "+table.table[i].size());
        }

        System.out.println();

        BinarySearchTree<Integer,String> tree = new BinarySearchTree<>();
        tree.put(45,"half of 90");
        tree.put(3,"three");
        tree.put(999,"999");
        for (BinarySearchTree<Integer,String>.iteration iter : tree.iterator()) {
            System.out.println("key is"+iter.getKey()+" and value is "+iter.getValue());
        }
    }
}
