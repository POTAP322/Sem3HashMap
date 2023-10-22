import java.util.LinkedList;
import java.util.Set;

public class MyHashMultiMap<K,V> {
    private int size = 10;

    private MyHashMap<K, LinkedList<V>> myHashMap = new MyHashMap<>() ;
    public int getSize(){
        return myHashMap.getSize();
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
    public Set<K> keySet(){
        return myHashMap.KeySet();
    }
    public int entryCount(){
        return myHashMap.entryCount();
    }
    public static <K, V> void print(MyHashMultiMap<K, V> multimap) {
        for (K key : multimap.keySet()) {
            System.out.println(key +"- "+multimap.get(key));
        }
    }


//    public static printMyMultiHashMap(MyHashMultiMap<K, V> multimap,K key){
//        for (int i = 0; i < size; i++) {
//            System.out.println(multimap.get(key));
//        }
//    }





}
