public class SuzukiBike implements Bike {

    @Override
    public Bike createBike() {
        return new SuzukiBike();
        
        
    }
    
}
