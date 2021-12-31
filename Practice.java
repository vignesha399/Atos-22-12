import java.util.*;

class Practice{
        public static void main(String[] args){
            System.out.println("queue method for that : ");

            Queue<Double> qu = new ArrayDeque<>();
            qu.offer(23.44);
            qu.offer(34.34);
            qu.add(93.34);
            System.out.println(qu);
            Scanner s = new Scanner(System.in);
            System.out.println("Enter a number of Push the value into the Queue \n Exit from add to queue press 0.000");
            boolean stop = true;
            double d = 0.000;
            double pushno;
            int length = 0;
            try {
                while (stop){
                    if(stop==false){
                        System.exit(0);
                    }
                    length+=1;
                    
                    pushno = s.nextInt();
                    qu.offer(pushno);
                    if(pushno == d){
                        stop = false;
                    } 
                }
            } catch (InputMismatchException e) {
                System.out.println("always done go to next step");
            }
            s.close();
            System.out.println("You totally printed value is : "+ (length));
            System.out.println("totall value in index is : "+ qu.size());
            System.out.println("Enter for find the index value \n ( it work only once)");
            
            Scanner v = new Scanner(System.in);
            int index = qu.size()-1;
            try {
            index = v.nextInt();
            } catch (InputMismatchException e){
                System.out.println("You can't view the index value please go to next step");
            }
            catch( NoSuchElementException n){
                System.out.println("we can't provide that service for you \n default index value is last value");
            }
            int count = 0;
            Double one = 0.00;
            
            while(count< index){
                one = qu.poll();
                count++;
            }
            
            System.out.println(index+"  index value is : "+one);
            v.close();
        }
}