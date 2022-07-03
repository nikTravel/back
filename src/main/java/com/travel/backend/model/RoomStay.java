package com.travel.backend.model;


import lombok.*;



/**
 * @author Simin
 * @created 19/06/2022 - 11:00 AM
 */
//@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomStay {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String key;
    public String propertyId;
  //  @OneToOne
    public RoomType roomType;

}
