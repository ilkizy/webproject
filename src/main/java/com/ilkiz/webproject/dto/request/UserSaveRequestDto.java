package com.ilkiz.webproject.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserSaveRequestDto {

    private String name;
    private String surname;
    private String email;
    private String username;
    private String password;
    private String phone;
    private String gender;

}
