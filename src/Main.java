import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;
import Transport.Bus;
import Transport.Car;
import Transport.Truck;

public class Main {
    public static void main(String[] args) {

        DriverC petrovPetr = new DriverC("Петров Петр", true, 10);
        DriverB ivanovIvan = new DriverB("Иванов Иван", true, 5);
        DriverD sidorovSidr = new DriverD("Сидоров Сидр", true, 25);

        Truck truckManM1 = new Truck("Man", "M1", 500);
        System.out.println(truckManM1);
        Truck truckKamaz50 = new Truck("KAMAZ", "50", 700);
        System.out.println(truckManM1);
        Truck truckMaz = new Truck("Maz", "100", 1000);
        System.out.println(truckManM1);
        Truck truckBelaz = new Truck("Belaz", "5", 1200);
        System.out.println(truckManM1);



        Bus busEkarus = new Bus("Ekarus", "Ekarus", 700);
        System.out.println(busEkarus);
        Bus busLuaz = new Bus("Luaz", "Luaz", 1000);
        System.out.println(busLuaz);
        Bus busMagic = new Bus("Magic", "Magic", 10000000);
        System.out.println(busMagic);


        Car carLadaGranta = new Car("Lada", "Granta", 150);
        System.out.println(carLadaGranta);
        Car carLadaPriora = new Car("Lada", "Priora", 150);
        System.out.println(carLadaPriora);
        Car carLadaKalina = new Car("Lada", "Kalina", 150);
        System.out.println(carLadaKalina);
        Car carLadaVesta = new Car("Lada", "Vesta", 150);
        System.out.println(carLadaVesta);

        truckManM1.start(petrovPetr);
        carLadaVesta.start(ivanovIvan);
        busMagic.start(sidorovSidr);
    }
}