package com.travel.backend.model;


import lombok.*;


import java.util.List;

/**
 * @author Simin
 * @created 03/06/2022 - 6:45 PM
 */
//@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ServiceInfo {
  //  @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String idService;
    private String name;
    private String description;
    private ServiceKind kind;
    private String mealPlanCode;
    private String mealPlanName;
   // @OneToMany
    private List<Resource> images;
   // @OneToOne
    private Vat vat;
}
