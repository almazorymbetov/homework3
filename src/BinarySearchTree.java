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
    private Node put(Node x,K key,V val){
        int comp=key.compareTo(x.key);
        if(comp<0){
            x.left=put(x.left,key,val);
        }else if(comp>0){
            x.right=put(x.right,key,val);
        }else{
            x.val=val;
        }
        return x;
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
    private Node delete(Node x,K key){
        int comp=key.compareTo(x.key);
        if(comp<0){
            x.left=delete(x.left,key);
        }else if(comp>0){
            x.right=delete(x.right,key);
        }else{
            if(x.right==null){
                return x.left;
            }else{
                return x.right;
            }
        }
        return x;
    }
    public Iterable<K> iterator(){
        Queue<K> keys=new LinkedList<>();
        return keys;
    }
}
