package com.travel.backend.model;


import lombok.*;


/**
 * @author Simin
 * @created 19/06/2022 - 6:47 PM
 */


@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StayDate {
   // @Id
    private Long id;
    private String arrivalDateTime;
    private String departureDateTime;
}
