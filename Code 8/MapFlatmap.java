// ### 8  `map` vs `flatMap` Demonstration  *(Medium)*

// For List<String> sentences>:

// 1. Use `map` to create List<List<String>> where each inner list contains the words of that sentence.
// 2. Use `flatMap` to create a sorted, unique list of all words across all sentences.

// Briefly comment (one sentence) on the conceptual difference between the two operations.

// Key concepts  → `map`, flatMap, split, distinct, sorted

// ---

import java.util.*;
import java.util.stream.*;
public class MapFlatmap {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
            "Hello world",
            "Java streams are powerful",
            "FlatMap is different from map"
        );

        List<List<String>> wordsInSentence = sentences.stream()
            .map(sentence -> Arrays.asList(sentence.split(" ")))
            .collect(Collectors.toList());

        System.out.println("Words in sentence: " + wordsInSentence);

        List<String> uniqueSortedWords = sentences.stream()
            .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
            .distinct()
            .sorted()
            .collect(Collectors.toList());

        System.out.println("Unique sorted words: " + uniqueSortedWords);
    }
}