package Chapter01;

public class Bai1 {

    static class Test<T> {
        private T value;

        public void set(T t) {
            this.value = t;
        }

        public T get() {
            return value;
        }
    }

    public static void main(String[] args) {
        Test<Integer> tInt = new Test<>();
        tInt.set(123);
        System.out.println("Test<Integer>: " + tInt.get());

        Test<String> tStr = new Test<>();
        tStr.set("Hello NetBeans");
        System.out.println("Test<String>: " + tStr.get());
    }
}