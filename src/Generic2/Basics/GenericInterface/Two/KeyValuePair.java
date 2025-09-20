package Generic2.Basics.GenericInterface.Two;

//Here, the Pair interface defines two generic type parameters K and V.

class KeyValuePair<K, V> implements Pair<K, V> {

    private K key;
    private V value;

    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        Pair <String, Integer> pair = new KeyValuePair<>("Age", 30);
        System.out.println(pair.getKey() + ": " + pair.getValue());
    }
}