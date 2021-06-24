package pl.jakubkrys.lambda_expressions.otodom;

import java.util.*;

public class OtodomApp {
    public static void main(String[] args) {

        FlatRepo flatRepo = new FlatRepo();
        flatRepo.add(new Flat(1,45,2,450));
        flatRepo.add(new Flat(5,72,3,240));
        flatRepo.add(new Flat(17,66,4,4000));
        flatRepo.add(new Flat(3,130,4,960));
        flatRepo.add(new Flat(2,22,1,730));
        flatRepo.add(new Flat(14,9,1,390));
        flatRepo.add(new Flat(5,32,2,1200));
        flatRepo.add(new Flat(2,88,3,600));
        flatRepo.add(new Flat(1,73,2,809));
        flatRepo.add(new Flat(3,80,3,347));
        flatRepo.add(new Flat(17,112,5,549));
        flatRepo.add(new Flat(9,95,4,940));
        flatRepo.add(new Flat(3,18,3,870));

        System.out.println("----- Price between 500K and 1M ------");
        Parameters priceBetween500And1000K = flat -> flat.getPrice() < 1000 && flat.getPrice() > 500;
        Set<Flat> results1 = flatRepo.findFlats(priceBetween500And1000K);
        System.out.println(results1);

        System.out.println();
        System.out.println("----- Surface area between 18 and 100 meters ------");
        Parameters surfaceBetween18And100M = flat -> flat.getSurfaceArea() < 100 && flat.getSurfaceArea() > 18;
        Set<Flat> results2 = flatRepo.findFlats(surfaceBetween18And100M);
        System.out.println(results2);

        System.out.println();
        System.out.println("----- Surface above 80 meters and no. of rooms more than 2 -----");
        Parameters moreThan2RoomsAnd80M = flat -> flat.getNumberOfRooms() > 2 && flat.getSurfaceArea() > 80;
        Set<Flat> results3 = flatRepo.findFlats(moreThan2RoomsAnd80M);
        System.out.println(results3);

        System.out.println();
        System.out.println("----- Floor higher than 10th and price under 1M -----");
        Parameters higherFloorThan10AndPriceUnder1000K = flat -> flat.getPrice() < 1000 && flat.getFloor() > 10;
        Set<Flat> results4 = flatRepo.findFlats(higherFloorThan10AndPriceUnder1000K);
        System.out.println(results4);

        System.out.println();
        System.out.println("----- Less then 3 rooms and price under 300K -----");
        Parameters lessThan3RoomsAndUnder300K = flat -> flat.getNumberOfRooms() < 3 && flat.getPrice() < 300;
        Set<Flat> results5 = flatRepo.findFlats(lessThan3RoomsAndUnder300K);
        System.out.println(results5);

        System.out.println();
        System.out.println("----- Floor higher than 2nd and surface area below 100 meters ------");
        Parameters higherFloorThan2And100M = flat -> flat.getFloor() > 2 && flat.getSurfaceArea() < 100;
        Set<Flat> results6 = flatRepo.findFlats(higherFloorThan2And100M);
        System.out.println(results6);

        System.out.println();
        System.out.println("----- Floor higher than 15th and no. of rooms above 4 -----");
        Parameters hihgerFloorThan15AndMoreThan4Rooms = flat -> flat.getFloor() > 15 && flat.getNumberOfRooms() > 4;
        Set<Flat> results7 = flatRepo.findFlats(hihgerFloorThan15AndMoreThan4Rooms);
        System.out.println(results7);

    }
}