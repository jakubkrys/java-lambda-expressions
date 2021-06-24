package pl.jakubkrys.lambda_expressions.otodom;

public class Flat {

    private int floor;
    private int surfaceArea;
    private int numberOfRooms;
    private int price;

    public Flat(int floor, int surfaceArea, int numberOfRooms, int price) {
        this.floor = floor;
        this.surfaceArea = surfaceArea;
        this.numberOfRooms = numberOfRooms;
        this.price = price;
    }

    public int getFloor() {
        return floor;
    }

    public int getSurfaceArea() {
        return surfaceArea;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "floor=" + floor +
                ", surfaceArea=" + surfaceArea +
                ", numberOfRooms=" + numberOfRooms +
                ", price=" + price +
                '}';
    }
}