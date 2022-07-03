package com.travel.backend.model;

import lombok.*;

import java.util.List;

/**
 * @author Simin
 * @created 03/06/2022 - 5:44 PM
 */
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PropertyEvents {
    private List<String> events;
    private String continuousToken;
    private boolean hasMoreData;
}
