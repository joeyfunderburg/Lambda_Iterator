import java.util.HashSet;

public class SetOperations {
  public static void main(String[] args) {
    // Create and populate sets
    HashSet<Integer> set1 = new HashSet<>();
    set1.add(1);
    set1.add(2);
    set1.add(3);
    set1.add(4);

    HashSet<Integer> set2 = new HashSet<>();
    set2.add(3);
    set2.add(4);
    set2.add(5);
    set2.add(6);

    // Perform union
    HashSet<Integer> union = new HashSet<>(set1);
    union.addAll(set2);
    System.out.println("Union: " + union);

    // Perform intersection
    HashSet<Integer> intersection = new HashSet<>(set1);
    intersection.retainAll(set2);
    System.out.println("Intersection: " + intersection);

    // Perform difference (elements in set1 but not in set2)
    HashSet<Integer> difference = new HashSet<>(set1);
    difference.removeAll(set2);
    System.out.println("Difference (set1 - set2): " + difference);
  }
}
