package Chapter04;

@FunctionalInterface
interface MathOperation {
    int compute(int a, int b);
}

        
public class Bai1 {
    public static void main(String[] args) {

        MathOperation cong = (a, b) -> a + b;
        MathOperation tru = (a, b) -> a - b;
        MathOperation nhan = (a, b) -> a * b;
        MathOperation chia = (a, b) -> a / b;

        System.out.println("Cong: " + cong.compute(10, 5));
        System.out.println("Tru: " + tru.compute(10, 5));
        System.out.println("Nhan: " + nhan.compute(10, 5));
        System.out.println("Chia: " + chia.compute(10, 5));
    }
}
