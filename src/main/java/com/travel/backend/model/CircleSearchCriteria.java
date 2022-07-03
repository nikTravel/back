package com.travel.backend.model;

import lombok.*;

/**
 * @author Simin
 * @created 28/06/2022 - 10:58 AM
 */

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CircleSearchCriteria {

    private Long latitude;
    private Long longitude;
    private Long radius;
}
