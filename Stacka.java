import java.util.Stack;

public class Stacka {
    public static void main(String[] args) {
        System.out.println("this is a Stack program ");
        Stack<Integer> stack =  new Stack<>();
        stack.push(56);
        stack.push(79);
        stack.push(34);
        stack.forEach(e -> System.out.println(e));
        System.out.println("\n ------------------------");
        System.out.print(stack.pop());
        System.out.println("\n ------------------------");
        stack.forEach(System.out::println);

    }
    
}
