package Advanced.SetsAndMaps.Exercises;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;

public class HandCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        Map<String, Integer> deckOutput = new LinkedHashMap<>();
        Map<String, LinkedHashSet<String>> cardsSpecial = new LinkedHashMap<>();
        Map<Character, Integer> deckValue = new LinkedHashMap<>();
        Map<Character, Integer> cardType = new LinkedHashMap<>();
        deckValue.put('J', 11);
        deckValue.put('Q', 12);
        deckValue.put('K', 13);
        deckValue.put('A', 14);
        cardType.put('C', 1);
        cardType.put('D', 2);
        cardType.put('H', 3);
        cardType.put('S', 4);
        while (!"JOKER".equals(input = scanner.nextLine())) {
            String name = input.split(":\\s+")[0];
            deckOutput.putIfAbsent(name, 0);
            cardsSpecial.putIfAbsent(name, new LinkedHashSet<>());
            String[] cards = input.split(":\\s+")[1].split(",\\s+");
            int points=0;
            for (String card : cards) {
                if(cardsSpecial.get(name).add(card)){
                    points += (deckValue.containsKey(card.charAt(0))
                            ? deckValue.get(card.charAt(0))
                            : Integer.parseInt(card.substring(0, card.length()-1)))
                            * cardType.get(card.charAt(card.length()-1));
                }
            }
            deckOutput.put(name, deckOutput.get(name)+ points);
        }
        deckOutput.forEach((k, v)-> System.out.println(k + ": " + v));
    }
}