package com.travel.backend.model;


import lombok.*;

/**
 * @author Simin
 * @created 03/06/2022 - 6:37 PM
 */
//@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TimeZoneInfo {
   // @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
