package com.travel.backend.model;


import lombok.*;


import java.util.List;

/**
 * @author Simin
 * @created 03/06/2022 - 6:27 PM
 */
//@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PropertyInfoTypeWithInclude {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String PropertyInfoTypeWithIncludeId;
    private String name;
    private String description;
    //@OneToMany
    private List<Resource> images;
    private Long stars;
//    @OneToOne
//    private ContactInfo contactInfo;
    //@OneToOne
    private PolicyInfo policy;
   // @OneToOne
    private TimeZoneInfo timeZone;
  //  @OneToMany
    private List<RatePlanInfo> ratePlans;
  //  @OneToMany
    private List<RoomTypeInfo> roomTypes;
   // @OneToMany
    private List<ServiceInfo> services;
   // @OneToMany
    private List<AmenityCategory> amenityCategories;

}
