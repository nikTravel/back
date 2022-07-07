package com.travel.backend.model;


import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShortContent {

    private List<RatePlanInfo> ratePlans;
    private List<RoomType> roomTypes;

}
