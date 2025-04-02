package chandrasekhar.springbootlearning;

public class Car {
    private Engine engine;
//    public Car(PetrolEngine engine){
//        this.engine = engine;
//    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public void run(){
        if(engine != null){
            engine.start();
            System.out.println("Car is running");
        }
        else{
            System.out.println("NO engine found");
        }
    }
}
