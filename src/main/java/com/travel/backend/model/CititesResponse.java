package com.travel.backend.model;


import lombok.*;

import java.util.List;

/**
 * @author Simin
 * @created 28/06/2022 - 1:52 PM
 */
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CititesResponse {
    private List<City> cities;
}
