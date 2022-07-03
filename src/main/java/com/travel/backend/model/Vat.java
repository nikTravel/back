package com.travel.backend.model;

import lombok.*;


/**
 * @author Simin
 * @created 03/06/2022 - 6:52 PM
 */

//@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Vat {
   // @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean applicable;
    private boolean included;
    private Long percent;
}
