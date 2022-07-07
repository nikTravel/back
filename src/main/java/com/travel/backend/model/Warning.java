package com.travel.backend.model;


import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Warning {
    private String code;
    private String message;
}
