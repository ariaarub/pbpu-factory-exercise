public class HondaBike implements Bike {

    @Override
    public Bike createBike() {
        return new HondaBike();        
    }
    
}
