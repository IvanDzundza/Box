public class Main {
    public static void main(String[] args) {

        Box<String> stringBox = new Box<>();

        stringBox.setValue("Рядок 1");
        System.out.println(stringBox.getValue());

        stringBox.setValue("Рядок 2");
        System.out.println(stringBox.getValue());

    }
}