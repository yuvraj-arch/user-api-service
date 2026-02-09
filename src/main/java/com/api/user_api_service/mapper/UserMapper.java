// File: temp/user-api-service/src/main/java/com/api/user_api_service/mapper/UserMapper.java
package com.api.user_api_service.mapper;

import com.api.user_api_service.model.User;
import com.api.user_api_service.model.UserRequest;
import com.api.user_api_service.model.UserResponse;

public class UserMapper {

    public static User toEntity(UserRequest request) {
        return User.builder()
                .id(request.getUserId())
                .name(request.getName())
                .email(request.getEmail())
                .build();

    }

    public static UserResponse toResponse(User user) {
        return UserResponse.builder()
                .id(user.getId())
                .userId(user.getUserId())
                .name(user.getName())
                .email(user.getEmail())
                .build();
    }
}