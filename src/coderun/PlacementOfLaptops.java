package coderun;

import java.util.Scanner;

// https://coderun.yandex.ru/problem/arrangement-laptops?currentPage=1&groups=%D0%90%D0%BB%D0%B3%D0%BE%D1%80%D0%B8%D1%82%D0%BC%D1%8B&pageSize=10&rowNumber=102
public class PlacementOfLaptops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int w1 = scanner.nextInt();
        int h1 = scanner.nextInt();

        int w2 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int newW = 0, newH = 0;
        int min = Integer.MAX_VALUE;
        if (min > ((w1 + w2) * Math.max(h1, h2))) {
            min = ((w1 + w2) * Math.max(h1, h2));
            newW = w1 + w2;
            newH = Math.max(h1, h2);
        } else if (min > ((w1 + h2) * Math.max(w2, h1))) {
            min = ((w1 + h2) * Math.max(w2, h1));
            newW = w1 + h2;
            newH = Math.max(w2, h1);
        } else if (min > ((h1 + h2) * Math.max(w1, w2))) {
            min = ((h1 + h2) * Math.max(w1, w2));
            newW = h1 + h2;
            newH = Math.max(w1, w2);
        } else {
            min = ((h1 + w2) * Math.max(w1, h2));
            newW = h1 + w2;
            newH = Math.max(w1, h2);
        }

        System.out.println(newW + " " + newH);
    }
}
