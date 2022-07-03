package com.travel.backend.model;

import lombok.*;

/**
 * @author Simin
 * @created 19/06/2022 - 7:52 PM
 */
//@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Placement {
   // @Id
    private Long id;
    private String code;
    private Long count;
    private AccommodationTypes kind;
    private Long maxAge;
    private Long minAge;
}
