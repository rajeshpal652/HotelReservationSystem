package com.bl.hotelreservationsystem;
/*
@Author : Rajesh Pal
Creating the main class to perform the operations.
 */
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class HotelReservation {
    Map<String, Hotel> hotelReservation = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to hotel Reservation System");
    }
    /*
    Adding hotel objects to Hashmap.
     */
    public void addHotels() {
        hotelReservation.put("Lakewood", new Hotel("Lakewood",110,90));
        hotelReservation.put("Bridgewood", new Hotel("Bridgewood",160,60));
        hotelReservation.put("Ridgewood", new Hotel("Ridgewood",220,150));
    }

    /*
    Taking 2 dates input from user in yyyy-mm-dd format.
     */
    public void userInput() {
        System.out.println("Enter 2 dates to find the cheapest hotel");
        String date1 = scanner.next();
        String date2 = scanner.next();
        findCheapestHotel(date1, date2);
    }

    /*
    Method to find the cheapest hotel in provided dates.
     */
    public int findCheapestHotel(String date1, String date2) {
        DayOfWeek day1 = LocalDate.parse(date1).getDayOfWeek();
        DayOfWeek day2 = LocalDate.parse(date2).getDayOfWeek();
        List<Hotel> hotelList = hotelReservation
                .values()
                .stream()
                .sorted(Comparator.comparing(Hotel -> Hotel.weekdays_regularRate))
                .collect(Collectors.toList());

        System.out.println("Cheapest hotel is " + hotelList.get(0).getHotelName() + "Total Rates " + hotelList.get(0).getWeekdays_regularRate() * 2);
        return (hotelList.get(0).getWeekdays_regularRate() * 2);

    }
}
