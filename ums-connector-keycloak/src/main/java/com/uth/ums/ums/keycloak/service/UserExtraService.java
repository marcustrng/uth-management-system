package com.uth.ums.ums.keycloak.service;


import com.uth.ums.ums.keycloak.model.UserExtra;
import java.util.Optional;

public interface UserExtraService {

    UserExtra validateAndGetUserExtra(String username);

    Optional<UserExtra> getUserExtra(String username);

    UserExtra saveUserExtra(UserExtra userExtra);
}
