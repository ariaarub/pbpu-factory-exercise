public class Honda implements Autofactory {

    @Override
    public Car createCar() {
        System.out.println("Honda Car created!");
        return new HondaCar();
    }

    @Override
    public Bike createBike() {
        System.out.println("Honda Bike created!");
        return new HondaBike();
    }
    
}
