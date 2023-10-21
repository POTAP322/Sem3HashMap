import java.util.LinkedList;

public class MyHashMultiMap<K,V> {
    private int size = 10;
    private MyHashMap<K, LinkedList<V>> myHashMap = new MyHashMap<>() ;
    public int getSize(){
        return myHashMap.entryCount();
    }
    public boolean isEmpty(){
        return myHashMap.isEmpty();
    }
    public void put(K key, V value){
        LinkedList<V> values = myHashMap.get(key);
        if(values == null){
            values = new LinkedList<>();
        }
        values.add(value);
        myHashMap.put(key,values);
    }
    public LinkedList<V> get(K key){
        return myHashMap.get(key);
    }
    public void remove(K key){
        myHashMap.remove(key);
    }
    public void printMyMultiHashMap(){
        myHashMap.printMyHashMap();
    }





}
