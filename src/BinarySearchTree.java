import java.util.LinkedList;
import java.util.Queue;
public class BinarySearchTree <K extends Comparable<K>,V>{
    private Node root;
    private class Node{
        private K key;
        private V val;
        private Node left, right;
        public Node(K key,V val){
            this.key=key;
            this.val=val;
        }
    }
    public void put(K key,V val){
        root=put(root,key,val);
    }
    public V get(K key){
        Node x=root;
        while(x!=null){
            int comp=key.compareTo(x.key);
            if(comp<0){
                x=x.left;
            }else if(comp>0){
                x=x.right;
            }else{
                return x.val;
            }
        }
        return null;
    }
    public void delete(K key){
        root =delete(root,key);
    }
    public Iterable<K> iterator(){
        Queue<K> keys=new LinkedList<>();
        return keys;
    }
}
