package com.uth.ums.keycloak.repository;


import com.uth.ums.keycloak.model.UserExtra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserExtraRepository extends JpaRepository<UserExtra, String> {
}
