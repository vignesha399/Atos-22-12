import java.util.*;
class Assending{
    public static void main(String[] args) {
        Queue <Integer> q = new ArrayDeque<>();
        q.offer(45);
        
        q.add(25);
        q.add(35);
        q.forEach(e -> System.out.println("stack is : "+e));
        System.out.println(q);
        // System.out.println(q.poll());
        // System.out.println(q.offer(12));
        // System.out.println(q.contains(12));
        // System.out.println(q.peek());
        // System.out.println(q.pop());
        System.out.println(q);
        
        System.out.println("----------------------------");
        Stack<Integer> stack = new Stack<>();
        stack.add(78);
        stack.forEach(e -> System.out.println(e));
        System.out.println(stack.size());
        System.out.println(stack.get(1));
    }
}