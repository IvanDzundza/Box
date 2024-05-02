import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Box<String> stringBox = new Box<>();

        stringBox.setValue("Рядок 1");
        System.out.println(stringBox.getValue());

        stringBox.setValue("Рядок 2");
        System.out.println(stringBox.getValue());

        Box<Integer> intBox = new Box<>();

        intBox.setValue(88);
        System.out.println(intBox.getValue());

        Pair<Integer, String> p1 = new Pair<>(99, "LLL");
        Pair<Integer, String> p2 = new Pair<>(88, "KKK");
        Pair<Integer, String> p3 = new Pair<>(66, "AAA");
        System.out.println(p1);
        System.out.println(p2);

        List<Pair<Integer,String>> pairs = new ArrayList<>();
        pairs.add(p1);
        pairs.add(p2);
        pairs.add(p3);
        System.out.println(pairs);
        Collections.sort(pairs);
        System.out.println(pairs);
    }
}