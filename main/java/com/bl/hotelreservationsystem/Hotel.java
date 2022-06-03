package com.bl.hotelreservationsystem;
/*
@Author : Rajesh Pal
Creating a pojo class.
 */
public class Hotel {
    String hotelName;
    int weekdays_regularRate;
    int weekend_regularRate;

    public Hotel(String hotelName, int weekdays_regularRate, int weekend_regularRate) {
        this.hotelName = hotelName;
        this.weekdays_regularRate = weekdays_regularRate;
        this.weekend_regularRate = weekend_regularRate;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getWeekdays_regularRate() {
        return weekdays_regularRate;
    }

    public void setWeekdays_regularRate(int weekdays_regularRate) {
        this.weekdays_regularRate = weekdays_regularRate;
    }

    public int getWeekend_regularRate() {
        return weekend_regularRate;
    }

    public void setWeekend_regularRate(int weekend_regularRate) {
        this.weekend_regularRate = weekend_regularRate;
    }
}
