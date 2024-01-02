package com.uth.ums.ums.keycloak.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "userextras")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class UserExtra {

	@Id
	@Column(name = "username")
    private String username;
    private String avatar;

	public UserExtra(String username) {
		this.username = username;
	}
}
