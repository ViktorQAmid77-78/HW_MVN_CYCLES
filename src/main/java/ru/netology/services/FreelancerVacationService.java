package ru.netology.services;
public class FreelancerVacationService {

    public int calcVacationMonths(int income, int expenses, int threshold){
        int savings = 0;
        int vacationMonths = 0;
        for (int month = 0; month < 12; month++) {
            if (savings >= threshold) {
                vacationMonths++;
                savings -= expenses;
                savings = savings / 3;
            } else {
                savings += income;
                savings -= expenses;
            }
        }
        return vacationMonths;
    }
}
