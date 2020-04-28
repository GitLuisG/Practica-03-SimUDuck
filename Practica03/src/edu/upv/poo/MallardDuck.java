package edu.upv.poo;

public class MallardDuck 
        extends Duck {
    
    public MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }
    
    @Override
    public void display() {
        System.out.println("Displaying a Mallard Duck");
    }
    
}
