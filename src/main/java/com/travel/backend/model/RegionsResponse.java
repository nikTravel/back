package com.travel.backend.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegionsResponse {
    private List<Region> regions;
}
