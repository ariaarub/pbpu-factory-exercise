public class HondaCar implements Car {

    @Override
    public Car createCar() {
        return new HondaCar();        
        
    }
    
}
