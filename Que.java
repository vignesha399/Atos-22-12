import java.util.*;
class Que{
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();

        q.add(10);
        q.add(23);
        q.add(45); 
        q.add(12);
    
        q.forEach(System.out::println);
        q.forEach(e -> System.out.println(e));

    }
}