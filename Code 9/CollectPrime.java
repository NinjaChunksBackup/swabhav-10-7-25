// ### 9  Prime Partitioning Collector  *(Hard)*

// Write a single‑pass collector that partitions a list of integers into primes and non‑primes:
// Map<Boolean, List<Integer>> partition(List<Integer> ints) where `true` → primes. Use a running list of found primes inside the accumulator for efficient tests (no external loops).

// Key concepts  → stateful custom collector, efficient accumulation

import java.util.*;
import java.util.stream.Collectors;

public class CollectPrime {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> partitioned = partition(numbers);
        System.out.println("Primes: " + partitioned.get(true));
        System.out.println("Non-primes: " + partitioned.get(false));
    }

    public static Map<Boolean, List<Integer>> partition(List<Integer> ints) {
        return ints.stream().collect(Collectors.partitioningBy(CollectPrime::isPrime));
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}