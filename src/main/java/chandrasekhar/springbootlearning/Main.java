package chandrasekhar.springbootlearning;

public class Main {
    public static void main(String[] args) {
        PetrolEngine engine = new PetrolEngine();
        Car car = new Car();
        car.setEngine(engine);
        car.run();
    }
}
