package com.travel.backend.model;


import lombok.*;

import java.util.List;

/**
 * @author Simin
 * @created 19/06/2022 - 11:13 PM
 */

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookingPersonContacts {
    private Long id;
    private List<String> phones;
    private List<String> email;
}
