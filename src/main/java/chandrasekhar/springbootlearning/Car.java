package chandrasekhar.springbootlearning;

public class Car {
    private Engine engine;
    public Car(){
        engine  = new Engine();
    }
    public void run(){
        engine.start();
        System.out.println("Car is running");
    }
}
