package com.travel.backend.model;


import lombok.*;

import java.util.List;

/**
 * @author Simin
 * @created 20/06/2022 - 1:43 PM
 */
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Booking {

      private String  propertyId;
      private List<RoomStay> roomStays;
      private List<StayDate> stayDates;
      private RoomType roomType;
      private List<Placement> placements;
      private List<Guest> guests;
      private GuestCount guestCount;
      private int services1;
      private int services2;
      private String checksum;
      private BookingCustomer bookingCustomer;
      private String createBookingToken;
}


