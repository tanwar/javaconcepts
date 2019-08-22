package com.emirates.acp.service.automation.impl;

public class Test {

    public static void main(String[] args) {

        Balloon red = new Balloon("Red"); 
        Balloon blue = new Balloon("Blue");
        
        //swap(red, blue);
        System.out.println("red color="+red.getColor());
        System.out.println("blue color="+blue.getColor());
        
        foo(blue);
        System.out.println("blue color="+blue.getColor());
        
    }

    private static void foo(Balloon balloon) { 
        balloon.setColor("Red"); 
       // balloon = new Balloon("Green"); //baloon=200
        balloon = foo1("Green"); 
        System.out.println("green color="+balloon.getColor());
        balloon.setColor("Blue1"); //baloon = 200
        System.out.println("blue1 color="+balloon.getColor());
    }
    
    private static Balloon foo1(String color) { //baloon=100
       return new Balloon(color); //baloon=200
    }

    //Generic swap method
    public static void swap(Object o1, Object o2){
        Object temp = o1;
        o1=o2;
        o2=temp;
    }
}

class Balloon {

    private String color;

    public Balloon(){}
    
    public Balloon(String c){
        this.color=c;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
