package com.travel.backend.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AggregationSearchByPropertiesResponse {
    private List<RoomStay> roomStays;
    private  ShortContent content;
    private  List<Warning> warnings;
}
