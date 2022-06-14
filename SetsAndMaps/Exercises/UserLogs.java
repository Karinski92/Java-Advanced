package Advanced.SetsAndMaps.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        Map<String, Map<String, Integer>> userLog = new TreeMap<>();
        while (!"end".equals(input = scanner.nextLine())) {
            String [] info = input.split("\\s+");
            String IP = info[0].split("=")[1];
            String user = info[2].split("=")[1];
            userLog.putIfAbsent(user, new LinkedHashMap<>());
            userLog.get(user).putIfAbsent(IP, 0);
            userLog.get(user).put(IP, userLog.get(user).get(IP)+1);
        }
        System.out.println(userLog.entrySet().stream().map(p -> String.format("%s:%n%s.",p.getKey(),
                p.getValue().entrySet().stream().map(e -> String.format("%s => %d",e.getKey(),
                        e.getValue())).collect(Collectors.joining(", ")))).collect(Collectors.joining(System.lineSeparator())));

    }
}

