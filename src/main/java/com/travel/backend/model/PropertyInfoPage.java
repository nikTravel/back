package com.travel.backend.model;


import lombok.*;


import java.util.List;

/**
 * @author Simin
 * @created 03/06/2022 - 5:51 PM
 */
//@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PropertyInfoPage {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String next;
   // @OneToMany
    private List<PropertyInfoTypeWithInclude> properties;


}
