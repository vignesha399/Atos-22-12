import java.util.HashMap;

public class Mapon {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "value no 1");
        map.put("2", "value no 2");
        System.out.println(map);
        System.out.println(map.get("2"));
        map.forEach((a, b) -> System.out.println("Map is :"+ a +" : "+ b));    
    }
}
