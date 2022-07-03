package com.travel.backend.model;

import lombok.*;

/**
 * @author Simin
 * @created 20/06/2022 - 2:48 PM
 */

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Guest {

    private Long id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String citizenship;
    private GuestSexKind sex;

}
