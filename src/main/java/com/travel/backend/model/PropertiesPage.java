package com.travel.backend.model;


import lombok.*;

import java.util.List;

/**
 * @author Simin
 * @created 26/06/2022 - 10:53 PM
 */

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PropertiesPage {

    private String next;
    private List<Property> properties;
}
