package com.travel.backend.model;


import lombok.*;


/**
 * @author Simin
 * @created 03/06/2022 - 7:00 PM
 */

//@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomTypeSquare {
   // @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long value;
}
