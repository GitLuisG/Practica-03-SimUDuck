package edu.upv.poo;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }
    
    @Override
    public void display() {
        System.out.println("Displaying a Redhead duck");
    }
        
}
