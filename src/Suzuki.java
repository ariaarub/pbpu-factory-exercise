public class Suzuki implements Autofactory {

    @Override
    public void createCar() {
        Car suzukiCar = new SuzukiCar();
        System.out.println(
            suzukiCar.createCar()
        );
        
    }

    @Override
    public void createBike() {
        Bike suzukiBike = new SuzukiBike();
        System.out.println(
            suzukiBike.createBike()
        );
    }
    
}
