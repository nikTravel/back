package com.travel.backend.model;

import lombok.*;

/**
 * @author Simin
 * @created 28/06/2022 - 12:37 PM
 */

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class City {

    private String id;
    private String name;
    private String regionId;
    private String countryCode;
}
