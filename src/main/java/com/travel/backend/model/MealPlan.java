package com.travel.backend.model;


import lombok.*;

/**
 * @author Simin
 * @created 03/06/2022 - 5:39 PM
 */

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MealPlan {

    private String code;
    private String name;
}
