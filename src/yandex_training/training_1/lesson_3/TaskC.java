package yandex_training.training_1.lesson_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class TaskC {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] mas = reader.readLine().trim().split(" ");
        int n = Integer.parseInt(mas[0]);
        int m = Integer.parseInt(mas[1]);

        TreeSet<Integer> anya = new TreeSet<>();
        TreeSet<Integer> result = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(reader.readLine());
            anya.add(num);
            result.add(num);
        }

        TreeSet<Integer> borya = new TreeSet<>();

        for (int i = 0; i < m; i++) {
            borya.add(Integer.parseInt(reader.readLine()));
        }


        result.retainAll(borya);
        System.out.println(result.size());
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
        anya.removeAll(result);
        System.out.println(anya.size());
        for (int num : anya) {
            System.out.print(num + " ");
        }
        System.out.println();
        borya.removeAll(result);
        System.out.println(borya.size());
        for (int num : borya) {
            System.out.print(num + " ");
        }
    }
}
