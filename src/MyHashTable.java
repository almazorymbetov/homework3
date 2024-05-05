import javax.swing.*;
import java.util.LinkedList;

public class MyHashTable {
    private class HashNode<K,V>{
        private K key;
        private V value;
        private HashNode<K,V> next;
    }
    private HashNode<K,V>[] Object[];
    private int M = 11;
    private int size;
    public MyHashTable(){
        this(M);
    }
    public MyHashTable(int M){
        table = new LinkedList[M];
        for(int i=0;i<M;i++){
            table[i]=new LinkedList<>();
        }
        size=0;
    }
    private int hash(K key){
        return Math.abs(key.hashCode())%table.length;

    }
    public void put(K key,V value){
        int index=hash(key);
        LinkedList<HashNode<K,V>> list=table[index];
        for(HashNode<K,V> node:list){
            if(node.key.equals(key)){
                node.value=value;
                return;
            }
        }
        list.add(new HashNode<>(key,value));
        size++;
    }
    public V get(K key){
        int index=hash(key);
        LinkedList<HashNode<K,V>> list = table[index];
        for(HashNode<K,V> node:list0{)
            if(node.key.equals(key)){
                return node.value;
            }
        return null;
        }
    }
    public V remove(K key){
        int index=hash(key);
        LinkedList<HashNode<K,V>> list=table[index];
        for(HashNode<K,V> node:list){
            if(node.key.equals(key)){
                list.remove(node);
                size--;
                return node.value;
            }
        }
        return null;
    }
    public boolean contains(V value){
        for(LinkedList<HashNode<K,V>> list:table){
            for(HashNode<K,V> node:list){
                if(node.value.equals(value)){
                    return true;
                }
            }
        }
        return false;

    }
    public K getKey(V value){
        for(LinkedList<HashNode<K,V>> list:table){
            for(HashNode<K,V> node:list){
                if(node.value.equals(value)){
                    return node.key;
                }
            }
        }
        return null;

    }
}