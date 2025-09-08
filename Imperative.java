//EXERT1.java
//Jarelt Rallos, BSIT-2E

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImperativeExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
       

        int sumOfSquares = calculateSumOfSquaresOfEvens(numbers);
        System.out.println("Sum of squares of even numbers: " + sumOfSquares);

        
        List<String> words = Arrays.asList("hello", "world", "java");
        String concatenatedUpperCase = concatenateToUpperCase(words);
        System.out.println("Concatenated uppercase: " + concatenatedUpperCase);
    }

    
    public static int calculateSumOfSquaresOfEvens(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }

        List<Integer> squaredEvenNumbers = new ArrayList<>();
        for (int number : evenNumbers) {
            squaredEvenNumbers.add(number * number);
        }

        int sumOfSquares = 0;
        for (int number : squaredEvenNumbers) {
            sumOfSquares += number;
        }
        return sumOfSquares;
    }

    public static String concatenateToUpperCase(List<String> words) {
        StringBuilder concatenatedUpperCase = new StringBuilder(); 
        for (String word : words) {
            concatenatedUpperCase.append(word.toUpperCase()); 
        }
        return concatenatedUpperCase.toString(); 
    }
}

