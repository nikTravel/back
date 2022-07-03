package com.travel.backend.model;

import lombok.*;

/**
 * @author Simin
 * @created 26/06/2022 - 11:00 PM
 */

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Property {

    private String id;
    private String name;
    private String cityId;
    private String regionId;
    private String countryCode;
    private Long longitude;
    private Long latitude;


}
