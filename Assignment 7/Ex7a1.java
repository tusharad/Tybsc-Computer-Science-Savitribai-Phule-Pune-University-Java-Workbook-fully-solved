/*
1. Accept ‘n’ integers from the user and store them in a collection. Display them in the
sorted order. The collection should not accept duplicate elements. (Use a suitable
collection). Search for an particular element using predefined search method in the
Collection framework.
*/
import java.util.*;

public class Ex7a1 {
    public static void main(String[] args) {
      System.out.println("Enter value for n:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        SortedSet<Integer> list = new TreeSet<Integer>();
        for (int i = 0; i < n; i++) {
          System.out.println("Enter "+i+1 +"th value");
            int num = in.nextInt();
            list.add(num);
        }
        Iterator<Integer> i = list.iterator();
        System.out.println("List is:");
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        in.close();
    }
}
