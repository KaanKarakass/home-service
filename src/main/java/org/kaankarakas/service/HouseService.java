package org.kaankarakas.service;

import org.kaankarakas.model.House;

import java.util.List;

public interface HouseService {
    int getTotalPriceOfStandardHouses();

    int getTotalPriceOfVillas();

    int getTotalPriceOfSummerHouses();

    int getTotalPriceOfAllHouses();

    double getAverageSquareMetersOfStandardHouses();

    double getAverageSquareMetersOfVillas();

    double getAverageSquareMetersOfSummerHouses();

    double getAverageSquareMetersOfAllHouses();

    List<House> filterHousesByRoomAndLivingRoom(int numberOfRooms, int numberOfLivingRooms);
}

