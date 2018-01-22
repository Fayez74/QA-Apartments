package com.qa.apartment.persistance;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.persistence.ForeignKey;

@Entity
public class Schedule {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Temporal(TemporalType.DATE)
	@Column (length = 10)
	@NotNull
	private Date from_date;

	@Temporal(TemporalType.DATE)
	@Column (length = 10)
	@NotNull
	private Date to_date;

	// Table joins for many to many relationships
	@ManyToOne
	@Column (length = 10000)
	@JoinColumn(nullable = false, foreignKey = @ForeignKey(name = "person_personID"))
	private Person personID;

	@ManyToOne
	@Column (length = 10000)
	@JoinColumn(nullable = false, foreignKey = @ForeignKey(name = "room_roomIDs"))
	private Room roomID;

	public Schedule() {

	}

	public Schedule(Long id, Date from_date, Date to_date, Person personID) {
		super();
		this.id = id;
		this.from_date = from_date;
		this.to_date = to_date;
		this.personID = personID;
	}

	public Schedule(Long id, Date from_date, Date to_date, Person personID, Room roomID) {
		this.id = id;
		this.from_date = from_date;
		this.to_date = to_date;
		this.personID = personID;
		this.roomID = roomID;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFrom_date() {
		return from_date;
	}

	public void setFrom_date(Date from_date) {
		this.from_date = from_date;
	}

	public Date getTo_date() {
		return to_date;
	}

	public void setTo_date(Date to_date) {
		this.to_date = to_date;
	}

	public Person getPersonID() {
		return personID;
	}

	public void setPersonID(Person personID) {
		this.personID = personID;
	}

	public Room getRoomID() {
		return roomID;
	}

	public void setRoomID(Room roomID) {
		this.roomID = roomID;
	}
}
