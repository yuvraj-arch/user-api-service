package com.api.user_api_service.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {

    @NonNull
    private Long userId;

    @NotBlank
    private String name;

    @Email
    @NotBlank
    private String email;
}
