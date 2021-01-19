import java.util.*;

public class Ex7a1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        SortedSet<Integer> list = new TreeSet<Integer>();
        for (int i = 0; i < n; i++) {
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
