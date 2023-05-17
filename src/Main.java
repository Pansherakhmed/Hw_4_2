import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            a.add(scanner.next());

        }
        System.out.println(a);
        for (int i = 0; i < 5; i++) {
            b.add(scanner.next());

        }
        System.out.println(b);
        ArrayList<String> c = new ArrayList<>();
        c.add(0,a.get(0));
        c.add(1,b.get(4));
        c.add(2,a.get(1));
        c.add(3,b.get(3));
        c.add(4,a.get(2));
        c.add(5,b.get(2));
        c.add(6,a.get(3));
        c.add(7,b.get(1));
        c.add(8,a.get(4));
        c.add(9,b.get(0));

        c.sort(Comparator.comparing(String::length));
        System.out.println(c);

    }
}