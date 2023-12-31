package com.uth.ums.career.model.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "career_levels")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class CareerLevel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "career_level_id")
	private Long careerLevelId;

	@Column(name = "career_level_name", nullable = false)
	private String careerLevelName;
}
