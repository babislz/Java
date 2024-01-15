package Others;
import java.util.ArrayList;
import java.util.List;

public class KeyValuePair<K, V> {
    private List<Entry<K, V>>[] data;
    private int sizeArray;

    public KeyValuePair(int size) {
        sizeArray = size;
        data = new ArrayList[size];

        for (int i = 0; i < size; i++) {
            data[i] = new ArrayList<>();
        }
    }

    public void put(K key, V value) {
        int index = Math.abs(key.hashCode() % data.length);

        for (Entry<K, V> entry : data[index]) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }

        data[index].add(new Entry<>(key, value));
    }

    public V get(K key) {
        int index = Math.abs(key.hashCode() % data.length);

        for (Entry<K, V> entry : data[index]) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }

        return null;
    }

    private static class Entry<K, V> {
        private final K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}
