package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestServiceTest {

    @Test
    void shouldCalculateTheNumberOfMonthsOfRest() {
        RestService service = new RestService();

        int income = 10_000;
        int expense = 3_000;
        int threshold = 20_000;
        int expected = 3;

        int actual = service.calculate(income, expense, threshold);

        Assertions.assertEquals(expected, actual);
    }

}
