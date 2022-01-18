class Call{
    Car b;
    public void test(String name, String model, String color, double price){
       b = new Car(name, model, color, price);
    }
    
    public void printVar()  {
        System.out.println(b.name+"\n"+b.model+"\n"+b.color+"\n"+b.price+"\n");
    }
    public void run(){
        System.out.println("correct");
    }
}
