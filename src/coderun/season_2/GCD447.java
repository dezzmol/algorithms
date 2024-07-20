package coderun.season_2;

import java.math.BigInteger;
import java.util.*;

public class GCD447 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] b = new int[m];

        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }

        List<Integer> listA = factorizeArray(a);
        List<Integer> listB = factorizeArray(b);

        BigInteger gcd = findGCD(listA, listB);
        String result = gcd.toString();

        if (result.length() > 9) {
            result = result.substring(result.length() - 9);
        }
        System.out.println(result);
    }

    public static BigInteger findGCD(List<Integer> factors1, List<Integer> factors2) {
        Map<Integer, Integer> map1 = getFrequencyMap(factors1);
        Map<Integer, Integer> map2 = getFrequencyMap(factors2);

        BigInteger gcd = BigInteger.ONE;
        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            int prime = entry.getKey();
            if (map2.containsKey(prime)) {
                int minPower = Math.min(entry.getValue(), map2.get(prime));
                gcd = gcd.multiply(BigInteger.valueOf(prime).pow(minPower));
            }
        }
        return gcd;
    }

    private static Map<Integer, Integer> getFrequencyMap(List<Integer> factors) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int factor : factors) {
            frequencyMap.put(factor, frequencyMap.getOrDefault(factor, 0) + 1);
        }
        return frequencyMap;
    }

    public static List<Integer> factorizeArray(int[] numbers) {
        List<Integer> factorizations = new ArrayList<>();

        for (int number : numbers) {
            factorizations.addAll(primeFactors(number));
        }

        return factorizations;
    }

    public static List<Integer> primeFactors(int number) {
        List<Integer> factors = new ArrayList<>();

        while (number % 2 == 0) {
            factors.add(2);
            number /= 2;
        }

        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                factors.add(i);
                number /= i;
            }
        }

        if (number > 2) {
            factors.add(number);
        }

        return factors;
    }
}
