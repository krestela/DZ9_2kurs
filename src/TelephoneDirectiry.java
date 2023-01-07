import java.util.HashMap;
import java.util.Map;

public class TelephoneDirectiry {
    public static void main(String[] args) {
        Map<String, String> telephoneDirectory = new HashMap<>();
        telephoneDirectory.put("Алексей Звонов", "89056325587");
        telephoneDirectory.put("Андрей Лукошко", "89057325587");
        telephoneDirectory.put("Кира Звонова", "89056825587");
        telephoneDirectory.put("Мария Звонова", "89056395587");
        telephoneDirectory.put("Зинаида Звон", "89056320587");
        telephoneDirectory.put("Алексей Звоник", "89056328587");
        telephoneDirectory.put("Аурика Звон", "89056327587");
        telephoneDirectory.put("Алексей Злоедов", "89056329587");
        telephoneDirectory.put("Рик Морти", "89056323587");
        telephoneDirectory.put("Алексей Самсонов", "89056325507");
        telephoneDirectory.put("Дарья Волк", "89056325500");
        telephoneDirectory.put("Акула Ром", "89056325599");
        telephoneDirectory.put("Маули Звезда", "89056325577");
        telephoneDirectory.put("Лина Звонова", "89056325566");
        telephoneDirectory.put("Леонид Звонов", "89056325555");
        telephoneDirectory.put("Джон Звонов", "89056325544");
        telephoneDirectory.put("Эл Звонов", "89056325533");
        telephoneDirectory.put("Зураб Звонов", "89056325522");
        telephoneDirectory.put("Кай Звонов", "89056325511");
        telephoneDirectory.put("Елена Звон", "89056325525");

        for (Map.Entry<String, String> contact: telephoneDirectory.entrySet()) {
            System.out.println("Контакт " + contact.getKey() + ": " + contact.getValue());
        }



    }
}