package Chapter01;

import java.util.HashSet;
import java.util.Set;

public class Bai6 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 2, 5, 8, 1};

        Set<Integer> set = new HashSet<>();
        for (int x : arr) {
            set.add(x);
        }

        System.out.println("Cac phan tu duy nhat: " + set);
        // hashset không đảm bảo thứ tự phần tử khi in ra.
        // Vì hashset lưu theo cấu trúc băm, thứ tự phụ thuộc vào hash và cách tổ chức bucket nội bộ,
        // nên có thể khác thứ tự ban đầu của mảng.
    }
}