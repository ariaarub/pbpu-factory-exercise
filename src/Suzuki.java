public class Suzuki implements Autofactory {

    @Override
    public Car createCar() {
        System.out.println("Suzuki Car created!");
        return new SuzukiCar();
    }

    @Override
    public Bike createBike() {
        System.out.println("Suzuki Bike created!");
        return new SuzukiBike();
    }
    
}
