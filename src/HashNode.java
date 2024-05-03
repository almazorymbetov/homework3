public class HashNode {
    private K key;
    private V value;
    private HashNode<K,V> next;
    public HashNode(K key,V value){
        this.key=key;
        this.value=value;
    }
    @Override
    public String toStr(){
        return "{" + key + " " + value + "}";
    }
}
