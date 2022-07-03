package com.travel.backend.model;


import lombok.*;

import java.util.List;


/**
 * @author Simin
 * @created 03/06/2022 - 6:46 PM
 */
//@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomTypeInfo {
  //  @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String idRoom;
    private String name;
    private String description;
   // @OneToMany
    private List<Amenity> amenities;
   // @OneToMany
    private List<Resource> images;
  //  @OneToOne
    private RoomTypeSquare size;
    private String categoryCode;
    private String categoryName;
}
