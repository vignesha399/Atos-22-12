package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public int app(int a, int b){
        System.out.println(a+b);
        return a+b;
    }
    public double Double(int a, int b) {

        return 0;
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App app = new App();
        app.app(3,3);
        app.Double(3, 44);

        

    }
}
