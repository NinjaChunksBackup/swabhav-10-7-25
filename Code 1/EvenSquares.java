// ### 1  Even Squares  *(Easy)*

// Given List<Integer> nums, return a new list containing the squares of the even numbers in original order using Streams.

// Key concepts  → `filter`, map, collect(Collectors.toList())

// ---

import java.util.List;
import java.util.stream.Collectors;

public class EvenSquares {
    
    public static List<Integer> getEvenSquares(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n % 2 == 0) 
                .map(n -> n * n)          
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        System.out.println("Even Squares: " + getEvenSquares(numbers));

    }
}