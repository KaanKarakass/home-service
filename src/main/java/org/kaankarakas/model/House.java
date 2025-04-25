package org.kaankarakas.model;

public abstract class House {
    private final int price;
    private final int squareMeters;
    private final int numberOfRooms;
    private final int numberOfLivingRooms;
    public House(int price, int squareMeters, int numberOfRooms, int numberOfLivingRooms) {
        this.price = price;
        this.squareMeters = squareMeters;
        this.numberOfRooms = numberOfRooms;
        this.numberOfLivingRooms = numberOfLivingRooms;
    }
    public int getPrice() {
        return price;
    }

    public int getSquareMeters() {
        return squareMeters;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfLivingRooms() {
        return numberOfLivingRooms;
    }
    @Override
    public String toString() {
        return String.format(
                "%s - Price: %d, Size: %d m², Rooms: %d, Living Rooms: %d",
                this.getClass().getSimpleName(), price, squareMeters, numberOfRooms, numberOfLivingRooms
        );
    }
}
