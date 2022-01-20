package com.example.springdemo;

public class Java extends Sec {
    private String worek;
    
    public void speak(){
        System.out.println("worek : "+ worek);
    }

    public String getWorek() {
        return worek;
    }

    public void setWorek(String worek) {
        this.worek = worek;
    }
}
