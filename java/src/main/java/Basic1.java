import java.util.List;
import java.util.Map;

public class Basic1 {

    public void basic() {
        Map<String, Integer> a = Map.of("A", 1, "B", 2);
        System.out.println("a = " + a.get("A"));
        System.out.println("a = " + a.get("B"));

        a.forEach((key, value1) -> {
            System.out.println("key = " + key);
            System.out.println("key = " + value1);
        });
    }
    public void basic2() {
        Map<String, Integer> a = Map.of("A", 1, "B", 2);
        System.out.println("a = " + a.get("A"));
        System.out.println("a = " + a.get("B"));

        a.forEach((key, value1) -> {
            System.out.println("key = " + key);
            System.out.println("key = " + value1);
        });
    }
    private void basic3() {
        Map<String, Integer> a = Map.of("A", 1, "B", 2);
        System.out.println("a = " + a.get("A"));
        System.out.println("a = " + a.get("B"));

        a.forEach((key, value1) -> {
            System.out.println("key = " + key);
            System.out.println("key = " + value1);
        });
    }

}
