package Chapter01;

public class Bai3 {

    interface Pair<K, V> {
        K getKey();
        V getValue();
    }

    static class OrderedPair<K, V> implements Pair<K, V> {
        private final K key;
        private final V value;

        public OrderedPair(K key, V value) {
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
    }

    public static void main(String[] args) {
        Pair<String, Integer> p1 = new OrderedPair<>("MSSV", 10170);
        Pair<String, String> p2 = new OrderedPair<>("HoTen", "Nguyen Thi Hoa");

        System.out.println(p1.getKey() + " = " + p1.getValue());
        System.out.println(p2.getKey() + " = " + p2.getValue());
    }
}