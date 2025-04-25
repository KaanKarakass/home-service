package org.kaankarakas.service.impl;

import org.kaankarakas.model.House;
import org.kaankarakas.repository.HouseRepository;
import org.kaankarakas.service.HouseService;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HouseServiceImpl implements HouseService {
    private final HouseRepository houseRepository;

    public HouseServiceImpl(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    @Override
    public int getTotalPriceOfStandardHouses() {
        return houseRepository.getStandardHouseList()
                .stream().mapToInt(House::getPrice).sum();
    }

    @Override
    public int getTotalPriceOfVillas() {
        return houseRepository.getVillaList()
                .stream().mapToInt(House::getPrice).sum();
    }

    @Override
    public int getTotalPriceOfSummerHouses() {
        return houseRepository.getSummerHouseList()
                .stream().mapToInt(House::getPrice).sum();
    }

    @Override
    public int getTotalPriceOfAllHouses() {
        return getAllHouses().stream().mapToInt(House::getPrice).sum();
    }

    @Override
    public double getAverageSquareMetersOfStandardHouses() {
        return houseRepository.getStandardHouseList()
                .stream().mapToInt(House::getSquareMeters).average().orElse(0);
    }

    @Override
    public double getAverageSquareMetersOfVillas() {
        return houseRepository.getVillaList()
                .stream().mapToInt(House::getSquareMeters).average().orElse(0);
    }

    @Override
    public double getAverageSquareMetersOfSummerHouses() {
        return houseRepository.getSummerHouseList()
                .stream().mapToInt(House::getSquareMeters).average().orElse(0);
    }

    @Override
    public double getAverageSquareMetersOfAllHouses() {
        return getAllHouses().stream()
                .mapToInt(House::getSquareMeters).average().orElse(0);
    }

    @Override
    public List<House> filterHousesByRoomAndLivingRoom(int numberOfRooms, int numberOfLivingRooms) {
        return getAllHouses().stream()
                .filter(h -> h.getNumberOfRooms() == numberOfRooms
                        && h.getNumberOfLivingRooms() == numberOfLivingRooms)
                .collect(Collectors.toList());
    }

    private List<House> getAllHouses() {
        return Stream.of(
                houseRepository.getStandardHouseList(),
                houseRepository.getVillaList(),
                houseRepository.getSummerHouseList()
        ).flatMap(List::stream).collect(Collectors.toList());
    }
}
