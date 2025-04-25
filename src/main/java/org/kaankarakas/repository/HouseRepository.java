package org.kaankarakas.repository;

import org.kaankarakas.model.StandardHouse;
import org.kaankarakas.model.SummerHouse;
import org.kaankarakas.model.Villa;

import java.util.Arrays;
import java.util.List;

public class HouseRepository {
    public List<StandardHouse> getStandardHouseList() {
        return Arrays.asList(
                new StandardHouse(950_000, 115, 3, 1),
                new StandardHouse(1_050_000, 125, 4, 1),
                new StandardHouse(1_200_000, 135, 4, 2)
        );
    }

    public List<Villa> getVillaList() {
        return Arrays.asList(
                new Villa(4_500_000, 300, 5, 2),
                new Villa(5_200_000, 350, 6, 2),
                new Villa(6_000_000, 400, 7, 3)
        );
    }

    public List<SummerHouse> getSummerHouseList() {
        return Arrays.asList(
                new SummerHouse(2_100_000, 180, 3, 1),
                new SummerHouse(2_300_000, 190, 4, 1),
                new SummerHouse(2_600_000, 200, 4, 2)
        );
    }
}
