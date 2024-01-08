package com.uth.ums.schedule.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "room")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "room_id")
	private Long roomId;

	@Column(name = "room_code", length = 255)
	private String roomCode;

	@Column(name = "room_name", length = 255)
	private String roomName;

	@Column(name = "room_capacity")
	private Integer roomCapacity;

	@Column(name = "location", length = 255)
	private String location;

	@OneToMany(mappedBy = "room")
	private Set<Schedule> schedules;
}
