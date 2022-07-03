package com.travel.backend.model;

import lombok.*;

/**
 * @author Simin
 * @created 19/06/2022 - 8:06 PM
 */

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GuestCount {
    private Long id;
    private Long adultCount;
    private Long childAges;
}
