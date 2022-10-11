public class App {
    public static void main(String[] args) throws Exception {
        Autofactory fac = new Suzuki();
        Autofactory fac2 = new Honda();

        fac.createBike();
        fac.createCar();
        fac2.createCar();
        fac2.createBike();
    }
}
