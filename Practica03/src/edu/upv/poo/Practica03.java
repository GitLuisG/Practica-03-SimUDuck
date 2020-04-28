package edu.upv.poo;


public class Practica03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Practica03().run();
    }
    
       
    public void run() {
        System.out.println("= Práctica 03: SimUDuck =");
        initDucks();
        runSimulation();
    }
    
    public void runSimulation() {
        for (Duck duck : ducks) {
            duck.display();
            duck.quack();
            duck.fly();
        }
    }
    
    private Duck[] ducks;
 
    private void initDucks() {
        ducks = new Duck[] {
            new MallardDuck(), new RedheadDuck()
        };
    }
           
}
