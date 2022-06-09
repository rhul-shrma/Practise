package com.custClass;

class Mobile{
    public void ringing(){
        System.out.println("Ringing .....");
    }
    public void vibrating(){
        System.out.println("vibrating .....");
    }
}

public class Method {
    public static void main(String[] args) {
        Mobile oneplus = new Mobile();
        Mobile samsung = new Mobile();

        System.out.println("The One Plus mobile is: ");
        samsung.vibrating();

    }
}
