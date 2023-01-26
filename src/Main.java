import Drivers.*;
import Transport.*;
import com.sun.source.tree.NewArrayTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        DriverC petrovPetr = new DriverC("Петров Петр", true, 10);
        petrovPetr.setLicensType(LicensType.LICENS_TYPE_C);
        DriverB ivanovIvan = new DriverB("Иванов Иван", true, 5);
        ivanovIvan.setLicensType(LicensType.LICENS_TYPE_B);
        DriverD sidorovSidr = new DriverD("Сидоров Сидр", true, 25);
        sidorovSidr.setLicensType(LicensType.LICENS_TYPE_D);
        DriverC pupkinIvan = new DriverC("Пупкин Иван", true, 25);


        Truck truckManM1 = new Truck("Man", "M1", 500);
        truckManM1.setType(Tonnage.N1);
        truckManM1.printType();
        System.out.println(truckManM1);
        Truck truckKamaz50 = new Truck("KAMAZ", "50", 700);
        System.out.println(truckManM1);
        Truck truckMaz = new Truck("Maz", "100", 1000);
        System.out.println(truckManM1);
        Truck truckBelaz = new Truck("Belaz", "5", 1200);
        System.out.println(truckManM1);


        Bus busEkarus = new Bus("Ekarus", "Ekarus", 700);
        System.out.println(busEkarus);
        busEkarus.printType();
        Bus busLuaz = new Bus("Luaz", "Luaz", 1000);
        System.out.println(busLuaz);
        busLuaz.setType(BusСapacity.S);
        busLuaz.printType();
        Bus busMagic = new Bus("Magic", "Magic", 10000000);
        System.out.println(busMagic);

        Car carLadaGranta = new Car("Lada", "Granta", 150);
        System.out.println(carLadaGranta);
        carLadaGranta.setType(BodyType.SEDAN);
        carLadaGranta.printType();
        Car carLadaPriora = new Car("Lada", "Priora", 150);
        System.out.println(carLadaPriora);
        Car carLadaKalina = new Car("Lada", "Kalina", 150);
        System.out.println(carLadaKalina);
        Car carLadaVesta = new Car("Lada", "Vesta", 150);
        System.out.println(carLadaVesta);

        try {
            busMagic.getDiagnostics(sidorovSidr);
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        } catch (CantGetDiagnostic e) {
            System.out.println(e.getMessage());
        }

        try {
            carLadaGranta.getDiagnostics(ivanovIvan);
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        } catch (CantGetDiagnostic e) {
            System.out.println(e.getMessage());
        }

        try {
            truckBelaz.getDiagnostics(pupkinIvan);
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        } catch (CantGetDiagnostic e) {
            System.out.println(e.getMessage());
        }

        truckManM1.start(petrovPetr);
        carLadaVesta.start(ivanovIvan);
        busMagic.start(sidorovSidr);

        Mechanics mechMech = new Mechanics("Механикус Механ");
        mechMech.setCompany("Первая мехническая");

        Mechanics superMech = new Mechanics("Супер Механ");
        superMech.setCompany("Вторая мехническая");

        HashMap<Transport, Mechanics> mechanics = new HashMap<Transport, Mechanics>();
        mechanics.put(carLadaGranta, mechMech);
        mechanics.put(carLadaGranta, superMech);

        //carLadaGranta.getMechanics();

        carLadaGranta.setMechanics(mechanics);

       // carLadaGranta.getMechanics();
        carLadaVesta.setMechanics(mechanics);
        carLadaVesta.getMechanics();

        carLadaVesta.getDriver();
        carLadaVesta.stop();
        carLadaVesta.getDriver();

        ServiceStation firstST = new ServiceStation();
        firstST.addQueue(truckManM1);
        firstST.addQueue(carLadaVesta);
        firstST.addQueue(busMagic);

        firstST.makeMantance();
        firstST.makeMantance();
        firstST.makeMantance();

    }

}