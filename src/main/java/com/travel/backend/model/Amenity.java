package com.travel.backend.model;


import lombok.*;


/**
 * @author Simin
 * @created 03/06/2022 - 5:12 PM
 */
//@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Amenity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long amenityCategoryIndex;
    private String code;
    private Long name;
}
