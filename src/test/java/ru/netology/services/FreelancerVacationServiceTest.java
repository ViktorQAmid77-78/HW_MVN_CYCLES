package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FreelancerVacationServiceTest {

    @Test
    public void testCalcVacationMonth() {
        FreelancerVacationService service = new FreelancerVacationService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expectedVacationMonths = 4;
        int actualVacationMonths = service.calcVacationMonths(income, expenses, threshold);
        Assertions.assertEquals(expectedVacationMonths, actualVacationMonths);
    }



}
