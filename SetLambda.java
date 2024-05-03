import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;

public class SetLambda {
  // main
  public static void main(String[] args) {
    // creating HashSet<Integer>
    Set<Integer> numSet = new HashSet<>();

    // loop to add elements
    for (int i = 1; i <= 20; i++) {
      numSet.add(i);
    }
    // print original set
    System.out.println("Original Set: " + numSet + "\n");

    // lambda for filtering even nums
    Set<Integer> evenNums = numSet.stream()
        .filter(n -> n % 2 == 0)
        .collect(Collectors.toSet());

    // printing even nums
    System.out.println("Even numbers in Set: " + evenNums + "\n");

    // lambda for maping set
    Set<Integer> squaredNums = numSet.stream()
        .map(num -> num * num)
        .collect(Collectors.toSet());

    // printing squared nums
    System.out.println("Squared numbers in Set: " + squaredNums);
  }
}
