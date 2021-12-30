import java.util.*;
public class Lista {
    public static void main(String[] args) {

        System.out.println("Hello this is the list program in java");
        List<String> list =  new ArrayList<>();
        list.add("value no 1");
        list.add("array value");
        System.out.println(list);
        list.forEach(System.out::println);
    
    }
    
}
