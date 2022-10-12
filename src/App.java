public class App {

    public static void main(String[] args) throws Exception {
        Autofactory fac = new Suzuki();
        Autofactory fac2 = new Honda();

        Bike bike = fac.createBike();
        Car car = fac.createCar();
        Car car2 = fac2.createCar();
        Bike bike2 = fac2.createBike();

        System.out.println(bike.getClass().getName());
        System.out.println(car.getClass().getName());
        System.out.println(car2.getClass().getName());
        System.out.println(bike2.getClass().getName());



    }
}
