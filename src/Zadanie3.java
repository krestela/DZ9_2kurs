import java.util.HashMap;
import java.util.Map;

public class Zadanie3 {
    private final Map<String, Integer> test = new HashMap<>();
    public void main(String[] args) {
        test.put("Test", 11);
        test.put("Testik", 34);
    }

    public void addNumber(String s, Integer i){
        if (test.containsKey(s) && test.containsValue(i)){
            throw new RuntimeException(test + " ключ уже есть и значения совпадают");
        }
        test.put(s,i);
    }
}
