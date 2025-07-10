// ### 4  Flatten & Alphabetise  *(Medium)*

// From List<List<String>> nested, produce a single alphabetically sorted list of all non‑blank items (skip null or empty strings).

// Key concepts  → `flatMap`, filter, sorted

// ---

import java.util.*;

public class Flatten {
    public static void main(String[] args) {
        List<List<String>> nested = Arrays.asList(
            Arrays.asList("apple", "", null, "banana"),
            Arrays.asList("dog", "cat", ""),
            Arrays.asList(null, "elephant", "bat")
        );

        List<String> result = new ArrayList<>();
        for (List<String> inner : nested) {
            for (String s : inner) {
                if (s != null && !s.isEmpty()) {
                    result.add(s);
                }
            }
        }
        Collections.sort(result);
        System.out.println(result);
    }
}