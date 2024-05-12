import java.util.LinkedList;
import java.util.Queue;
public class BinarySearchTree <K extends Comparable<K>,V>{
    private int size;
    private Node root;
    public class iteration{
        public K key;
        public V value;
        public iteration(K key,V value){
            this.key=key;
            this.value=value;
        }
        public K getKey(){
            return key;
        }
        public V getValue(){
            return value;
        }
    }
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

        if(x==null){
            return new Node(key,val);
        }
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
    public int size(){
        return size;
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
    public Iterable<iteration> iterator(){
        Queue<iteration> keys=new LinkedList<>();
        inorder(root,keys);
        return keys;
    }
    private void inorder(Node x,Queue<iteration> keys){
        if(x==null){
            return;
        }
        inorder(x.left,keys);
        keys.add(new iteration(x.key,x.val));
        inorder(x.right,keys);
    }
}
