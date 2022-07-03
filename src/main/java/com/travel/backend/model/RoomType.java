package com.travel.backend.model;

import lombok.*;


import java.util.List;

/**
 * @author Simin
 * @created 19/06/2022 - 1:58 PM
 */
//@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomType {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
   // @OneToMany
    public List<Placement> placements;
}
