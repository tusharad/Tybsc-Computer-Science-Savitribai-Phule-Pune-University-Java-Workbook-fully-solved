/*
2. Construct a linked List containing names of colors: red, blue, yellow and orange. Then
extend your program to do the following:
i.
 Display the contents of the List using an Iterator;
ii.
 Display the contents of the List in reverse order using a ListIterator;
iii. Create another list containing pink and green. Insert the elements of this list
between blue and yellow.

*/
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Ex7a2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("red");
        list.add("blue");
        list.add("yellow");
        list.add("orange");

        Iterator<String> i = list.iterator();

        System.out.println("List is: ");
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        ListIterator<String> l = list.listIterator(list.size());

        System.out.println("List in previous manner: ");
        while (l.hasPrevious()) {
            System.out.println(l.previous());
        }

        LinkedList<String> list2 = new LinkedList<String>();

        list2.add("pink");
        list2.add("green");
        list.addAll(2, list2);

        System.out.println("New List added: ");
        Iterator<String> i2 = list.iterator();
        while (i2.hasNext()) {
            System.out.println(i2.next());
        }
    }
}
