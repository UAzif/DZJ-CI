package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsSrviceTest {
    @Test
    void findMax() {
        StatisticsSrvice service = new StatisticsSrvice();

        long[] incomesInBillions = {22, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

}