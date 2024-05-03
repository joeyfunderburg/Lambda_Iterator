import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIterators {
  public static void main(String[] args) {
    // creating HashSet<Integer>
    Set<Integer> numSet = new HashSet<Integer>();

    // loop to add elements
    for (int i = 1; i <= 20; i++) {
      numSet.add(i);
    }
    // creating iterator
    Iterator<Integer> iterate = numSet.iterator();

    System.out.println("All even elements in Set: ");

    // iterate through set
    while (iterate.hasNext()) {
      int element = iterate.next();
      // check if element is even, print if it is
      if (element % 2 == 0) {
        System.out.println(element);
      }
    }
  }
}
