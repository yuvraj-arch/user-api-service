package com.api.user_api_service.repository;

import com.api.user_api_service.model.UserRequest;
import com.api.user_api_service.model.UserResponse;

public interface UserService {
    UserResponse createUser(UserRequest request);
    UserResponse getUserById(Long id);
}
