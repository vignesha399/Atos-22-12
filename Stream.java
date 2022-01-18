import java.util.*;

public class Stream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        for(int i=1; i<=5;i++){
            int value = s.nextInt();
            list.add(value);
        }
        s.close();
        System.out.println("You added value is : "+list.size());
        
        System.out.println(list.stream().filter(a -> (a%3==2)));
        list.sort((a,b) -> {if(a>b) {return -1 ;}else{return 0;}});

    }
}
