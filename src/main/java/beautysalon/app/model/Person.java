package beautysalon.app.model;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "appointments")

public class Person {
@Id 
@GeneratedValue(strategy= GenerationType.IDENTITY)
private long id;
@Column(name = "first_name")
private String firstName;
@Column(name = "last_name")
private String lastName;
@Column(name = "number")
private long number;
@Column(name = "scheduled_appointment")
private Timestamp time;
public Person() {
	super();
}
public Person(long id, String firstName, String lastName, long number, Timestamp time) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.number = number;
	this.time = time;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public long getNumber() {
	return number;
}
public void setNumber(long number) {
	this.number = number;
}
public Timestamp getTime() {
	
	
	
	  return time;
	 
}
public void  setTime(Timestamp time) {
	this.time = time;
}






}
