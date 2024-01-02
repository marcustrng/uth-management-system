package com.uth.ums.ums.keycloak.service.impl;

import com.uth.ums.ums.keycloak.exception.UserExtraNotFoundException;
import com.uth.ums.ums.keycloak.model.UserExtra;
import com.uth.ums.ums.keycloak.repository.UserExtraRepository;
import com.uth.ums.ums.keycloak.service.UserExtraService;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserExtraServiceImpl implements UserExtraService {

    private final UserExtraRepository userExtraRepository;

    @Override
    public UserExtra validateAndGetUserExtra(String username) {
        return getUserExtra(username).orElseThrow(() -> new UserExtraNotFoundException(username));
    }

    @Override
    public Optional<UserExtra> getUserExtra(String username) {
        return userExtraRepository.findById(username);
    }

    @Override
    public UserExtra saveUserExtra(UserExtra userExtra) {
        return userExtraRepository.save(userExtra);
    }
}
