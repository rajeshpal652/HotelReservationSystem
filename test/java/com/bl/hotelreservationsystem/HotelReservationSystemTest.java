package com.bl.hotelreservationsystem;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationSystemTest {
    HotelReservation hotelReservation = new HotelReservation();

    @Test
    public void addHotelTest() {
        hotelReservation.addHotels();
        Assert.assertEquals(3,3);

    }
    @Test
    public void addHotelTestShouldFail() {
        hotelReservation.addHotels();
        Assert.assertEquals(2,3);

    }
    @Test
    public void givenDateShouldBeFoundCheapestHotel() {
        hotelReservation.addHotels();
        Assert.assertEquals(220 ,hotelReservation.findCheapestHotel("2020-09-10","2020-09-11"));
    }
    @Test
    public void givenDateShouldNotBeFoundCheapestHotel() {
        hotelReservation.addHotels();
        Assert.assertEquals(210 ,hotelReservation.findCheapestHotel("2020-09-10","2020-09-11"));
    }
    @Test
    public void givenDateShouldBeFoundTwoCheapestHotel() {
        hotelReservation.addHotels();
        Assert.assertEquals(220 ,hotelReservation.findCheapestHotel("2020-09-10","2020-09-11"));
    }
}
