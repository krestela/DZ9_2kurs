import java.util.HashMap;
import java.util.Map;

public class Zadanie3 {
    private static final Map<String, Integer> test = new HashMap<>();
    public static void main(String[] args) {
        test.put("Test", 11);
        test.put("Testik", 34);
        test.put("Test", 34);
    }

    public static void addNumber(String s, Integer i){
        if (test.keySet().equals(i)){
            throw new RuntimeException(test + " ключ уже есть или значения совпадают");
        }
        test.put(s,i);
    }
}
