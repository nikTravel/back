package com.travel.backend.model;


import lombok.*;



/**
 * @author Simin
 * @created 03/06/2022 - 5:14 PM
 */

//@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AmenityCategory {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private Long index;
    private String name;
}
