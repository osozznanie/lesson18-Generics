package Ex2;

import java.util.HashMap;
import java.util.Iterator;

public class Map<K, V> extends MyEntry<K, V> {
    private HashMap<K, V> map;

    public Map(K key, V value) {
        super(key, value);
        this.map = new HashMap<>();
    }

    public HashMap<K, V> getMap() {
        return map;
    }

    public void setMap(HashMap<K, V> map) {
        this.map = map;
    }

    public void addNew(K key, V value) {
        map.put(key, value);
    }

    public void removeByKey(K key) {
        map.remove(key);
    }

    public void removeByValue(K key){
        Iterator<java.util.Map.Entry<K, V>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            java.util.Map.Entry<K,V> next = iterator.next();

            if (next.getKey().equals(key)){
                next.setValue(null);
            }
        }
    }

    public void showKey(){
        Iterator<java.util.Map.Entry<K, V>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            java.util.Map.Entry<K,V> next = iterator.next();

            System.out.println(next.getKey());
        }
    }

    public void showValue(){
        Iterator<java.util.Map.Entry<K, V>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            java.util.Map.Entry<K,V> next = iterator.next();

            System.out.println(next.getValue());
        }
    }

    public void showMap(){
        Iterator<java.util.Map.Entry<K, V>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            java.util.Map.Entry<K,V> next = iterator.next();
            System.out.println("-------");
            System.out.println("Key = " +next.getKey());
            System.out.println("Value = "+next.getValue());
        }
    }

}