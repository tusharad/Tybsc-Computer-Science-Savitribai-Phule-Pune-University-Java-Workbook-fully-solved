import java.util.Enumeration;
import java.util.Hashtable;

public class Ex7a3 {
    public static void main(String[] args) {
        Hashtable<String, Double> score = new Hashtable<>();
        Enumeration<String> names;
        String str;

        score.put("Tushar", 97.60);
        score.put("Nehal", 77.60);
        score.put("Ishan", 52.50);
        score.put("Paras", 57.10);
        score.put("Lalit", 68.34);

        names = score.keys();
        while (names.hasMoreElements()) {
            str = (String) names.nextElement();
            System.out.println(str + ":" + score.get(str) + " %");
        }
        System.out.println();
        System.out.println("Tushar " + score.get("Tushar") + "%");
    }
}
