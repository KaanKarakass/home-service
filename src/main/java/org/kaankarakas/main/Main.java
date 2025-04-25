package org.kaankarakas.main;

import org.kaankarakas.model.House;
import org.kaankarakas.repository.HouseRepository;
import org.kaankarakas.service.HouseService;
import org.kaankarakas.service.impl.HouseServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        HouseRepository repository = new HouseRepository();
        HouseService houseService = new HouseServiceImpl(repository);

        System.out.println("=== House Price Summary ===");
        System.out.println("Total price of standard houses: ₺" + houseService.getTotalPriceOfStandardHouses());
        System.out.println("Total price of villas: ₺" + houseService.getTotalPriceOfVillas());
        System.out.println("Total price of summer houses: ₺" + houseService.getTotalPriceOfSummerHouses());
        System.out.println("Total price of all houses: ₺" + houseService.getTotalPriceOfAllHouses());

        System.out.println("\n=== House Size Averages ===");
        System.out.printf("Average size of standard houses: %.2f m²%n", houseService.getAverageSquareMetersOfStandardHouses());
        System.out.printf("Average size of villas: %.2f m²%n", houseService.getAverageSquareMetersOfVillas());
        System.out.printf("Average size of summer houses: %.2f m²%n", houseService.getAverageSquareMetersOfSummerHouses());
        System.out.printf("Average size of all houses: %.2f m²%n", houseService.getAverageSquareMetersOfAllHouses());

        System.out.println("\n=== Filtered Houses (4 Rooms, 1 Living Room) ===");
        List<House> filtered = houseService.filterHousesByRoomAndLivingRoom(4, 1);
        if (filtered.isEmpty()) {
            System.out.println("No houses match the filter.");
        } else {
            filtered.forEach(System.out::println);
        }
    }

}