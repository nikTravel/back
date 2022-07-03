package com.travel.backend.model;


import lombok.*;

import java.util.List;

/**
 * @author Simin
 * @created 19/06/2022 - 11:10 PM
 */

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookingCustomer {
    private Long id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String citizenship;
    private List<BookingPersonContacts> contacts;
}
