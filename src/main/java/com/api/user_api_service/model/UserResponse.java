package com.api.user_api_service.model;

import jakarta.validation.Valid;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Getter
@Builder
@Valid
public class UserResponse {
    @NonNull
    private Long id;
    private Long userId;
    private String name;
    private String email;
}