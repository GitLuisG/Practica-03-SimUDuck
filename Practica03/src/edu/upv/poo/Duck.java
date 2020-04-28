package edu.upv.poo;


public abstract class Duck {
    
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;
    
    public void fly() {
        if (flyBehavior != null)
            flyBehavior.fly();
    }
    
    public void quack() {
        if (quackBehavior != null)
            quackBehavior.quack();
    }
    
    public abstract void display();

    /**
     * @param flyBehavior the flyBehavior to set
     */
    public final void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    /**
     * @param quackBehavior the quackBehavior to set
     */
    public final void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
    
    
    
}
