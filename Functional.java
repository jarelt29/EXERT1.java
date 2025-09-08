//Jarelt Rallos BSIT-2E
//exer1_Functional
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Functional {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

       
        Predicate<Integer> isEven = n -> n % 2 == 0;
        List<Integer> evenNumbers = filterList(numbers, isEven);
        System.out.println("Even numbers: " + evenNumbers);

        
        Function<Integer, Integer> square = n -> n * n;
        List<Integer> squaredNumbers = mapList(numbers, square);
        System.out.println("Squared numbers: " + squaredNumbers);

        
        List<Integer> evenSquaredNumbers = numbers.stream()
                                                  .filter(isEven)
                                                  .map(square)
                                                  .collect(Collectors.toList());
        System.out.println("Even squared numbers: " + evenSquaredNumbers);


        List<String> names = Arrays.asList("alice", "bob", "charlie", null);
        Function<String, String> toUpperCase = String::toUpperCase;
        List<String> upperCaseNames = mapList(names, s -> Optional.ofNullable(s).map(toUpperCase).orElse(null));
        System.out.println("Uppercase names: " + upperCaseNames);


        List<String> namesStartingWithA = filterList(Arrays.asList("alice", "bob", "anna"), s -> s.startsWith("a"));
        System.out.println("Names starting with 'a': " + namesStartingWithA);
    }

    public static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
        return list.stream()
                   .filter(predicate)
                   .collect(Collectors.toList());
    }

    public static <T, R> List<R> mapList(List<T> list, Function<T, R> function) {
        return list.stream()
                   .map(function)
                   .collect(Collectors.toList());
    }
}
