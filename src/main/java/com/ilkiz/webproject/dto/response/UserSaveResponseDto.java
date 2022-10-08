package com.ilkiz.webproject.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserSaveResponseDto {

    private String name;
    private String surname;
    private String email;
    private String gender;
}
