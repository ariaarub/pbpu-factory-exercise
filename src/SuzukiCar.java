public class SuzukiCar implements Car {

    @Override
    public Car createCar() {
        return new SuzukiCar();        
    }
    
}
