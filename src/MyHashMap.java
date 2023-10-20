public class MyHashMap<K, V> {
    private int size = 100;
    private Entry<K, V>[] table = new Entry[size];

    static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;

        public Entry(K key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    public void put(K key, V value) {
        Entry<K, V> entry = new Entry<K, V>(key, value, null);
        if (key == null) {
            System.out.println("the key cannot be null");
        } else {
            int hashKey = key.hashCode();
            if (table[hashKey] == null) { //если место не занято
                table[hashKey] = entry;
            } else {
                Entry<K, V> previous = null;
                Entry<K, V> current = table[hashKey];
                while (current != null) {
                    if (current.key.equals(key)) { //если узел занят и он equals нашему новому узлу, то заменяем
                        if (previous == null) { //предыдущего нету(тобишь курент - первый)
                            entry.next = current.next;//просто заменяем но новое
                            table[hashKey] = entry;
                            return;
                        } else {
                            entry.next = current.next; //заменяем, но ещё делаем значением next для предыдущего
                            previous.next = entry;
                            return;
                        }
                    }
                    previous = current; //пока узел занят, сдвигаемся вперед
                    current = current.next;
                }
                previous.next = entry; //тобишь для entry даём позицию курента
            }
        }
    }

    public void printMyHashMap() {
        for (int i = 0; i < size; i++) {
            if (table[i] != null) {
                Entry<K, V> entry = table[i];
                while (entry != null) {
                    System.out.println("(" + entry.key + "{" + entry.key.hashCode() + "}" + ":" + entry.value + " " + entry.next + ") ");
                    entry = entry.next;
                }
            }
        }
    }

    public V get(K key) {
        if (key == null) {
            System.out.println("the key cannot be null");
        } else {
            int hashKey = key.hashCode();
            if (table[hashKey] == null) {
                return null;
            } else {
                Entry<K, V> current = table[hashKey];

                if (current.key.equals(key)) {
                    return current.value;
                } else {
                    while (!current.key.equals(key)) {
                        current = current.next;
                    }
                    return current.value;
                }
            }
        }
        return null;
    }

    public void remove(K key) {
        if (key == null) {
            System.out.println("the key cannot be null");
        } else {
            int hashKey = key.hashCode();
            if (table[hashKey] == null) {
                System.out.println("nothing was found for this key");
            } else {
                Entry<K, V> current = table[hashKey];
                Entry<K, V> previous = null;
                while (current != null){
                    if (current.key.equals(key)) {
                        if (previous == null) { //предыдущего нету(тобишь курент - первый)
                            table[hashKey] = table[hashKey].next;
                        } else {
                            previous.next = current.next;
                        }
                    }
                    previous = current;  //сдвигаем вперед
                    current = current.next;
                }
            }
        }
    }
    public int size(){
        int counter = 0;
        for (int i = 0; i < size; i++) {
            if (table[i] !=null){
                Entry<K,V> entry = table[i];
                while (entry != null){
                    counter+=1;
                    entry = entry.next;
                }
            }
        }
        return counter;
    }

    public boolean isEmpty(){
        for (int i = 0; i < size; i++) {
            if (table[i] != null){
                return false;
            }
        }
        return true;
    }

}
