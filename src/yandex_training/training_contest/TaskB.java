package yandex_training.training_contest;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Map<Integer, List<RocketEvent>> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();
            int h = scanner.nextInt();
            int m = scanner.nextInt();
            int id = scanner.nextInt();
            String status = scanner.next();

            if (!map.containsKey(id)) {
                map.put(id, new ArrayList<>());
            }
            map.get(id).add(new RocketEvent(d, h, m, status));
        }

        for (Map.Entry<Integer, List<RocketEvent>> mp : map.entrySet()) {
            System.out.println(getTime(mp.getValue()));
        }
    }

    private static long getTime(List<RocketEvent> rocketEvents) {
        rocketEvents.sort(Comparator
                .comparingInt((RocketEvent r) -> r.day)
                .thenComparingInt((RocketEvent r) -> r.hour)
                .thenComparingInt((RocketEvent r) -> r.minutes));

        long sum = 0;
        long startTime = 0;
        for (RocketEvent event : rocketEvents) {
            if (Objects.equals(event.status, "A")) {
                startTime = event.day * 1440L + event.hour * 60L + event.minutes;
            }
            if (Objects.equals(event.status, "S") || Objects.equals(event.status, "C")) {
                long currTime = event.day * 1440L + event.hour * 60L + event.minutes;
                sum += currTime - startTime;
            }

        }

        return sum;
    }

    static class RocketEvent {
        int day;
        int hour;
        int minutes;
        String status;

        public RocketEvent(int day, int hour, int minutes, String status) {
            this.day = day;
            this.hour = hour;
            this.minutes = minutes;
            this.status = status;
        }
    }
}
