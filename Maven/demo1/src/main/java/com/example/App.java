package com.example;

import java.io.InputStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static InputStream java;
    public static int add(int a, int b){
        return a+b;
    }
    public static int sub(int a, int b) {
        return a-b;
    }
    public static int mul(int a, int b) {
        return a*b;
    }
    public static int div(int a, int b) {
        return a/b;
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println(App.add(3, 3));
        System.out.println(App.sub(3, 3));
        Test.testAdd();
        Test.testmul();
        
        // for(int i=0;i<10;i++){
        //     if(add(i, i-1) == 6){
        //         System.out.println("Equal");
        //     }else{
        //         System.err.println("Not Equal");
        //     }
        // }
    }   
}
class Test{
    public static void testAdd(){
        if (App.add(3, 3) == (6)){
            System.out.println("test case pass");
        }
        else {
            System.out.println("test case fail");
        }
    }
    public static void testmul(){
        if (App.mul(3, 3) == (9)){
            System.out.println("test case pass");
        }
        else {
            System.out.println("test case fail");
        }
    }
    public static void testsub(){
        if (App.sub(3, 3) == (0)){
            System.out.println("test case pass");
        }
        else {
            System.out.println("test case fail");
        }
    }
    public static void testdiv(){
        if (App.div(3, 3) == (1)){
            System.out.println("test case pass");
        }
        else {
            System.out.println("test case f* ail");
        }
    }
}