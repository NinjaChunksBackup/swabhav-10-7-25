// ### 2  Case‑Insensitive Distinct Word Count  *(Easy)*

// From List<String> words, compute the number of distinct words ignoring case ("Java" and "java" count once).

// Key concepts  → `map(String::toLowerCase), `distinct, count

// ---

import java.util.List;

public class WordCount {

    public static long distinctWordCount(List<String> words) {
        return words.stream()
                .map(String::toLowerCase)
                .distinct()
                .count();
    }

    public static void main(String[] args) {
        List<String> words = List.of("Java", "java", "JAVA", "Python", "python");
        System.out.println("Distinct Word Count: " + distinctWordCount(words));
    }
}