package ru.netology.services;
public class FreelancerVacationService {

    public int calcVacationMonths(int income, int expenses, int threshold){
        int savings = 0;
        int vacationMonths = 0;
        for (int month = 1; month <= 12; month++) {
            savings += income - expenses;
            if (savings >= threshold) {
                vacationMonths++;
                savings = 0;
            }
        }
        return vacationMonths;
    }
}
