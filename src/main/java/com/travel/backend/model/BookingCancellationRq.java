package com.travel.backend.model;

import lombok.*;

/**
 * @author Simin
 * @created 19/06/2022 - 11:09 PM
 */
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookingCancellationRq {

    public Long id;
    public String reason;
    public Long expectedPenaltyAmount;
}
