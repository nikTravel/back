package com.travel.backend.model;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Region {

    private String id;
    private String name;
    private String countryCode;
}
