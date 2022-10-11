public class Honda implements Autofactory {

    @Override
    public void createCar() {
        Car hondaCar = new HondaCar();
        System.out.println(
            hondaCar.createCar()
        );
        
    }

    @Override
    public void createBike() {
        Bike hondaBike = new HondaBike();
        System.out.println(
            hondaBike.createBike()
        );
    }
    
}
