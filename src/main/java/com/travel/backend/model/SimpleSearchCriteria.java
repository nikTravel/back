package com.travel.backend.model;
import lombok.*;

import java.util.List;

/**
 * @author Simin
 * @created 19/06/2022 - 7:46 PM
 */

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SimpleSearchCriteria {

    private List<String> propertyIds;
    private String adults;
    private String childAges;
    private List<String> include;
    private String arrivalDate;
    private String departureDate;
}
