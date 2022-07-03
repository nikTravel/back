package com.travel.backend.model;

import lombok.*;


import java.util.List;

/**
 * @author Simin
 * @created 03/06/2022 - 6:47 PM
 */
//@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RatePlanInfo {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String idRate;
    private String name;
    private String description;
    private String currency;
   // @ElementCollection
    private List<String> includedServicesIds;
   // @OneToOne
    private Vat vat;

}
