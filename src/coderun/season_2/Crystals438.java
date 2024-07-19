package coderun.season_2;

import java.util.*;

public class Crystals438 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String f = scanner.nextLine();
        String s = scanner.nextLine();
        String t = scanner.nextLine();

        if (!compareStrings(f, s, t)) {
            System.out.println("IMPOSSIBLE");
            return;
        }

        List<Pair> fPairs = getList(f);
        List<Pair> sPairs = getList(s);
        List<Pair> tPairs = getList(t);

        System.out.println(getShortestString(fPairs, sPairs, tPairs));
    }

    private static boolean compareStrings(String str1, String str2, String str3) {
        String uniqueStr1 = removeDuplicates(str1);
        String uniqueStr2 = removeDuplicates(str2);
        String uniqueStr3 = removeDuplicates(str3);

        return uniqueStr1.equals(uniqueStr2) && uniqueStr2.equals(uniqueStr3);
    }

    public static String removeDuplicates(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        StringBuilder result = new StringBuilder();
        result.append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar != result.charAt(result.length() - 1)) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }

    private static List<Pair> getList(String string) {
        List<Pair> pairs = new ArrayList<>();

        char[] chars = string.toCharArray();
        int count = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                count++;
            } else {
                pairs.add(new Pair(chars[i - 1], count));
                count = 1;
            }
        }
        pairs.add(new Pair(chars[string.length() - 1], count));

        return pairs;
    }

    private static String getShortestString(List<Pair> fPairs, List<Pair> sPairs, List<Pair> tPairs) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < fPairs.size(); i++) {
            int fCount = fPairs.get(i).getCount();
            int sCount = sPairs.get(i).getCount();
            int tCount = tPairs.get(i).getCount();
            int[] array = new int[]{fCount, sCount, tCount};
            Arrays.sort(array);
            int median = array[1];
            stringBuilder.repeat(fPairs.get(i).getCharacter(), median);
        }
        return stringBuilder.toString();
    }

    static class Pair {
        Character character;
        Integer count;

        public Pair(Character character, Integer count) {
            this.character = character;
            this.count = count;
        }

        public Character getCharacter() {
            return character;
        }

        public void setCharacter(Character character) {
            this.character = character;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "character=" + character +
                    ", count=" + count +
                    '}';
        }
    }
}
